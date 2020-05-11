/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ninterfaces.classes;

import static Ninterfaces.classes.Tributavel.imposto;

/**
 *
 * @author User
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Produtos implements Tributavel, Transportavel {
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;
    
    @Override
    public void calcularFrete() {
        this.valorFrete = this.peso / peso * 0.1; 
    }
    
    @Override
    public void calcularImposto() {
        precoFinal = this.preco + (this.preco + imposto);
    }

    public Produtos(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    
    
    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", peso=" + peso + ", preco=" + preco +", precoFinal= "+precoFinal+", valorFrete = "+valorFrete+
                '}';
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}


