/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lenumeração;

/**
 *
 * @author User
 */
public class Cliente {
    public enum TipoPagamento {
        AVISTA, APRAZO;
    }
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;
    
    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }



    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", tipoCliente=" + tipoCliente.getNome() + ", tipoPagamento=" + tipoPagamento + 
                ", numero="+tipoCliente.getTipo()+
                '}';
    }



    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipo) {
        this.tipoCliente = tipoCliente;
    }

    
    
    
}

