/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressaoRegularesTest;

/**
 *
 * @author JoãoMarcus
 */
public class TokenTest {
    public static void main(String[] args) {
        String str = "Willian , Ju, Joana, Camila, Ana, Joao, Matheus";
        String[] tokens = str.split(",");
        for(String array : tokens) {
            System.out.println(array.trim());
        }
    
    
    }
}
