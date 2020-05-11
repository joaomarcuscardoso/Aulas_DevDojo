/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devdojo.introducao.teste;

import devdojo.introducao.teste.customemException.LoginInvalidoException;

/**
 *
 * @author JoãoMarcus
 */
public class customemExceptionTest {
    public static void main(String[] args) {
       try {
           logar();
       } catch (LoginInvalidoException e) {
           e.printStackTrace();
       }
    }
    
    private static void logar() throws LoginInvalidoException {
       String usuario = "Goku";
       String senha = "1111";
       String usuarioDigitado = "Goku";
       String senhaDigitado = "123";
       if(!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitado)) {
           throw new LoginInvalidoException();
           
       } else {
           System.out.println("Logar!");
       }
    }
}
