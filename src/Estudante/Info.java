package Estudante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
    
public class Info {
    private String nome;
    private boolean aprovado;
    
    public  void info_estudante() {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nomes = t.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = t.nextInt();
        System.out.print("Digite o valor da nota1:    ");
        double nota1 = t.nextDouble();
        System.out.print("Digite o valor da nota2:    ");
        double nota2 = t.nextDouble();
        System.out.print("Digite o valor da nota3:    ");
        double nota3= t.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 6) {
            this.aprovado = true;
            System.out.println("Você, "+nomes+" tem "+idade+" anos e foi aprovado, com média é "+media);
        } else {
            this.aprovado = false;
            System.out.println("Você, "+nomes+" tem "+idade+" anos e foi reprovado, com média é "+media);
        }
    }
    
    public void setNome(String nome) {
         this.nome = nome;
        
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setAprovado(boolean aprovado) {
        
        this.aprovado = aprovado;
        
    }
    
    public boolean isAprovado() {
        return this.aprovado;
    }
}
