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
import java.util.List;

/**
 *
 * @author JoãoMarcus
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        
        // -(ponto de inserçãoo) -1), -1 -1 = -2
        Collections.sort(numeros);
        // 0 ,1 ,2 ,3
        // 0, 2,3 ,4
        
        
        System.out.println(Collections.binarySearch(numeros, 1));
        //System.out.println(numeros.get(Collections.binarySearch(numeros, 2)));
        List<Produtos> produtos = new ArrayList<>(); 
        Produtos produto1 = new Produtos("123", "Laptop Lenovo", 2000.0);
        Produtos produto2 = new Produtos("321", "Picanha", 26.0);
        Produtos produto3 = new Produtos("879", "Teclado Razer", 1000.0);
        Produtos produto4 = new Produtos("012", "Sansung galaxy S7 64GB", 3250.5);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
       
        Collections.sort(produtos, new ProdutoNomeComparator());
        
        Produtos produto5 = new Produtos("000", "Antena", 50);
        
        

        for(Produtos produto : produtos) {
            System.out.println(produto);
        }
        
        System.out.println(Collections.binarySearch(produtos, produto5, new ProdutoNomeComparator()));
        Integer[] arrayInteger = new Integer[4]; 
        arrayInteger[0] = 2;
        arrayInteger[1] = 0;
        arrayInteger[2] = 4;
        arrayInteger[3] = 3;
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.binarySearch(arrayInteger, 1));
        // precisa do sort primeiro para o resultado ser previsivél;
    }   
        
    
}
