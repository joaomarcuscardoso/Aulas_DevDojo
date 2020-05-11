/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MclassesAbstratas.classess;

/**
 *
 * @author User
 */
public   class Gerente extends Funcionario{
    public Gerente() {
        
    }
    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }
    
   //@Override
    //public abstract void calcularSalario();
    
    @Override 
    public  void imprime() {
        
    }
}
