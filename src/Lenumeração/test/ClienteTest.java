/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lenumeração.test;

import Lenumeração.Cliente;
import Lenumeração.TipoCliente;


/**
 *
 * @author User
 */
public class ClienteTest {
    public static void main(String[] args) {
       Cliente cliente = new Cliente("Ana", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.AVISTA);
       System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
       System.out.println(cliente); 
       
    }
}
