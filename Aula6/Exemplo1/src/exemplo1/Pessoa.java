/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo1;

/**
 *
 * @author uniepedreis
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private Data Nascimento;
    

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
     public Pessoa(String nome, String cpf, Data Nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.Nascimento = Nascimento;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    public Data getNascimento() {
        return Nascimento;
    }
    
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNascimento(Data Nascimento) {
        this.Nascimento = Nascimento;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + "Nasc=" +Nascimento +  '}';
    }

    
    
    
}
