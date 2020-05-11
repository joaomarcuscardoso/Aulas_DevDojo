/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QChecagem.CheckedException.test;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author User
 */
public class CheckedExceptionTest {
    public static void main(String[] args) {
      
            abrirArquivo();
 
    }
    
    public static void criarArquivo() throws IOException {
        File file = new File("Test.txt");
       
        
        // Bloco de segurança
        try {
            System.out.println("Arquivo criado: "+file.createNewFile());
            
            System.out.println("Arquivo criado");
            
        } catch(IOException e) {
            e.printStackTrace(); 
            
        }
    }  
        
    public static void abrirArquivo() {
        File file = new File("Test.txt");
       
        
        // Bloco de segurança
        try {
            System.out.println("Arquivo criado: "+file.createNewFile());
            
            System.out.println("Arquivo criado");
            
        } catch(IOException e) {
            e.printStackTrace(); 
            
        } finally {
            System.out.println("Fechar o arquivo");
        }
    }    
        
    
        
        
}
