/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZAclassInternas.Test;

/**
 *
 * @author JoãoMarcus
 */
public class ClassesLocaisTest {
    private String nome = "Joujou";
    
    public void fazAlgumaCoisa() {
        String sobrenome = "Suane";
        class Interna {
            public void imprimeNomeExterno() {
                System.out.println(nome);
                
            }
        }
        Interna in = new Interna();
    }
    
    public static void main(String[] args) {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.fazAlgumaCoisa();
    }
}
