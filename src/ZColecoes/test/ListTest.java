/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test;


import YSerializacao.test.Pessoas;
import java.util.*;

/**
 *
 * @author JoãoMarcus
 */

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Willian");
        nomes.add("devdojo");
        nomes2.add("Willian2");
        nomes2.add("devdojo2");        
        System.out.println(nomes.remove("devdojo"));
        int size = nomes.size();
        nomes.clear();
        nomes.addAll(nomes2);
        
        
        for( String nome : nomes) {
            System.out.println(nome);
            
        
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);

        
        
        for( Integer num : numeros) {
            System.out.println(num);
            
        
        }   
        
        
    }
}
