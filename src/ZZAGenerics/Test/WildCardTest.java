/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZAGenerics.Test;

import java.util.*;

/**
 *
 * @author JoãoMarcus
 */
abstract class Animal{
    public  abstract void consulta();
}
class Cachorro extends Animal implements Comparable {
    
    @Override
    public void consulta() {
        System.out.println("Consultando o cachorro!! ");
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando o gato!! ");

    }
    
}


public class WildCardTest {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        //consultarAnimais(gatos);
        consultarAnimais(cachorros);
        List<Cachorro> cachorroList = new ArrayList();
        cachorroList.add(new Cachorro());
        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());
        //consultarAnimaisList(cachorroList);
       //List<Animal> animalList = new ArrayList<>();
       consultarAnimaisList(cachorroList); 
       consultarAnimaisList(gatoList);
       ordenarLista(cachorroList); 
    }
    public static void consultarAnimais(Animal[] animals) {
        for(Animal animal : animals) {
            animal.consulta();
        }       
    }
    // type erasure | ?
    public static void consultarAnimaisList(List<? extends Animal> animals) {
        for(Animal animal : animals) {
            animal.consulta();
        }   
    
    }
    
    public static void consultarCachorroList(List <? super Cachorro> cachorroList) {
        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro();
        Object o = new Cachorro();
        cachorroList.add(new Cachorro());
        
        
    }
    
    public static void ordenarLista(List<? extends Comparable> lista) {
        Collections.sort(lista);
    }
    
}



