/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MesesStrings;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intervalo=0,nummes;
        Scanner entrada = new Scanner(System.in);        
        String[] meses={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        while (intervalo==0) {
            System.out.println("Introduce el numero de un mes (0) para terminar");
            nummes= entrada.nextInt();
            if (nummes>12 || nummes<0) System.out.println("Error en el número (del 1 al 12)");
            else {
                if (nummes==0) intervalo++;
                else System.out.println("El mes es: " + meses[--nummes]); //Siempre un número menos para arrays (el 0 cuenta), de ahi el --nummes
            }
        }
    }
}
