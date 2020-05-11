/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hescola;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Endereco l = new Endereco("Rua das conhas", "Conchas");

        Professores p = new Professores("Pasquale", "Português");

        Alunos a[] = new Alunos[5];

        a[0] = new Alunos("Pedro", 18);
        a[1] = new Alunos("Adalberto", 10);

        Seminario s = new Seminario(l, a, p, "Alaska");

        System.out.println(s);


    }
}
