/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValoresMaxyMin0;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class ValoresMaxyMin0 {
    public static void main(String[] args) {
        int fina=0,numero,max=0,min=0;
        
        Scanner entrada = new Scanner(System.in);
        while (fina==0) {
            
            System.out.println("Introduce un valor (0) para salir");
            numero = entrada.nextInt();
            if (numero==0) { 
                System.out.println("Resultado - máx: " + max + " y el min: " + min);
                fina=1; // salgo del bucle (fin programa)
            }
            if (numero > max) {
                    max=numero;
            }
            if (min==0) min = numero;
            if (numero < min) {
                min=numero; 
            }
        }   
    }
}
