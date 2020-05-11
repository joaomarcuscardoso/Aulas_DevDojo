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
public class Endereco {
    private String rua;
    private String bairro;

    public void imprime() {
        System.out.println("Rua: "+this.rua);
        Pessoa p = new Pessoa("aaaa");
 
        
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
}
