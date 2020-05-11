/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test.Classes;

import java.util.Comparator;

/**
 *
 * @author JoãoMarcus
 */



public class Celular {
    private String nome;
    private String IMEI;
    
    public Celular(String nome, String IMEI ) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    @Override
    public String toString() {
        return "Celular{" + "nome=" + nome + ", IMEI=" + IMEI + '}';
    }
    
    
    
    
    // Para hascode
    // Se x.equals(y) == true y.hascode() == x.hashCode();
    //  y.hascode() == x.hashCode() ñ necessariamente o equals deverá retornar true
    // x.equals(y) == false
    // y.hasCode() != x.hasCode() x.equals(y) deverá ser false
    public int hasCode() {
      return IMEI != null ? IMEI.hashCode() : 1;
              
    }
    
    // Reflexivo = x.equals(x) tem que ser true tudo for diferente de null;
    // Simetrico para x e y diferente de null, se x.equals(y) == true logo y.equals(x) tem que ser true
    // Transitividade para x,y ,z diferentes de null, se x.equals(y) == true, logo y.equals(x) tem que ser true e x.equals(z) == true logo y.equals(x) == true
    // COnsistente x.equals(y) deve sempre retornar o mesmo valor
    // para x diferente de null x.equals(null) tem que retornar false;
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Celular outroCelular = (Celular) obj;
        return IMEI != null ? IMEI.equals(outroCelular.getIMEI()) : false;
        
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public String getIMEI() {
        return IMEI;
    }
    public void getIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
    
    
}
