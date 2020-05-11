/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KModificadorFinal;

/**
 *
 * @author User
 */
public class Carro {

    // final para não mudar o valor da variavél
    private static final double VELOCIDADE_FINAL = 250;
    private final Comprador comprador = new Comprador();
    private String nome;
    private String marca;

    
    @Override
    public String toString() {
        return "Carro{" + "nome=" + nome + ", marca=" + marca + '}';
    }
    
    public final void imprime() {
        System.out.println("Imprimindo Carro");
    }
    
    public static double getVELOCIDADE_FINAL() {
        return VELOCIDADE_FINAL;
    }

    public Comprador getComprador() {
        return comprador;
    }


    

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
