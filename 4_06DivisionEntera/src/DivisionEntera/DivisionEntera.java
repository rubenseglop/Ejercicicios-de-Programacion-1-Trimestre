/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivisionEntera;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class DivisionEntera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        System.out.println("Por favor, introduzca el primer número");
        int numero1 = entradaEscaner.nextInt();
        System.out.println("Por favor, introduzca el segundo número");
        int numero2 = entradaEscaner.nextInt();
        if (numero1 % numero2==0) {
        System.out.println("Es divisible (resto da cero)");   
        }
        else {
            System.out.println("No es divisible (resto no es cero)");
        }
    }
    
}
