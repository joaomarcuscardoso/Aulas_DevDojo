/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author JoãoMarcus
 */
public class SortListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Willian");
        nomes.add("Suane");
        nomes.add("DevDojo");
        nomes.add("Breno");
        nomes.add("Bruno");
        nomes.add(0, "Ana");
        Collections.sort(nomes);
        List<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(1.3);
        numeros.add(1.9);
        numeros.add(2d);
        
        Collections.sort(numeros);
        for ( String nome : nomes) {
            System.out.println(nome);
        }
        for (Double numero : numeros) {
            System.out.println(numero);
        }
        
    }
}
