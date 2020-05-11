/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreCarregaMetodos.test;

import sobreCarregaMetodos.classes.Funcionarios;

/**
 *
 * @author User
 */
public class FuncionarioTest {
    public static void main(String[]args) {
        Funcionarios func = new Funcionarios();
        func.init("Ron", "1111111", "200" ,2000.00);
        func.imprime();
        
    }
}
