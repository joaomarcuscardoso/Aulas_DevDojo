/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author JoãoMarcus
 */
public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("Arquivoos.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader(file))) {
            
            bw.write("Escrevendo");
            bw.newLine();
            bw.write("pulando a linha");
            bw.flush();
            String s;
            while((s=br.readLine()) != null ) {
                System.out.println(s);
            }
            br.close();
             
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            bw.write("Escrevendo");
            bw.newLine();
            bw.write("pulando a linha");
            bw.flush();
            bw.close();
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s = null;
            while((s=br.readLine()) != null ) {
                System.out.println(s);
            }
            
            br.close();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
