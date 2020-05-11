/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String.test;

/**
 *
 * @author JoãoMarcus
 */
public class StringPerfomanceTeste {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        
        long fim = System.currentTimeMillis();
        System.out.println("Tempo: "+ (fim -inicio) + " ms");
        
        long inicio2 = System.currentTimeMillis();
        concatStringBuilder(3000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo String: "+ (fim2 -inicio2) + " ms");
      
        long inicio3 = System.currentTimeMillis();
        concatStringBuffer(3000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo String: "+ (fim3 -inicio3) + " ms");
       
    }
    
    private static void concatString(int tan) {
        String string = "";
        for(int i=0; i< tan; i++) {
            string += i;
        }
    }
    
    private static void concatStringBuilder(int tan) {
        StringBuilder sb = new StringBuilder(tan);
        
        for(int i=0; i< tan; i++) {
            sb.append(1);
        }
    }
    private static void concatStringBuffer(int tan) {
        StringBuffer sb = new StringBuffer(tan);
        
        for(int i=0; i< tan; i++) {
            sb.append(1);
        }
        
    }
    
}
