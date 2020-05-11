/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iherança.Classes;

/**
 *
 * @author User
 */
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    {
        System.out.println("Bloco de nicializaação estatico");
    }
    {
        System.out.println("Bloco de inicialização 1");
    }
    {
        System.out.println("Bloco de inicialização 2");
    }
    
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public Pessoa(String nome, String epif) {
        this(nome);
        this.cpf = cpf;
    }
    
    public void imprime() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Bairro: "+this.endereco.getBairro());
        System.out.println("Rua: "+this.endereco.getRua());
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
