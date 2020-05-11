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
public class RunExceptionTest {
    public static void main(String[] args) {
        divisao(10,0);
        
    }
    
    public static void divisao(int num1, int num2) {
        if(num2 == 0) {
            throw new  IllegalArgumentException("Passa um valor diferente de 0 para variavél num2");
            
        }
        
        int result = num1 / num2;
        
        
        System.out.println(result);
        
    }
}
