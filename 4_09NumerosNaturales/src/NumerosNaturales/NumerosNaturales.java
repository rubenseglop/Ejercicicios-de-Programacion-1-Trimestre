/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumerosNaturales;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class NumerosNaturales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        System.out.print("Por favor, introduzca el primer número\n");
        int numero1 = entradaEscaner.nextInt();
        System.out.print("Por favor, introduzca el segundo número mayor que el anterior\n");
        int numero2 = entradaEscaner.nextInt();
        if (numero1>=numero2) {
            System.out.print("Por favor, el primer número debe ser mayor que el segundo\n");
        }
        else {
            int suma = 0;
            
            while(numero1<=numero2){
                suma += numero1++;                
            }
            System.out.print("La suma total es de: " + suma + "\n"); 
          }
    }
    
}
