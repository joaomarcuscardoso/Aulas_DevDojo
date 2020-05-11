/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test.Classes;

import java.util.Objects;

/**
 *
 * @author JoãoMarcus
 */
public class Produtos implements Comparable<Produtos> {

    private String serial_numer;
    private String nome;
    private Double preco;
    private int quantidade;
    
    public Produtos(String serial_numer, String nome, double preco) {
        this.serial_numer = serial_numer;
        this.nome = nome;
        this.preco = preco;
    }

    public Produtos(String serial_numer, String nome, Double preco, int quantidade) {
        this.serial_numer = serial_numer;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.serial_numer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produtos other = (Produtos) obj;
        if (!Objects.equals(this.serial_numer, other.serial_numer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produtos{" + "serial_numer=" + serial_numer + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
    
    public String getSerial_numer() {
        return serial_numer;
    }
    
    

    public void setSerial_numer(String serial_numer) {
        this.serial_numer = serial_numer;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    @Override
    public int compareTo(Produtos outroObjeto) {
        // negativo se thisObject < outroObjeto
        // Zero se ThisObject == outroObjeto
        // Positivo se thisObject > outroObjeto
        //return this.getNome().compareTo(outroObjeto.getNome());
        //return this.preco.compareTo(outroObjeto.getPreco());
        Double d = preco;
        return d.compareTo(outroObjeto.getPreco());
    }
    
    
}
