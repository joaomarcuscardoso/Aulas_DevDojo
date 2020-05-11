/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XnioTest;

//import java.nio.file.Path;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


/**
 *
 * @author JoãoMarcus
 */
public class CriandoPathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\JoãoMarcus\\Documents\\NetBeansProjects\\DevDojo.introducao\\arquivoos.txt");
        System.out.println(p1.toAbsolutePath());
        File file = p1.toFile();
        Path path = file.toPath();
        Path path1 = Paths.get("pasta");
        Path path2 = Paths.get("pasta2");
   
        try {
            if(Files.notExists(path2)) {
                Files.createDirectories(path2);
                //Files.createDirectory(path2);
                
            }
            

            //  Files.createDirectories(path2.getParent()) pega apenas diretorios
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path source = Paths.get("folder2\\arquivo.txt");
        Path target = Paths.get(path2.toString() + "\\arquivoCopiado.txt");
        
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            Files.deleteIfExists(target);
            
        } catch( IOException e) {
            e.printStackTrace();
        }
        
        
    }
}
