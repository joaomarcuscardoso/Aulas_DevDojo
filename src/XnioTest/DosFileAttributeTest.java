/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XnioTest;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author JoãoMarcus
 */
public class DosFileAttributeTest {
    public static void main(String[] args) {
        Path path = Paths.get("folder\\teste.txt");
        try {
           // Files.createFile(path);
            Files.setAttribute(path, "dos:hidden", true);
            Files.setAttribute(path, "dos:readonly", true);
            DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
            DosFileAttributeView doaView = Files.getFileAttributeView(path, DosFileAttributeView.class);
    
            Files.setAttribute(path, "dos:hidden", false);
            Files.setAttribute(path, "dos:readonly", false); 
            
            dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());            
        } catch (IOException ex) {
            Logger.getLogger(DosFileAttributeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
}
