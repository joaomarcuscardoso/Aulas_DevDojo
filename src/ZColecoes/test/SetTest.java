/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test;

import ZColecoes.test.Classes.Produtos;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author JoãoMarcus
 */
public class SetTest {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos("123", "Laptop Lenovo", 2000.0);
        Produtos produto2 = new Produtos("321", "Picanha", 26.0);
        Produtos produto3 = new Produtos("879", "Teclado Razer", 1000.0);
        Produtos produto4 = new Produtos("012", "Sansung galaxy S7 64GB", 3250.5);
        Produtos produto5 = new Produtos("012", "Sansung galaxy S7 64GB", 3250.5);
        Set<Produtos> produtoSet = new HashSet<>();
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);
        for(Produtos p : produtoSet) {
            System.out.println(p);
        }
    
    
    }
 
}
