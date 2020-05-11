/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test;

import ZColecoes.test.Classes.Celular;

import static java.nio.file.Files.list;
import java.nio.file.*;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.*;
import static java.util.Collections.list;

/**
 *
 * @author JoãoMarcus
 */
public class ListCelularTest {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S7", "123");
        Celular celular2 = new Celular("Iphone", "321");
        Celular celular3 = new Celular("Sony Xperim", "019212");
        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);
        
        for(Celular celular : celularList) {
            System.out.println(celular);
        }
        Celular celular4 =new Celular("Galaxy S7", "123456");
        System.out.println(celularList.contains(celular1));
        
    }
}
