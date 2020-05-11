/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudante;



/**
 *
 * @author User
 */
public class NewClass {
    public static void main(String[]args) {
        Info est = new Info();
        est.info_estudante();
        est.setNome("Joao");
        System.out.println(est.getNome());
        System.out.println("Aprovado: "+est.isAprovado());
    }
}
