/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devdojo.introducao.teste;

import QChecagem.Classes.Leitor1;
import QChecagem.Classes.Leitor2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoãoMarcus
 */
public class TryWithResourcesTest {
    public static void main(String[] args ) {
        lerArquivo();
    }
    
    public static void lerArquivo() {
//    
//        try(Reader reader = new BufferedReader(new FileReader("text.txt"))) {
//         
//        } catch (IOException e) {
//           e.printStackTrace();
//        
//        } 
      try(Leitor1 leitor1 = new Leitor1();
          Leitor2 leitor2 = new Leitor2()) {
          
      } catch (Exception e) {
          e.printStackTrace();
      } 
        
    }
    
    
    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        }    catch (FileNotFoundException ex) {
            Logger.getLogger(TryWithResourcesTest.class.getName()).log(Level.SEVERE, null, ex);
        
        } finally {
            try {
                
                if(reader != null) {
                    
                
                    reader.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
            
            
        }
    }


}
