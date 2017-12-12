/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial2;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Factorial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        System.out.print("Por favor, introduzca un número\n");
        int numero = entradaEscaner.nextInt();
        
        /**
         * Factorial de números negativos (se convierten en absolutos)
         */
        if (numero != abs(numero)){
            int resultado=1;
            while (Math.abs(numero)>1){            
                resultado = resultado * numero; 
                numero++;
            }
            System.out.print("El numero factorial de es: " + resultado + "\n");
        }
        else {
        
            int resultado=1;
            while (numero>1){            
                resultado = resultado * numero; 
                numero--;
            }
            System.out.print("El numero factorial es: " + resultado + "\n"); 
        }
        
    }
}
