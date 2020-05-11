/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XnioTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author JoãoMarcus
 */
public class AtributosBasicoTest {
    public static void main(String[] args) throws IOException {
        Date primireiroDeDezembro = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
        File file = new File("folder2\\arquivo_renomeado.txt");
        file.createNewFile();
        file.setLastModified(primireiroDeDezembro.getTime());
        System.out.println(file.lastModified());
        file.delete();
        Path path = Paths.get("folder2\\arquivo_path.txt");
        Files.createFile(path);
  
        FileTime fileTime = FileTime.fromMillis(primireiroDeDezembro.getTime());
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);
        
        path = Paths.get("C:\\Users\\JoãoMarcus\\Documents\\NetBeansProjects\\DevDojo.introducao\\folder2");
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));
        
        // BasicFileAttributes, PosixFileAttributes, DosFileAttributes
        BasicFileAttributes atributoBasicos = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(atributoBasicos.creationTime());
        System.out.println(atributoBasicos.lastAccessTime());
        System.out.println(atributoBasicos.lastModifiedTime());
        System.out.println(atributoBasicos.isDirectory());
        System.out.println(atributoBasicos.isSymbolicLink());
        System.out.println(atributoBasicos.isRegularFile());
        
        // BasicFileAttributeView, PosixFileAttributeView, DosFileAttributeView,  FileownerAttributeView, AclFileAttributeView
//        FileTime lastModified = atributoBasicos.lastModifiedTime();
//        FileTime created = atributoBasicos.creationTime();
//        FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());
//        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributes.class);
//        basicView.setTimes(lastModified, lastAcess, created);
//           atributoBasicos = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("---------------------------------");
//        System.out.println(atributoBasicos.creationTime());
//        System.out.println(atributoBasicos.lastAccessTime());
//        System.out.println(atributoBasicos.lastModifiedTime());        
        
        
    
    
    }
}
