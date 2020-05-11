/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QChecagem.test;

/**
 *
 * @author User
 */
public class runTimeException {
    public static void main(String[] args) {
        Object o = null;
        
        
        //int b = 0;
        //int a = 10;
        
        //if(b != 0 ) {
            //int c = a/b;
            //System.out.println(c);
        //}

         try {
            int[] a = new int[2];
            System.out.println(a[2]);
             System.out.println("Imprindo depois da possivel exceção");
         } catch(RuntimeException e ) { //ArrayIndexOutOfBoundsException
             e.printStackTrace();
         }
        
        
        System.out.println(o.toString());
      
    }
    
}
