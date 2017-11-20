
package boletin2_3;
import java.util.Scanner;

public class Boletin2_3 {

    
    public static void main(String[] args) {
        // El ejercicio 3 del boletín 2
       
        
        float euros, cambio, dolares;
        
         Scanner sc = new Scanner(System.in);
       
         System.out.println("¿Cuántos euros quieres cambiar, guapi?");
                 
         euros = sc.nextFloat();
         
         System.out.println("¿A cuánto está el cambio a dólares?");
         
         cambio = sc.nextFloat();
         dolares = euros*cambio;
        
        System.out.println("Tus "+euros+ " euros son "+ dolares+" dolares, ¡diviértete con ellos!");
    }
    
}
