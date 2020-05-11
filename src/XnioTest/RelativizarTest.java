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
public class RelativizarTest {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/JoaoMarcus");
        Path classe = Paths.get("/home/JoaoMarcus/java/Pessoa.java");
        Path pathIoClasse = dir.relativize(classe);
        System.out.println(pathIoClasse);
        
        Path absoluto1 = Paths.get("/home/JoaoMarcus");
        Path absoluto2 = Paths.get("usr/local");
        Path absoluto3 = Paths.get("/home/JoaoMarcus/java/Pessoa.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/Funcionario.java");
        System.out.println("1: "+absoluto1.relativize(absoluto3));
        System.out.println("2: "+absoluto2.relativize(absoluto1));
        System.out.println("3: "+absoluto1.relativize(absoluto2));
        System.out.println("4: "+relativo1.relativize(relativo2));
        System.out.println("5: "+absoluto1.relativize(relativo1));
        
    }
}
