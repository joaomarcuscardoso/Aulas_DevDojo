/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MclassesAbstratas.classess;

/**
 *
 * @author User
 */
public abstract class Funcionario extends Pessoa {
   protected String nome;
   protected String clt;
   protected double salario;

   public Funcionario() {
       
   }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", clt=" + clt + ", salario=" + salario + '}';
    }
    @Override
    public void imprime() {
        System.out.println("Dentro do imprime de funcionario");
    }
   
   public Funcionario(String nome, String clt, double salario) {
       this.nome = nome;
       this.clt = clt;
       this.salario = salario;
   }
   
   public void calcularSalario() {
       this.salario = salario + (salario * 0.1);
   }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
}
