/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PositivoNegativo;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Positivo_negativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        System.out.print("Por favor, introduzca un número\n");
        int numero = entradaEscaner.nextInt();
        if (numero==abs(numero)){ // abs nos da el valor absoluto (convierte números negativos a positivos)
            System.out.println("Es positivo");
        }
        else { System.out.println("Es negativo");
        }
    }
    
}
