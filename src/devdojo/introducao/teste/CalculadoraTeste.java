/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devdojo.introducao.teste;

import devdojo.introducao.Classes.Calculadora;

/**
 *
 * @author User
 */
public class CalculadoraTeste {
    public static void main(String[]args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros(10, 2);
        calc.subtrairDoisNumeros(15, 10);
        calc.multiplicaDoisNumeros(5,0);
        System.out.println(calc.divideDoisNumeros(5, 0));
        System.out.println("Imprime dois numeros divididos:");
        calc.imprimeDoisNumerosDivididos(20, 0);
       
        
        int[] numeros = new int[]{1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
        
    }   
}
