/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fmodificadorestatico.Classes;

import blocodeincialização.classes;
import blocodeincialização.test.*;


/**
 *
 * @author User
 */
public class ClienteTest {
    public static void main(String[] args) {
        Clientes c = new Clientes();
        Clientes c2 = new Clientes();
        Clientes c3 = new Clientes();
        System.out.println("Exibindo possivéis parcelas: ");
        for(int parcela : c.getParcelas()) {
            System.out.println(parcela+"  - ");
        }
        
        System.out.println("Tamnho: "+Clientes.getParcelas().length);
        
    }
}
