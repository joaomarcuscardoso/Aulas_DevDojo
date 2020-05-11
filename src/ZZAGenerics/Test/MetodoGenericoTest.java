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
public class MetodoGenericoTest {
    public static void main(String[] args) {
        criarArray(new Cachorro());
        
        
    }   
    
    public static <T extends Animal> void criarArray(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }
}
