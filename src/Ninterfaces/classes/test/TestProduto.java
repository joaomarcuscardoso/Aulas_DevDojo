/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ninterfaces.classes.test;

import Ninterfaces.classes.Produtos;

/**
 *
 * @author User
 */
public class TestProduto {
    public static void main(String[] args) {
        Produtos p = new Produtos("Notebook", 4, 3000);
        p.calcularImposto();
        p.calcularFrete();
        System.out.println(p);
    }
}
