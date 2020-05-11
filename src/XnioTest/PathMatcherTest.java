/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XnioTest;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author JoãoMarcus
 */
class FindAllTest extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");
    
    
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes sttrs) throws IOException {
       if(matcher.matches(file)) {
           System.out.println(file.getFileName());
       } 
       return FileVisitResult.CONTINUE; 
       
    }
}


public class PathMatcherTest {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("pasta/subpasta/subsubpasta/file.bkp");
        Path path2 = Paths.get("file.bkp");
         Path path3 = Paths.get("willian-suane");   
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.bkp"); 
        System.out.println(matcher.matches(path1));
        System.out.println(matcher.matches(path2));
        System.out.println("--------------------");
        matches(path1, "glob: *.bckp");
        matches(path1, "glob: **/*.bckp");
        matches(path1, "glob: *");
        matches(path1, "glob: **");       
    
        System.out.println("--------------------");
        matches(path1, "glob: *.???");
        matches(path1, "glob: **/*.???");

        matches(path1, "glob: **.???");       
        matches(path3, "glob: {willian*,suane*}");
        matches(path3, "glob: {willian, suane}*");
        matches(path3, "glob: {willian, suane}");
        Files.walkFileTree(Paths.get("./"), new FindAllTest());  
        
    }            
       
    
    
    
    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob+ ": "+matcher.matches(path));
    }
 
}
