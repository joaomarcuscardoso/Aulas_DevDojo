/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreCarregaMetodos.classes;

/**
 *
 * @author User
 */
public class Funcionarios {
    private String nome;
    private String cpf;
    private String rg;
    private double salario;
    
    // construtor igual o nome da classes
    public Funcionarios() {
    
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getRp() {
        return this.rg;
    }
    public double getSalario() {
        return this.salario;
    }
    public void imprime() {
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Rg: "+this.rg);
        System.out.println("Salario: "+salario);
    }
    public void init(String nome, String cpf, String rg ,double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }
    public void init(/*String nome, String cpf,*/String rg /*,double salario*/) {
        //init(nome, cpf, salario);
        this.rg = rg;
        
    }
    
    
}
