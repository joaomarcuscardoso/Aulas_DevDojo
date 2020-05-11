/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZDThreads.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author JoãoMarcus
 */
class ListaNomes{
    private List<String> nomes = Collections.synchronizedList(new LinkedList<>());

    public synchronized void add(String nome) {
        nomes.add(nome);
    }
    
    public synchronized void removerPrimeiro() {
        if(nomes.size() > 0) {
            System.out.println(nomes.remove(0));
            
        }
    }

}
public class ThreadSafeTest {
    public static void main(String[] args) {
        ListaNomes nome = new ListaNomes();
        nome.add("Willian Suane");
        class RemoverDeNomes extends Thread {
            public void run() {
                nome.removerPrimeiro();
            }
        }
        
        new RemoverDeNomes().start();
        new RemoverDeNomes().start();
        
    
    }
}
