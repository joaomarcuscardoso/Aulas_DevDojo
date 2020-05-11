/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test;

import ZColecoes.test.Classes.Celular;

/**
 *
 * @author JoãoMarcus
 */
public class EqualsTest {
    public static void main(String[] args) {
        String nome1 = "Willian Suane";
        String nome2 = new String ("Willian Suane");
        System.out.println(nome1.equals(nome2));
        
        
        Celular c1 = new Celular("Iphone", "1234");
        Celular c2 = new Celular("Iphonex", "12345");
        System.out.println(c2.equals(c1));
    
    }
}
