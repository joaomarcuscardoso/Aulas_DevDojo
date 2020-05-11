/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XnioTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author JoãoMarcus
 */
class AcharTodoOsBkp extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(file.getFileName().toString().endsWith(".bkp")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }   

            
 
}


public class FileVisitorTest {
    public static void main(String[] args) throws IOException {
       Files.walkFileTree(Paths.get("pasta"), new AcharTodoOsBkp()); 
       Files.walkFileTree(Paths.get("pasta"), new PrintDirs());
    }
}

class PrintDirs extends SimpleFileVisitor<Path> {
    @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
            System.out.println("pre: "+dir);
            if(dir.getFileName().toString().equals("subsubpasta")) {
                return FileVisitResult.SKIP_SUBTREE;
            }    
            return FileVisitResult.CONTINUE;
        }
    
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {      
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;

        
    }  
    
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) 
        throws IOException { 
        
            return FileVisitResult.CONTINUE;    

    } 
    
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        System.out.println("post: "+dir);
        return FileVisitResult.CONTINUE;
    }
    
}