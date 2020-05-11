/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hescola;

/**
 *
 * @author User
 */
public class Seminario {
    private Endereco endereco;
    private Alunos alunos[];
    private Professores professor;
    private String titulo;

    public Seminario() {
    }

    public Seminario(Endereco endereco, Alunos[] alunos, Professores professor, String titulo) {
        this.endereco = endereco;
        this.alunos = alunos;
        this.professor = professor;
        this.titulo = titulo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setLocal(Endereco endereco) {
        this.endereco = endereco;
    }

    public Alunos[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public Professores getProfessor() {
        return professor;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String im() {
        String t = "";
        for(int i = 0; i < alunos.length; i ++) {
          if (alunos[i] != null) {
            if (i > 0 && i < alunos.length) {
                t += alunos[i] + " ";
            }
            else {
                t += alunos[i];
            }
          } else {
            break;
          }
        }
        return t;
    }

    @Override
    public String toString() {
        return String.format("Título: %s\n===============\nLocal: %s\nAluno(s): %s\n\nProfessor: %s\n",
                this.getTitulo(),
                this.getEndereco(),
                this.im(),
                this.getProfessor()
        );
    }
}
