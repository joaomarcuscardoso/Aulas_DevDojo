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
public class ClassesNaoGenericaTest {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por um mes");
        carroAlugavel.devolverCarro(carroAlugado);
        System.out.println("----------------------");
        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
        Computador computador = computadorAlugavel.getComputadorDisponivel();
        System.out.println("Usando o pc");
        computadorAlugavel.devolverComputador(computador);
    }
}
class CarroAlugavel {
       private  List<Carro> carrosDisponiveis = new ArrayList<>();

       {
           carrosDisponiveis.add(new Carro("Gol"));
           carrosDisponiveis.add(new Carro("BMW"));
       }

       public Carro getCarroDisponivel() {
           Carro c = carrosDisponiveis.remove(0);
           System.out.println("Alugando carro: "+c);
           System.out.println("Carros disponiveis: "+carrosDisponiveis);
           return c;

       }

       public void devolverCarro(Carro c) {
           System.out.println("Devolvendo carro: "+c); 
           carrosDisponiveis.add(c);
           System.out.println("Carros disponiveis: "+carrosDisponiveis);

       }
}
class ComputadorAlugavel {
       private  List<Computador> ComputadorDisponiveis = new ArrayList<>();

       {
           ComputadorDisponiveis.add(new Computador("Intel"));
           ComputadorDisponiveis.add(new Computador("Apple"));
       }

       public Computador getComputadorDisponivel() {
           Computador c = ComputadorDisponiveis.remove(0);
           System.out.println("Alugando PC: "+c);
           System.out.println("Carros PC: "+ComputadorDisponiveis);
           return c;

       }

       public void devolverComputador(Computador c) {
           System.out.println("Devolvendo PC: "+c); 
           ComputadorDisponiveis.add(c);
           System.out.println("PC disponiveis: "+ComputadorDisponiveis);

       }   
}
