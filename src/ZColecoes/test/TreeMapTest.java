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
public class TreeMapTest {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
        
        System.out.println(map.headMap("C", true));

        
        
    }
}
