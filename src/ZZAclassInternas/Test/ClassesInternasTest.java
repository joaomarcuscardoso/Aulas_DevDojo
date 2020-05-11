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
public class ClassesInternasTest {
  
    private String nome ="Jojo";
    
    class Interna {
        public void verClassesExterna() {
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ClassesInternasTest.this);
        }
    }  
    
    public static void main(String[] args) {
        ClassesInternasTest externa = new ClassesInternasTest();
        ClassesInternasTest.Interna in = externa.new Interna();
        ClassesInternasTest.Interna in2 = new ClassesInternasTest().new Interna();
        in.verClassesExterna();
        in2.verClassesExterna();
        
    }   
}

//class Externas {
//    private String nome ="Jojo";
//    
//    class interna {
//        public void verClassesExterna() {
//            System.out.println(nome);
//        }
//    }
//    
//}