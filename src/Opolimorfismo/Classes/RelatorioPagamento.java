/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opolimorfismo.Classes;

/**
 *
 * @author User
 */
public class RelatorioPagamento {
    
    //Parementos Polimorfismo:
   public void relatorioPagamentoGeral(Funcionario funcionario) {
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Salario: "+funcionario.getSalario());
        if(funcionario instanceof Gerente ) {
            Gerente g = (Gerente) funcionario;
            System.out.println("Participação no lucros: "+g.getPnl());
            
        }
        
        if(funcionario instanceof Vendedor) {

            System.out.println("Total vendas: "+((Vendedor) funcionario).getTotalVendas());
        }
   }
    
}
