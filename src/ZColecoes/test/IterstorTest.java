/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test;

import ZColecoes.test.Classes.Produtos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author JoãoMarcus
 */
public class IterstorTest {
    public static void main(String[] args) {
       List<Produtos> produtos = new ArrayList<>(); 
        Produtos produto1 = new Produtos("123", "Laptop Lenovo", 2000.0, 0 );
        Produtos produto2 = new Produtos("321", "Picanha", 26.0, 10);
        Produtos produto3 = new Produtos("879", "Teclado Razer", 1000.0, 5);
        Produtos produto4 = new Produtos("012", "Sansung galaxy S7 64GB", 3250.5, 0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
       
        Iterator<Produtos> produtoIterator = produtos.iterator();
        // hasNext() // next();
        while(produtoIterator.hasNext()) {           
            if(produtoIterator.next().getQuantidade() == 0) {
               produtoIterator.remove();
            }
        }
        
        System.out.println(produtos.size());
        
    }
}
