/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumerosPrimos;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ocurrencias=0; // Pongo resultado a cero
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = entrada.nextInt();
        for (int i=1;i<=numero;i++) {
            if (numero%i==0) {
                ocurrencias++; //Si es divisible por algún numero, sumo ocurrencia.
            }      
        }
        if (ocurrencias==2) System.out.println("Es un número primo"); // Un número primo es divisible siempre por 1 y por su própio número (2 ocurrencias)
        else System.out.println("No es un número primo"); // si es divisible por algo diferente de 2 ocurrencias, no es primo (partiendo de 2 mínimo, ya que
                                                          // nunca se puede presentar tener 0 o 1 ocurrencias)
    }
}
