/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocodeincialização.test;

import blocodeincialização.classes;

/**
 *
 * @author User
 */
public class ClienteTest {
    public static void main(String[] args) {
        classes c = new classes();
        System.out.println("Exibindo possivéis parcelas: ");
        for(int parcela : c.getParcelas()) {
            System.out.print(parcela+"  - ");
        }
    }
}
