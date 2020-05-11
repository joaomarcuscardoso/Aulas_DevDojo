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
class Externa {
    static class Interna {
        public void imprimir() {
            System.out.println("oi");
        }
    }
}
public class ClassesInternasEstaticasTest {
    public static void main(String[] args) {
        Externa.Interna teste = new Externa.Interna();
        teste.imprimir();
        Interna2 teste2 = new Interna2();
        teste2.imprimir();
    }
    static class Interna2{
        public void imprimir() {
            System.out.println("oi dentro do interna 2");
        }
    }
}
