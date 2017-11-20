
package boletin2_9;

import java.util.Scanner;

public class Boletin2_9 {


    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        
        int euros, b100, b20, b5, m1;
        
        System.out.println("¿Cuánto dinero tienes?" );
        euros = sc.nextInt();

        System.out.println("Pues que sepas que tienes "+euros/100+ " billetes de 100, " +((euros%100)/20) +" billetes de 20, " + (((euros%100)%20)/5)+" billetes de 5, " + ((((euros%100)%20)%5)/1) +" monedas de 1 euro "  );
        
        
    }
    
    
}
