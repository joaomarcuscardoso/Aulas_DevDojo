/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devdojo.introducao.Classes;

/**
 *
 * @author User
 */
public class Calculadora {
    public void somaDoisNumeros(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public static void subtrairDoisNumeros(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    
    public void multiplicaDoisNumeros(int num1, int num2) {
      System.out.println(num1 * num2);  
    }
    
    public double divideDoisNumeros(double num1, double num2) {
        if( num2 != 0 ) {
            return num1 / num2;
        } 
        
        return 0;   
        
    }
    
    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if(num2 != 0) {
            System.out.println(num1 / num2);
            return;
        } 
        
        System.out.println("Não é possivel dividir por 0");   
    }
    
    public void alteraDoisNumeros(int num1, int num2, int num3) {
        num1 =30;
        num2 = 40;
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);
        System.out.println("num3: "+num3);
    }
    public void somaArray(int[] numeros) {
        int soma =0;
        for(int num : numeros ) {
            soma += num;
        }
        System.out.println("Soma: "+soma);
    
    }
    
    public void somaVarArgs(double valorDouble,int ... numeros) {
        int soma = 0;
        for(int num : numeros ) {
            soma += num;
        }
        System.out.println("Soma: "+soma);
        
    }
}
