/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author uniepedreis
 */
public class Professor extends Pessoa {
            private String departamento;

    public Professor(String departamento, String nome, String sobrenome, int idade, Data nasc) {
        super(nome, sobrenome, idade, nasc);
        this.departamento = departamento;
    }
            

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Professor" + "\n" + super.toString() + "\n Departamento:" + departamento;
    }
            
}
