/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hescola;

/**
 *
 * @author User
 */
public class Alunos {
    private Seminario seminario;
    private String nome;
    private int idade;
    
    public Alunos() {
    }

    public Alunos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format("\nNome: %s - Idade %d",
                this.getNome(),
                this.getIdade()
        );
    }
}
