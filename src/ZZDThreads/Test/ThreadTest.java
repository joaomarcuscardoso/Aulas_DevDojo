/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZDThreads.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoãoMarcus
 */
// Usermon x User
class ThreadExemplo extends Thread {
    private char c;
    public ThreadExemplo(char c) {
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println("Thread executando: "+Thread.currentThread().getName()); 
        
        for(int i = 0; i<1000; i++) {
            System.out.print(c);
            if(i % 100 == 0) {
                System.out.println();
            }
        }
    }
}
class ThreadExemploRunnable implements Runnable {
    private char c;
    public ThreadExemploRunnable(char c) {
        this.c = c;
    }
    @Override
    public void run() {        
        System.out.println("Thread executando: "+Thread.currentThread().getName()); 
        
        for(int i = 0; i<1000; i++) {
            System.out.print(c);
            if(i % 100 == 0) {
                System.out.println();
            }
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ThreadExemploRunnable.class.getName()).log(Level.SEVERE, null, ex);
//            }
            //Thread.yield();
        }
        
        
    }

}

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException  {
        System.out.println(Thread.currentThread().getName()); 
//        ThreadExemplo t1 = new ThreadExemplo('A');
//        ThreadExemplo t2 = new ThreadExemplo('B');
//        ThreadExemplo t3 = new ThreadExemplo('C');
//        ThreadExemplo t4 = new ThreadExemplo('D');

        Thread t1 = new Thread(new ThreadExemploRunnable('A'));
        Thread t2 = new Thread(new ThreadExemploRunnable('B'));
        Thread t3 = new Thread(new ThreadExemploRunnable('C'));
        Thread t4 = new Thread(new ThreadExemploRunnable('D'));
        t3.setPriority(5);
        t1.start();
        t1.join();
        t2.start();
        t3.start();
        t4.start();
    
    }
}
