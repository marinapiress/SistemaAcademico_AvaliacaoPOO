/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provapoo;

import java.util.ArrayList;
import java.util.List;

public abstract class Aluno {
    private String nome;
    private String sobrenome;
    private String curso;
    private List<Materia> materias;

    public Aluno() {
        this.materias = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

   public List<Materia> getMateria() {
        return materias;
    }

    public void addMateria(Materia materia) {
        this.materias.add(materia);
    }

    @Override
    public String toString() {
        return "Nome= " + nome + " " + sobrenome +
                ", Curso= " + curso + "\n" +
                "Matérias=" + materias;
    }

}
