
package boletin2_5;

import java.util.Scanner;


public class Boletin2_5 {


    public static void main(String[] args) {

    float milla= 1852F, distancia, metros;
    
    Scanner sc = new Scanner(System.in);
    
        System.out.println("¿Qué distancia recorriste?");
       distancia = sc.nextFloat();
       metros = distancia*milla;
       
        System.out.println("La distancia que recorriste son "+metros+" metros");
    }
    
}
