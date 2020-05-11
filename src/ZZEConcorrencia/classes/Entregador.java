/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZEConcorrencia.classes;

import ZZDThread.classes.*;

/**
 *
 * @author JoãoMarcus
 */
public class Entregador implements Runnable {
    private ListaMembros listaMembros;
    
    public Entregador(ListaMembros listaMembros) {
        this.listaMembros = listaMembros;
    }
    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(" Começando o trabalho de entrega ");
        int qtdPendente = listaMembros.getEmailsPendentes();
        boolean aberta = listaMembros.isAberta();
        while( aberta || qtdPendente > 0) {
            try {
                String email = listaMembros.obterEmailMembro();
                if(email != null) {
                    System.out.println(" Enviando email para "+email);
                    Thread.sleep(2000);
                    System.out.println("Envio para "+ email + " concluido com sucesso!!");
                }
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            aberta = listaMembros.isAberta();
            qtdPendente = listaMembros.getEmailsPendentes();
            
        }
        System.out.println("Atividade finalizadas");
    }
    
}
