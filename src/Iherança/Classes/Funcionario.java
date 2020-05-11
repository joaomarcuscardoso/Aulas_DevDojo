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
public class Funcionario extends Pessoa {
    private double salario;
    {
        System.out.println("Bloco de construtor de funcionario 1");
    }
    {
        System.out.println("Bloco de  construtor de funcionario 2");
    }
    {
        System.out.println("Bloco de  construtor de funcionario estatico");
    }

    public Funcionario(String nome) {
        super(nome);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void imprime() {
        super.imprime();
        System.out.println("Salario: "+this.salario);
    }
    
    public void imprimeReciboPagamento() {
        System.out.println("EU "+super.nome+" recebi o pagamento de "+this.salario);
    }
    
}
