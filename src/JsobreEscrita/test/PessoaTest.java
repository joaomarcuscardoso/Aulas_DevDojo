/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JsobreEscrita.test;

import JsobreEscrita.Pessoa;



/**
 *
 * @author User
 */
public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina");
        p.setIdade(300);
        System.out.println(p.toString());
        
    }
}
