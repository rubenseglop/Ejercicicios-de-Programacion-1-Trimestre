/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Media;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double fina=0,numero=0,resultado=0;
        int contador=0;
        
        /**
         * Bucle hasta que valor sea distinto de 0
         */
        while (fina==0) {
            System.out.println("Introduce un valor (0) para salir");
            numero=entrada.nextDouble();
            if (numero==0) {
                System.out.println("La media de los " + contador + " valores introducidos es de " + resultado/contador);
                fina++; // fin del bucle
            }
            else { resultado=resultado+numero;
                contador++;
            }
        }
    }
}
