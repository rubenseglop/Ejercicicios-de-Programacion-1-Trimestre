/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multiplos3Alternativamente;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Multiplos3alternativamente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner (System.in);
        System.out.println("Introduzca un número");
        int numero1 = entradaEscaner.nextInt();
        System.out.println("Introduzca otro número mayor que el primero");
        int numero2 = entradaEscaner.nextInt();
        
        if (numero1<numero2){
            boolean par = true; System.out.println("Intervalo es de:");
            
            /**
             * Bucle que dectecta números divisibles entre 3 y me imprime uno si, uno no
             */
            for (int a=0;a<numero2;a++) {
                if (numero1%3==0 && par==true){
                    System.out.println(numero1); 
                    par=false;
                }
                else if (numero1%3==0 && par==false){
                    par=true;               
                }
                numero1++;
            }      
        }        
        else {System.out.println("El intervalo introducido es incorrecto");
        }
    }
}

