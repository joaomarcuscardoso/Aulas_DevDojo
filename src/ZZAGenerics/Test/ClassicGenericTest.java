/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZAGenerics.Test;

import ZZAGenerics.Classes.Carro;
import ZZAGenerics.Classes.Computador;
import java.util.*;


/**
 *
 * @author JoãoMarcus
 */
public class ClassicGenericTest {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjectosAlugaveis<Carro> carroAlugavel = new ObjectosAlugaveis(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetosDisponivel();
        System.out.println("Usando Carro!!");
        carroAlugavel.devolverObjeto(carro);
        System.out.println("-----------");
        List<Computador> ComputadorDisponiveis = new ArrayList<>();
        
        ComputadorDisponiveis.add(new Computador("Intel"));
        ComputadorDisponiveis.add(new Computador("Apple"));
        ObjectosAlugaveis<Computador> computadorAlugavel =  new ObjectosAlugaveis<>(ComputadorDisponiveis);
        Computador c = computadorAlugavel.getObjetosDisponivel();
        System.out.println("Usando Computador!!");
        computadorAlugavel.devolverObjeto(c);
        
    }
}
class ObjectosAlugaveis<T> {
       private  List<T> objetosDisponiveis = new ArrayList<>();
       public ObjectosAlugaveis(List<T> objetosDisponiveis) {
           this.objetosDisponiveis = objetosDisponiveis;
           
       }

       public T getObjetosDisponivel() {
           T t = objetosDisponiveis.remove(0);
           System.out.println("Alugando Objeto: "+t);
           System.out.println("Objetos disponiveis: "+objetosDisponiveis);
           return t;

       }

       public void devolverObjeto(T t) {
           System.out.println("Devolvendo carro: "+t); 
           objetosDisponiveis.add(t);
           System.out.println("Carros disponiveis: "+objetosDisponiveis);

       }
}