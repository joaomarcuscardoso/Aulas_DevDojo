/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZAGenerics.Classes;

/**
 *
 * @author JoãoMarcus
 */
public class Carro {
    private String nome;
    
    public Carro(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Carro("+
                "nome='"+ nome + "'\'+"
                + '}';
        
    }
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
