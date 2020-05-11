/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test;

import ZColecoes.test.Classes.Celular;
import ZColecoes.test.Classes.Produtos;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author JoãoMarcus
 */
 class CelularNomeComparator implements Comparator<Celular> {
    @Override
    public int compare(Celular o1, Celular o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class TreeSetTest {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos("123", "Laptop Lenovo", 2000.0);
        Produtos produto2 = new Produtos("321", "Picanha", 26.0);
        Produtos produto3 = new Produtos("879", "Teclado Razer", 1000.0);
        Produtos produto4 = new Produtos("012", "Sansung galaxy S7 64GB", 3250.5);
        Produtos produto5 = new Produtos("012", "Sansung galaxy S7 64GB", 3250.5);
        Celular celular = new Celular("iPhone 7", "1234");
        NavigableSet<Produtos> produtoNavigableSet = new TreeSet<>();
        NavigableSet<Celular> celularNavigableSet = new TreeSet<>(new CelularNomeComparator());
        //celularNavigableSet.add(celular);
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);
        
        
        for(Produtos produto : produtoNavigableSet) {
            System.out.println(produto);
        }
        
        System.out.println("-----------------");
        // lower < 
        // floor <=
        // higher >
        // ceiling >=
        // desending ordem inversa
        // pollLast vai retorna o ultimo e tira da lista
        
        System.out.println(produtoNavigableSet.floor(produto5));
        
    }
 
}
