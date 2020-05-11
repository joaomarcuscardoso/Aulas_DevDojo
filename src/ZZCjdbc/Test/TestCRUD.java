/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZCjdbc.Test;

import ZZCjdbc.Class.Comprador;
import ZZCjdbc.db.CompradorDAO;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author JoãoMarcus
 */
public class TestCRUD {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        while(true) {
            menu();
            op = Integer.parseInt(teclado.nextLine());
            if(op ==0) {
                System.out.println("Saindo do sistema.");
                break;
            }
        
            if(op == 1) {
                menuComprador();
                op = Integer.parseInt(teclado.nextLine());

                CompradorCRUD.executar(op);
                
            }    
            if(op == 2) {
                menuCarro();
                op = Integer.parseInt(teclado.nextLine());

                CarroCRUD.executar(op);
                
            }    
        }
        
        
    }
    
    private static void menu() {
        System.out.println("Selecione um opção: ");
        System.out.println("1. Comprador");
        System.out.println("2. Carro");
        System.out.println("0. Sair");
        
       
    }
    
    
    public static void menuComprador() {
        System.out.println("Digite a opção para começar: ");
        System.out.println("1, Inserir Comprador: ");
        System.out.println("2, Atualiza Comprador: ");
        System.out.println("3, Listar todos os Comprador: ");
        System.out.println("4, Buscar Comprador por nome: ");
        System.out.println("5, Deletar Comprador: ");
        System.out.println("9, Voltar: ");
    }
    public static void menuCarro() {
        System.out.println("Digite a opção para começar: ");
        System.out.println("1, Inserir Carro: ");
        System.out.println("2, Atualiza Carro: ");
        System.out.println("3, Listar todos os Carro: ");
        System.out.println("4, Buscar Carro por nome: ");
        System.out.println("5, Deletar Carro: ");
        System.out.println("9, Voltar: ");
    }
}
