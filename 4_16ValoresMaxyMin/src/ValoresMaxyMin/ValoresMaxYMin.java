/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValoresMaxyMin;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class ValoresMaxYMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int max = 0,min = 0,numero;
        
        Scanner entradaTeclado = new Scanner (System.in);
        System.out.println("Introduce (n) número de valores");
        int numeron = entradaTeclado.nextInt();
        if (numeron<=1) {
            System.out.println("El número (n) debe ser mayor de 2");
        }
        else {
            for (int i=1;i<numeron;i++) {
                System.out.println("Introduce los valores");
                numero = entradaTeclado.nextInt();
                if (numero > max) {  // si el número introducido es mayor que el máximo, éste se convierte en máximo.
                    max=numero; 
                }
                if (min==0) min = numero;  //si no hay número mínimo, lo inicio con el valor introducido
                if (numero < min) {  //si el número introducido es menor que el mínimo, éste se convierte en mínimo
                    min=numero; 
                }
            }
            System.out.println("Resultado - máx: " + max + " y el min: " + min);
        } 
    }
}

