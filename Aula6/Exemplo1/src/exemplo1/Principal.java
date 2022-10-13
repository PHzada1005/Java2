/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo1;

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
        Pessoa p1 = new Pessoa("Deco", "111.111.111-01", new Data(10,1,2002));
        
        Pessoa p2 = new Pessoa("Pegas", "222.222.222-02");
        
        p2.setNascimento(new Data(10,5,2002));
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p1.getNascimento().getDia());
        p1.getNascimento().setDia(7);
        
        
    }
    
}
