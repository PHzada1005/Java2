/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author uniepedreis
 */
public class Pessoa {
        private String nome;
        private String sobrenome;
        private int idade;
        private Data nasc;

    public Pessoa(String nome, String sobrenome, int idade, Data nasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.nasc = nasc;
    }

    public Data getNasc() {
        return nasc;
    }
    
    
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return " Nome: " + nome + " " + sobrenome + "\n Idade:" + idade + "\n Data de nascimento: "+ nasc;
    }
        
}
