/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opolimorfismo.Test;

import Opolimorfismo.Classes.Funcionario;
import Opolimorfismo.Classes.Gerente;
import Opolimorfismo.Classes.RelatorioPagamento;

import Opolimorfismo.Classes.Vendedor;


/**
 *
 * @author User
 */
public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Oswaldo", 5000, 2000);
        Vendedor v = new Vendedor("Yuri", 2000, 20000);
        RelatorioPagamento r =  new RelatorioPagamento();
      
        r.relatorioPagamentoGeral(g);
        System.out.println("----------------------------------");
        r.relatorioPagamentoGeral(v);
        

    }
}
