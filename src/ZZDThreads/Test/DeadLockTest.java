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
public class DeadLockTest {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    public static void main(String[] args) {
        new ThreadExemplo1().start();
        new ThreadExemplo2().start();
    }
   
    private static class ThreadExemplo1 extends Thread{
        public void run() {
            synchronized(lock1) {
                System.out.println("Thread 1: Segurando lock 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DeadLockTest.class.getName()).log(Level.SEVERE, null, ex);
                }    
                System.out.println("Esperando pelo lock 2");
                synchronized(lock2) {
                    System.out.println("Thread 1: Segurando lock 1 e lock 2");
                    
                }
            }
        }
    }

    private static class ThreadExemplo2 extends Thread{
        public void run() {
            synchronized(lock1) {
                System.out.println("Thread 1: Segurando lock 2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DeadLockTest.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Esperando pelo lock 2");
                synchronized(lock2) {
                    System.out.println("Thread 1: Segurando lock 2 e lock 1");
                  
                }
            }
        }
    }
    
}
