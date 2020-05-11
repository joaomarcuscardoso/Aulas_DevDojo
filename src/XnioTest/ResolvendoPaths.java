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
public class ResolvendoPaths {
    public static void main(String[] args) {
        Path dir = Paths.get("home\\JoaoMarcus");
        Path arquivo = Paths.get("dev\\arquivoss.txt");
        Path result = dir.resolve(arquivo);
        System.out.println(result);
        Path absoluto = Paths.get("/home/JoaoMarcus");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println("1: "+absoluto.resolve(relativo));
        
        System.out.println("2: "+absoluto.resolve(file));
        System.out.println("3: "+relativo.resolve(file));
        System.out.println("4: "+relativo.resolve(absoluto));
        System.out.println("5: "+file.resolve(absoluto));
        System.out.println("6: "+file.resolve(relativo));
    }
    
}
