/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula7;

/**
 *
 * @author uniepedreis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aluno aluno01 = new Aluno("Eng Robôs","Otávio","Oliveira",20,new Data(25,9,22));
        Professor professor01 = new Professor("Engenharia","Reinaldo","Bianchi",45, new Data(25,11,22));
        
        System.out.println(professor01);
    }
    
}
