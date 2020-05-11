/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devdojo.introducao.teste.customemException;

/**
 *
 * @author JoãoMarcus
 */
public class LoginInvalidoException extends Exception {
        public LoginInvalidoException() {
            super("Usuario ou senha invalidos");
            
        }
}
