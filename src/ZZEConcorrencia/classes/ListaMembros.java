/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZEConcorrencia.classes;

import ZZDThread.classes.*;
import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author JoãoMarcus
 */
public class ListaMembros {
    private Queue<String> emails = new LinkedList<>();
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition conditionLock = lock.newCondition();
    private boolean aberta = true;
    
    public int getEmailsPendentes() {
        lock.lock();
        try {
            return this.emails.size();
        } finally {
            lock.unlock();
        }
    }

    public boolean isAberta() {
        return aberta;
    }

    public String obterEmailMembro() {
        String email = null;
        try {
           lock.lock();
           
            while(this.emails.size() == 0) {
                if(!aberta) return null;
                System.out.println("lista vazia a thread: "+Thread.currentThread().getName() + " em modo wait");
                conditionLock.await();
            }
            email = this.emails.poll();

        } catch(InterruptedException e ) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return email;
    }
    
    public void adicionarEmailMembro(String email) {
        lock.lock();
        try {
            this.emails.add(email);
            System.out.println("Email adicionado na lista!");
            System.out.println("Notificando as Threads que estão em espera: "+Thread.currentThread().getName());
            conditionLock.signalAll();
        } finally {
            lock.unlock();
        }
            
    }
    
    public void fecharLista() {
        System.out.println("Notificando todas as threads e fechado a lista!!");
        aberta = false;
        lock.lock();
        try {
          conditionLock.signalAll();

        } finally {
            lock.unlock();
        }
    }
    
}
