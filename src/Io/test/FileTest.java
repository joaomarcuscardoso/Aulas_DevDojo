/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Io.test;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoãoMarcus
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo2.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println(file.createNewFile());
            boolean exists = file.exists();
            if(exists) {
                System.out.println("Deletado: "+file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
