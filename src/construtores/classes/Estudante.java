/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtores.classes;

/**
 *
 * @author User
 */
public class Estudante {
   private String matricula;
   private String nome;
   private double[] notas;
   private String dataMatricula;
   
   public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
      
       this();
       this.matricula = matricula;
       this.nome = nome;
       this.notas = notas;
       this.dataMatricula = dataMatricula;
       
   }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
   public Estudante() {
       System.out.println("Construtor");
   }
   
   public void imprime() {
       System.out.println(this.nome);
       System.out.println(this.matricula);
       for( double nota : notas) {
           System.out.print(nota + ", ");
       }
   }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
   
   
}
