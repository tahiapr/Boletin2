
package boletin2_6;

import java.util.Scanner;


public class Boletin2_6 {

 
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        float tarifa, pagado; 
        
        System.out.println("¿Cuánto costó?");
        tarifa = sc.nextFloat();
        
        System.out.println("¿Cuánto es lo que pagaste?");
        pagado = sc.nextFloat();
        
        
        System.out.println("El descuento es de "+(100-pagado*100/tarifa)+"%");
    }
    
}
