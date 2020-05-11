/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test;

import ZColecoes.test.Classes.Consumidor;
import ZColecoes.test.Classes.Produtos;
import java.util.*;
import java.util.Map;

/**
 *
 * @author JoãoMarcus
 */
public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("j", "123");
        Consumidor consumidor2 = new Consumidor("DevDojo", "321");
        Produtos produto1 = new Produtos("123", "Laptop Lenovo", 2000.0);
        Produtos produto2 = new Produtos("321", "Picanha", 26.0);
        Produtos produto3 = new Produtos("879", "Teclado Razer", 1000.0);
        Produtos produto4 = new Produtos("012", "Sansung galaxy S7 64GB", 3250.5);
        
        Map<Consumidor,List<Produtos>> map = new HashMap<>();
        
        
        List<Produtos> produtosCon1 = new ArrayList<>();
        produtosCon1.add(produto1);
        produtosCon1.add(produto2);
        List<Produtos> produtosCon2 = new ArrayList<>();
        produtosCon2.add(produto3);
        produtosCon2.add(produto4);
        
        
        map.put(consumidor, produtosCon1);
        map.put(consumidor2, produtosCon2);
        for(Map.Entry<Consumidor, List<Produtos>> entry : map.entrySet()) {
            System.out.println("Cliente: "+entry.getKey().getNome());
            System.out.println("Produtos comprado: ");
            for(Produtos produto : entry.getValue()) {
                System.out.println(produto.getNome());
                
            }
            System.out.println("-----------------------------------");
        }
    }
}
