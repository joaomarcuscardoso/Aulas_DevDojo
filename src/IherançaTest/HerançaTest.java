/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IherançaTest;

import Iherança.Classes.Endereco;
import Iherança.Classes.Funcionario;
import Iherança.Classes.Pessoa;



/**
 *
 * @author User
 */
public class HerançaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Joao");
        Endereco end = new Endereco();
        Funcionario f = new Funcionario("Augusto");
        
        
        p.setCpf("11111111");
        end.setBairro("Caminho Novo");
        end.setRua("Rua 25");
        p.setEndereco(end);

       
        p.imprime();
        System.out.println("---------------");
   
        f.setCpf("22222-222");
        f.setSalario(2000);
        f.setEndereco(end);
        f.imprime();
        
        f.imprimeReciboPagamento();
        
    }
}
