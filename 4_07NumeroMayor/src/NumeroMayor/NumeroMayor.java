/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumeroMayor;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        System.out.print("Por favor, introduzca el primer número\n");
        int numero1 = entradaEscaner.nextInt();
        System.out.print("Por favor, introduzca el segundo número\n");
        int numero2 = entradaEscaner.nextInt();
        System.out.print("Por favor, introduzca el tercer número\n");
        int numero3 = entradaEscaner.nextInt();
        /**
         * Relación if-else para determinar el número mayor de tres
         */
        if (numero1>numero2){
            if (numero1>numero3) {
                System.out.println("El mayor es el número: " + numero1);
            }
            else {
                System.out.println("El mayor es el número: " + numero3);   
            }
        }
        else if (numero2>numero3) {
            System.out.println("El mayor es el número: " + numero2);
        }
        else {
            System.out.println("El mayor es el número: " + numero3);    
        }
    }
}
