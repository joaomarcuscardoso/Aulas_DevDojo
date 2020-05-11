/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZAGenerics.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoãoMarcus
 */
public class GenericTest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("String");
        lista.add("String");
        lista.add("Willian Suane");
        
        for(String obj : lista) {
            System.out.println(obj);
        }
        
        add(lista, 1L);
        
        
    }
    
    public static void add(List lista, Long l) {
        lista.add(l);
    }
}
