/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZEConcorrencia.Test;

import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author JoãoMarcus
 */
class MapReadWrite {
    private Map<String, String> map = new LinkedHashMap<>();
    public void put(String key, String value) {
        map.put(key, value);
    }
    public Object[] allKeys() {
        return map.keySet().toArray();
    }
}
public class MapReadWriteLockTest {
    private final static MapReadWrite mapReadWrite = new MapReadWrite();
    private static final ReentrantReadWriteLock rv1 = new ReentrantReadWriteLock();
    
    public static void main(String[] args) {
       Thread t1 = new Thread(new Write());
       Thread t2 = new Thread(new ReadA());
       Thread t3 = new Thread(new ReadB());
       t1.start();
       t2.start();
       t3.start();
    } 
    
    static class Write implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<100;i++) {
                rv1.writeLock().lock();
                try {
                    mapReadWrite.put(String.valueOf(i), String.valueOf(i));
                } finally {
                    rv1.writeLock().unlock();
                }
            
            }
        }     
    }
    
    static class ReadA implements Runnable {

        @Override
        public void run() {
            for(int i=0;i<10;i++) {
                rv1.readLock().lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " "+Arrays.toString(mapReadWrite.allKeys()));
               
                
                } finally {
                    rv1.readLock().unlock();
                }
            }
        }
        
    }
    static class ReadB implements Runnable {

        @Override
        public void run() {
            for(int i=0;i<10;i++) {
                rv1.readLock().lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " "+Arrays.toString(mapReadWrite.allKeys()));
               
                
                } finally {
                    rv1.readLock().unlock();
                }
            }
        }
        
    }
    
}
