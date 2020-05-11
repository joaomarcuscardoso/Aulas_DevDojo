/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devdojo.introducao.teste;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author JoãoMarcus
 */
public class MutiplasRuntimeException {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
            
        }catch(IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("dentro do iilegalArgumentException");
        }
        // Mais generecio para baixo.
        
        
        try {
            talvezLanceException();
        } catch(SQLException | RuntimeException e) {
            
        }
        
        
    }
    
    public static void talvezLanceException() throws SQLException, RuntimeException {
        
    }
    
}
