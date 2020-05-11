/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacao.Class;


import java.io.*;

/**
 *
 * @author JoãoMarcus
 */
public class Aluno implements Serializable {
    private Long id;
    private String nome;
    private transient String passwrod;
    private static String nomeEscola = "DEVDOJO i)";
    private transient Turma turma;
    
    
    public Aluno(Long id, String nome, String passwrod) {
        this.id = id;
        this.nome = nome;
        this.passwrod = passwrod;
    }

    
    
    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", passwrod=" + passwrod + ", NomeEscola =" + nomeEscola + ", turma =" + turma +'}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    public static String getNomeEscola() {
        return nomeEscola;
    }

    public static void setNomeEscola(String nomeEscola) {
        Aluno.nomeEscola = nomeEscola;
    }

    private void writeObject(ObjectOutputStream oos) {
        try {
           oos.defaultWriteObject();
           oos.writeUTF(turma.getNome());
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            turma = new Turma(ois.readUTF());
            
        } catch(IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }
    
    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    
    
    
}
