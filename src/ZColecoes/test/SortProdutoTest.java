/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test;

import ZColecoes.test.Classes.Produtos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author JoãoMarcus
 */
class ProdutoNomeComparator implements Comparator<Produtos> {

    @Override
    public int compare(Produtos o1, Produtos o2) {
       return o1.getNome().compareTo(o2.getNome());
    }
}

public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produtos> produtos = new ArrayList<>();
        Produtos[] produtosArray = new Produtos[4];

        
        
        Produtos produto1 = new Produtos("123", "Laptop Lenovo", 2000.0);
        Produtos produto2 = new Produtos("321", "Picanha", 26.0);
        Produtos produto3 = new Produtos("879", "Teclado Razer", 1000.0);
        Produtos produto4 = new Produtos("012", "Sansung galaxy S7 64GB", 3250.5);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtosArray[0] = produto1;
        produtosArray[1] = produto2;
        produtosArray[2] = produto3;
        produtosArray[3] = produto4;        


        //Collections.sort(produtos);
        Collections.sort(produtos, new ProdutoNomeComparator());
//        for(Produtos produto : produtos) {
//            System.out.println(produto);
//        }
        Arrays.sort(produtosArray, new ProdutoNomeComparator());
        
        for(Produtos produto : produtosArray) {
            System.out.println(produto);
        }
    }   
}
