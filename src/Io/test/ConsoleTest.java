/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Io.test;

import java.io.Console;

/**
 *
 * @author JoãoMarcus
 */
public class ConsoleTest {
    public static void main(String[] args) {
        
        Console c = System.console();
        char[] pw = c.readPassword("%s", "pw: ");
       for(char pass : pw) {
         c.format("%c", pass);
         
       
       }
       c.format("\n");
       String texto;
       while(true) {
           texto = c.readLine("%s", "Digiite: ");
           c.format("%s", retorno(texto));
       }
       
    }
    
    public static String retorno(String arg1) {
        return arg1;
    }
}
