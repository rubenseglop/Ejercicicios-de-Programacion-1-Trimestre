/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        System.out.print("Por favor, introduzca un número\n");
        int numero = entradaEscaner.nextInt();
        if (numero != abs(numero)){
        System.out.print("No es un número positivo\n");        
        }
        else {
        
        int resultado=1;
        
        /**
         * Bucle que realiza la operación factorial
         */
        while (numero>1){            
            resultado = resultado * numero; 
            numero--;
            }
        System.out.print("El número factorial es: " + resultado + "\n"); 
        }
    }
    
}
