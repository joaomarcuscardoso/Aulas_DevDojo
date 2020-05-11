/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YSerializacao.test;

import Serializacao.Class.Aluno;
import Serializacao.Class.Turma;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoãoMarcus
 */
public class SerializacaoTest {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();
    }
    private static void gravadorObjeto() {
        Turma t = new Turma("Maratona java só para os campeões");
        Aluno aluno = new Aluno(1L, "Willian Suane", "123456");
        aluno.setTurma(t);
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {

            oos.writeObject(aluno);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public static void leitorObjeto() {
       
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {

            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
            
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
