/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZDThread.classes;

import java.util.*;

/**
 *
 * @author JoãoMarcus
 */
public class ListaMembros {
    private Queue<String> emails = new LinkedList<>();
    private boolean aberta = true;
    
    public int getEmailsPendentes() {
        synchronized(emails) {
            return this.emails.size();
        }
    }

    public boolean isAberta() {
        return aberta;
    }

    public String obterEmailMembro() {
        String email = null;
        try {
           synchronized(this.emails) {
               while(this.emails.size() == 0) {
                   if(!aberta) return null;
                   System.out.println("lista vazia a thread: "+Thread.currentThread().getName() + " em modo wait");
                   this.emails.wait();
               }
               email = this.emails.poll();
           }
        } catch(InterruptedException e ) {
            e.printStackTrace();
        }
        return email;
    }
    
    public void adicionarEmailMembro(String email) {
        synchronized (this.emails) {
            this.emails.add(email);
            System.out.println("Email adicionado na lista!");
            System.out.println("Notificando as Threads que estão em espera: "+Thread.currentThread().getName());
            this.emails.notifyAll();
            
        }
    }
    
    public void fecharLista() {
        System.out.println("Notificando todas as threads e fechado a lista!!");
        aberta = false;
        synchronized(this.emails) {
            this.emails.notifyAll();
        }   
    }
    
}
