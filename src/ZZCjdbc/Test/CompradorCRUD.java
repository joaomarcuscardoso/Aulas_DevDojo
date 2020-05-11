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

/**
 *
 * @author JoãoMarcus
 */
public class CompradorCRUD {
    private static Scanner teclado = new Scanner(System.in);
   
    public static void executar(int op) {
        switch(op) {
            case 1:
                inserir();
                break;
            case 2:
                atualizar();
                break;
            case 3:
                listar();
                break;
            case 4:
                System.out.println("Digite um nome para buscar: ");
                
                buscarPorNome(teclado.nextLine());
                break;
            case 5:
                deletar();
                break;

        }
    }
    private static void inserir() {
        Comprador c = new Comprador();
        System.out.println("Nome: ");
        c.setNome(teclado.nextLine());
        System.out.println("Cpf: ");
        c.setCpf(teclado.nextLine());
        CompradorDAO.save(c);
    }
    
    private static void atualizar() {
        System.out.println("Selecione um dos compradores abaixo: ");
        List<Comprador> compradorList = listar();
        Comprador c = compradorList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Novo nome ou enter para manter o nome: ");
        String nome = teclado.nextLine();
        System.out.println("Novo cpf ou enter para manter o nome: ");
        String cpf = teclado.nextLine();
        if(!nome.isEmpty()) {
            System.out.println("Entrou");
            c.setNome(nome);
        }
        if(!cpf.isEmpty()) {
            c.setCpf(cpf);
            System.out.println("Entrou");

        }
        
        CompradorDAO.update(c);
    
    }
    
    
    
    public static List<Comprador> listar() {
        List<Comprador> compradorList = CompradorDAO.selectAll();
        
        for(int i = 0; i < compradorList.size();i++) {
            Comprador c = compradorList.get(i);
            System.out.println("["+i+"] " + c.getNome()+ " "+ c.getCpf());
        }
        return compradorList;
    }
    public static void buscarPorNome(String nome) {
        
        
        
        List<Comprador> compradorList = CompradorDAO.searchByName(nome);
        if(compradorList.size() == 0) {
            System.out.println("Não existe o nome que você digitou!!");
        }
        
        for(int i = 0; i < compradorList.size(); i++) {
            Comprador c = compradorList.get(i);
            System.out.println("["+i+"] " + c.getNome()+ " "+ c.getCpf());        
        }
        System.out.println("----------------------------------");
       
    }
    public static void deletar() {
        System.out.println("Selecione um dos compradores abaixo para deletar: ");
        List<Comprador> compradorList = listar();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza S/N ");
        for(int i=0; i  < compradorList.size(); i++) {
            
            String op = teclado.nextLine();
            if(op.startsWith("S")) {
                CompradorDAO.delete(compradorList.get(index));
            }
        
        }
    }
}
