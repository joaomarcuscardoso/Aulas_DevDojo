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
public class FileDiretorioTest {
    public static void main(String[] args) {
        File diretorio = new File("folder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Diretorio Criado "+mkdir);
        File arquivo = new File(diretorio,"arquivo.txt");
        
        
        try {
            boolean newFile = arquivo.createNewFile();
            System.out.println("Arquivo criado: "+newFile);
        } catch (IOException ex) {
            Logger.getLogger(FileDiretorioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File arquivoNovoNome = new File(diretorio,"arquivo renomeado.txt");
        boolean renamed = arquivo.renameTo(arquivoNovoNome);
        System.out.println("Renomeado "+renamed);
        
        File diretorioRenomeado = new File("folder2");
        boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
        System.out.println("Diretorio renomeado: "+diretorioRenamed);
        
        buscarArquivo();
        
    }
    
    public static void buscarArquivo() {
        File file = new File("folder2");
        String[] list = file.list();
        
        for(String arquivo : list) {
            System.out.println(arquivo);
        }
    
    }
}
