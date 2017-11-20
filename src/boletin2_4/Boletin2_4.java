
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

 
    public static void main(String[] args) {
        // Ejercicio 4 del boletín 2
        
        float num1, num2, suma, resta, producto, division;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Se amable y dime un número, corazón");
        num1 = sc.nextFloat();
        System.out.println("Ahora dime otro");
        num2 = sc.nextFloat();
         
        System.out.println("Vamos a sumarlos");
        suma = num1 + num2;
        System.out.println("El resultado de la suma es "+suma);
        
        System.out.println("Ahora vamos a restarlos");
        resta = num1 - num2;
        System.out.println("El resultado de la resta es "+resta);
        
        System.out.println("Ahora los dividimos");
        division = num1/num2;
        System.out.println("El resultado de la división es "+division);
        
        System.out.println("Por último los multiplicaremos");
        producto = num1*num2;
        System.out.println("El respultado de la multiplicación es "+producto);
        
    }
    
}
