/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulo;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Triangulo {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado1, lado2, lado3 ,total;
        // TODO code application logic here
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        System.out.print("Por favor, introduzca el primer lado\n");
        lado1 = entradaEscaner.nextInt(); 
        System.out.print("Por favor, introduzca el segundo lado\n");
        lado2 = entradaEscaner.nextInt(); 
        System.out.print("Por favor, introduzca el tercer lado\n");
        lado3 = entradaEscaner.nextInt();
        total = ((lado1 + lado2 + lado3) / 2);
        System.out.println(total);
        double raiz = (total * (total - lado1) * (total - lado2) * (total - lado3));
        
        System.out.println("El area total es: " + Math.sqrt(raiz));
        
    }
    
}