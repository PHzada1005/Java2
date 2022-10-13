/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author uniepedreis
 */
public class Teste {
    
    public final double pi;
    public static int x;
    
    public Teste(double p){
        this.pi = p;
    }
    
    
    public void transportes(Transporte tipo){
        if(tipo == Transporte.CAR)
            System.out.println("Tipo de transporte: Carro ");
        if(tipo == Transporte.AIRPLANE)
            System.out.println("Tipo de transporte: Avião ");
    }
    public static void print(){
        System.out.println("UÉ");
    }
}
