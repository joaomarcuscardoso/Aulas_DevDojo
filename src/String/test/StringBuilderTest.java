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
public class StringBuilderTest {
   public static void main(String[] args) {
       String s = "Uma frase comum";
       StringBuilder sb = new StringBuilder();
       sb.append("Uma frase comum"); // chama o metodo toString
       
       System.out.println(sb.delete(0,2));
       
       
   } 
}
