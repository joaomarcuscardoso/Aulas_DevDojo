/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZCjdbc.Test;

import ZZCjdbc.Class.Carro;
import ZZCjdbc.Class.Comprador;
import ZZCjdbc.db.CarroDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JoãoMarcus
 */
public class CarroCRUD {
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
        Carro c = new Carro();
        System.out.println("Nome: ");
        c.setNome(teclado.nextLine());
        System.out.println("Placa: ");
        c.setPlaca(teclado.nextLine());
        System.out.println("Selecione um dos compradores: ");
        List<Comprador> compradorList = CompradorCRUD.listar();
        c.setComprador(compradorList.get(Integer.parseInt(teclado.nextLine())));
        CarroDAO.save(c);
    }
    
    private static void atualizar() {
        System.out.println("Selecione um dos compradores abaixo: ");
        List<Carro> compradorList = listar();
        Carro c = compradorList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Novo nome ou enter para manter o nome: ");
        String nome = teclado.nextLine();
        System.out.println("Novo Placa ou enter para manter o nome: ");
        String placa = teclado.nextLine();
        if(!nome.isEmpty()) {
            System.out.println("Entrou");
            c.setNome(nome);
        }
        if(!placa.isEmpty()) {
            c.setPlaca(placa);
            

        }
        
        CarroDAO.update(c);
    
    }
    
    
    
    private static List<Carro> listar() {
        List<Carro> compradorList = CarroDAO.selectAll();
        
        for(int i = 0; i < compradorList.size();i++) {
            Carro c = compradorList.get(i);
            System.out.println("["+i+"] " + c.getNome()+ " "+ c.getPlaca());
        }
        return compradorList;
    }
    public static void buscarPorNome(String nome) {
        
        
        
        List<Carro> compradorList = CarroDAO.searchByName(nome);
        if(compradorList.size() == 0) {
            System.out.println("Não existe o nome que você digitou!!");
        }
        
        for(int i = 0; i < compradorList.size(); i++) {
            Carro c = compradorList.get(i);
            System.out.println("["+i+"] " + c.getNome()+ " "+ c.getPlaca());        
        }
        System.out.println("----------------------------------");
       
    }
    public static void deletar() {
        System.out.println("Selecione um dos compradores abaixo para deletar: ");
        List<Carro> compradorList = listar();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza S/N ");
        for(int i=0; i  < compradorList.size(); i++) {
            
            String op = teclado.nextLine();
            if(op.startsWith("S")) {
                CarroDAO.delete(compradorList.get(index));
            }
        
        }
    }
}
