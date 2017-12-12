/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParImpar;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Par_impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        System.out.print("Por favor, introduzca un número\n");
        int numero = entradaEscaner.nextInt();
        if (numero%2 == 0) {
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar"); 
        }
    }
}
