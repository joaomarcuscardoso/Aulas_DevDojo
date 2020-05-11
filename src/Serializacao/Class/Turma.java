/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacao.Class;

import java.io.Serializable;

/**
 *
 * @author JoãoMarcus
 */
public class Turma implements Serializable {
    private String nome;

    public Turma(String nome) {
        this.nome = nome;
    }
    
    @Override 
    public String toString() {
        return "Tumar("+
                "nome'" + nome + '\'' +
                ')';
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
