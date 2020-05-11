/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test;

import java.util.*;

/**
 *
 * @author JoãoMarcus
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("D");
        queue.add("A");
        queue.add("C");
        queue.add("B");
        
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
