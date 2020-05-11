/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MclassesAbstratas.classes.test;

import MclassesAbstratas.classess.Funcionario;
import MclassesAbstratas.classess.Gerente;
import MclassesAbstratas.classess.Vendedor;

/**
 *
 * @author User
 *
 */
public class FuncionarioTest {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Marcos", "2012-2", 1500, 5000);
        Gerente g = new Gerente("ANA", "2012-2", 2000);
       
        v.calcularSalario();
        g.calcularSalario();
        
        System.out.println(v);
        System.out.println(g);
    }
}
