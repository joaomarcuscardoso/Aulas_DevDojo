/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZEConcorrencia.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoãoMarcus
 */
public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        // Limite na capacidade da fila
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        Thread t1 = new Thread(new RemoverFromQueue(bq));
        
        bq.put("Willian");
        System.out.println(bq.peek());
        System.out.println("Tentando colocar outro valor");
        t1.start();
        bq.put("DevDojo");
        System.out.println("Inserido o utlimo valor");
    
    }
    
    static class RemoverFromQueue implements Runnable{
        private BlockingQueue<String> bq;

        public RemoverFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }
        
        
        
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " entrando em espera por 2 segundos ");
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Removendo o valor: "+bq.take());
                
            } catch (InterruptedException ex) {
                Logger.getLogger(BlockingQueueTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }   
        
    }
}
