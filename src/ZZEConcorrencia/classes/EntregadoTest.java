/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZEConcorrencia.classes;

import ZZDThread.classes.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JoãoMarcus
 */
public class EntregadoTest {
    public static void main(String[] args) {
        ListaMembros listaMembros = new ListaMembros();
        Thread t1 = new Thread(new Entregador(listaMembros), "Entregador 1");
        Thread t2 = new Thread(new Entregador(listaMembros), "Entregador 2");
        
        t1.start();
        t2.start();
        while(true) {
            String email = JOptionPane.showInputDialog("Digite o email do membro");
            if(email == null || email.isEmpty()) {
                listaMembros.fecharLista();
                break;
            }
            listaMembros.adicionarEmailMembro(email);
        }
    }
}
