
package boletin2_7;

import java.util.Scanner;


public class Boletin2_7 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int c;
        
        System.out.println("¿Cuántos grados centígrados hay?");
        c = sc.nextInt();

        System.out.println(c+" grados centígrados son "+(c*273)+ " grados Kelvin");
        System.out.println(c+" grados centígrados son "+(32 + 1.8*c)+" grados Fahrenheit");
    }
    
}
