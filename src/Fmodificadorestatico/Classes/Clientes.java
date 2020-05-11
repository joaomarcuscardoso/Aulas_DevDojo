/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fmodificadorestatico.Classes;

import blocodeincialização.*;

/**
 *
 * @author User
 */
public class Clientes {
    private static int[] parcelas;
        
    static {// bloco de inicialização, antes do construtor
        System.out.println("Dentro do bloco de inicialização");
        parcelas = new int[10];
        for(int i=1;i<=10;i++) {
            parcelas[i-1] = i;   
        }
    }
    
    public Clientes() {
        System.out.println("Dentro do construtor");
        for(int parcela : this.getParcelas()) {
            System.out.print(parcela+"  - ");
        }
    }
    
    public static int[] getParcelas() {
        return parcelas;
    }
    
    
}
