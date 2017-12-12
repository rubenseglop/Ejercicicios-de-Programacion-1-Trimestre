/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumaPares;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class SumaPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        System.out.println("Por favor, introduzca un número");
        int numero = entradaEscaner.nextInt();
        int i=0, sumatotal=0;        
        while (i<=numero) {
            sumatotal = sumatotal + i;
            i=i+2;           
        }
        System.out.println("La suma es de: " + sumatotal);
            
        }
    }
    

