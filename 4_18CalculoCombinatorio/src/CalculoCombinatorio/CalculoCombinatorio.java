/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculoCombinatorio;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class CalculoCombinatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner (System.in);
        double a=-1, b=-1;
        while (a<0) {
            System.out.println("Introduce el valor positivo de A");
            a = entrada.nextDouble();
        }
        while (b<0) {
            System.out.println("Introduce el valor positivo de B menor que el anterior");
            b = entrada.nextDouble();            
        }
        if ( (a-b) >= 0) {
            double resultado = ( factorial(a)/factorial(b) * factorial(a - b));
            System.out.println("El resultado es:" + resultado);
        }
        else System.out.println("El factorial de A-B no puede ser negativa");
          
    }
    
    /**
     * Clase factorial que realiza la fórmula factorial de un número
     * @param numero - numero introducido
     * @return - me devuelve el factorial del número introducido
     */
    private static double factorial(double numero){
        
            double resultado=1;
            while (numero>1){            
                resultado = resultado * numero; 
                numero--;
            }
        
        return resultado;
    }
}
