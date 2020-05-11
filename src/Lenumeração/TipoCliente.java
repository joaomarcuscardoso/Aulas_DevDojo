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
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica"){
        // constat especif class boy
        public String getId() {
            return "B";
        }
           
    };
    
    
    private int tipo;
      private String nome;
      
    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }
    
    
    public String getId() {
       return "A"; 
    }
    
    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
    

}
