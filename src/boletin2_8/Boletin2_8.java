
package boletin2_8;

import java.util.Scanner;


public class Boletin2_8 {


    public static void main(String[] args) {
    
    int b100, b20, b5, m1;
    
    Scanner sc = new Scanner(System.in);
    
        System.out.println("¿Cuántos billetes de 100 tienes?");
        b100 = sc.nextInt();
        
         System.out.println("¿Cuántos billetes de 20 tienes?");
        b20 = sc.nextInt();
        
         System.out.println("¿Cuántos billetes de 5 tienes?");
        b5 = sc.nextInt();
        
         System.out.println("¿Cuántas monedas tienes?");
        m1 = sc.nextInt();
        
        System.out.println("En total tienes "+((b100*100)+(b20*20)+(b5*5)+(m1*1))+" euros");
        
        
            
    }
    
}
