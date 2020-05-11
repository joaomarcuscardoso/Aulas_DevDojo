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
public class Professores {
    private Seminario[] seminarios;
    private Seminario seminario;
    private String nome;
    private String especialidade;
    public Professores() {
    }

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String im() {
        String t = "";
        for (int i = 0; i < seminarios.length; i++) {
            if (i > 0 && i < seminarios.length)
                t += seminarios[i] + " ";
            else
                t += seminarios[i];
        }
        return t;
    }

    @Override
    public String toString() {
        return String.format("===Seminários: ===\n\nNome: %s\nEspecialidade: %s\n",
                this.getNome(),
                this.getEspecialidade()
        );
    }
}
