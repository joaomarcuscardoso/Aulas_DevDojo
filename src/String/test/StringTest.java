/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String.test;

/**
 *
 * @author JoãoMarcus
 */
public class StringTest {
    public static void main(String[] args) {
        String nome = "willian";
        nome = nome.concat(" sUane");
        // String constam pool
        
        String teste = "           Siuru       ";
        System.out.println(teste.charAt(3));
        System.out.println(teste.equals(nome));
        System.out.println(teste.length());
        System.out.println(teste.replace('S', 'O'));
        System.out.println(teste.toUpperCase());
        System.out.println(teste.toLowerCase());
        System.out.println(teste.substring(0,2));
        System.out.println(nome);
        System.out.println(teste.trim());
        
        
        
    }
}
