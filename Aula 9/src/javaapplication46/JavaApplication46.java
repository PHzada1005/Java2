/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication46;

public class JavaApplication46 {
    public static void main(String[] args) {
        Agenda cad = new Agenda();
        
        Pessoa p1 = new Pessoa("Tato","11111",20);
        
        cad.inserir(p1);
        cad.remover("PH");
        
        
        
        
        Conecta conexao = new Conecta();
        if(conexao.conectar() == null)
            System.out.println("Erro ao conectar");
        else
            System.out.println("Conectado com sucesso no main");
        
    }
    
    
}
