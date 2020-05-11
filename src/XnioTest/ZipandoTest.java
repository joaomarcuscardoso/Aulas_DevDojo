/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XnioTest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author JoãoMarcus
 */
public class ZipandoTest {
    public static void main(String[] args) {
        Path dirZip = Paths.get("pasta/subpasta");
        Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
        Path zipFile = dirZip.resolve("arquivos.zip");
        try(ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
           DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)) {
           for(Path path : stream) {

               zip.putNextEntry(new ZipEntry(path.getFileName().toString()));
               
               BufferedInputStream bf = new BufferedInputStream( new FileInputStream(path.toFile()));
               
                byte[] buff = new byte[2048];
                int bytesRead;
             
                while((bytesRead = bf.read(buff)) > 0) {
                    zip.write(buff, 0, bytesRead);
             
                }
                zip.flush();
                zip.closeEntry();
                bf.close();
               
           }
               
            
        } catch(IOException e ) {
            e.printStackTrace();
        }
        
        
    }
}
