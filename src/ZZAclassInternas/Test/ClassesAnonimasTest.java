/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZAclassInternas.Test;

import ZZAGenerics.Classes.Carro;
import java.util.*;

/**
 *
 * @author JoãoMarcus
 */
class Animal {
    public void andar() {
        System.out.println("Andando");
    }
}
public class ClassesAnonimasTest {
    public static void main(String[] args) {
        Animal a = new Animal(){
            public void andar() {
                System.out.println("Andando anonimamente");
            }
            public void comer() {
                System.out.println("Comendo");
            }
        };
        a.andar();
        List<Carro> carroList = new ArrayList<>();
        carroList.add(new Carro("BWM"));
        carroList.add(new Carro("Gol"));
        Collections.sort(carroList, new Comparator<Carro>(){
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
            
        });
        System.out.println(carroList);
        
    }
    
    
}


