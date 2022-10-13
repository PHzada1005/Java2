/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author uniepedreis
 */
public class Aluno extends Pessoa {
            private String curso;

    public Aluno(String curso, String nome, String sobrenome, int idade, Data nasc) {
        super(nome, sobrenome, idade,nasc);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "curso=" + curso + '}';
    }
    
}
