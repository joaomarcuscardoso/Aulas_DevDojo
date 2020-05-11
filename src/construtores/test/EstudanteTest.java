/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtores.test;

import construtores.classes.Estudante;

/**
 *
 * @author User
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("12212112", "Carlitos", new double[]{5,7,9}, "11/04/02");
        est.imprime();
        
    }
}
