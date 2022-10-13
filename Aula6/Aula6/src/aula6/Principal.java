/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula6;

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
        Teste t1 = new Teste(3.141);
        Teste t2 = new Teste(3.14159);
        Teste t3 = new Teste(3.1415926);
        Transporte tp;
        
        tp = Transporte.CAR;
        Teste.x = 100;
        
        System.out.println(t1.x);
        System.out.println(t2.x);
        System.out.println(t3.x);
        
        
        
        
        t1.transportes(tp);
   
        System.out.println(">"+t1.pi);
        System.out.println(">"+t2.pi);
        System.out.println(">"+t3.pi);
    
        Teste.print();
    
    
    
    
    }
    
}
