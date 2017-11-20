
package boletin2_10;

import java.util.Scanner;


public class Boletin2_10 {

   
    public static void main(String[] args) {
           float sueldoFijo, ventas, km, diasDesplazamiento, saldoBruto, saldoLiquido, ventasComisiones;
           
        Scanner sc = new Scanner (System.in);
        
        System.out.println("¿Cuál es tu sueldo fijo?");
        
        sueldoFijo = sc.nextFloat();
        
        System.out.println("¿Cuántas ventas hiciste?");
        ventas = sc.nextFloat();
        
        System.out.println("¿Cuántos kilómetros recorriste?");
        km = sc.nextFloat();
        
        System.out.println("¿Cuántos días te desplazaste?");
        diasDesplazamiento = sc.nextFloat();
 
    
        ventasComisiones = 5 * ventas/100;
    
    saldoBruto = sueldoFijo + ventasComisiones  + 2 * km + 30 * diasDesplazamiento;
    
    saldoLiquido = saldoBruto - (18 * saldoBruto/100) - 36;
       
       System.out.println("Su saldo bruto es de "+saldoBruto+" euros.");
       System.out.println("Su saldo líquido es solamente de "+saldoLiquido+" euros.");
        
    }
    
}
