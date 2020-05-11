/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XnioTest;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author JoãoMarcus
 */
public class NormalizacaoTest {
    public static void main(String[] args) {
        String diretorioProjeto = "C:\\Users\\JoãoMarcus\\Documents\\NetBeansProjects\\DevDojo.introducao\\folder2\\";
        String arquivoTxt = "..\\..\\arquivoss.txt";
        Path p1 = Paths.get(diretorioProjeto,arquivoTxt);
        System.out.println(p1.normalize());
        Path p2 = Paths.get("C:/.Users/.JoãoMarcus/.Documents/.NetBeansProjects/.DevDojo.introducao/.folder2");
        System.out.println(p2.normalize());
                
    }
}
