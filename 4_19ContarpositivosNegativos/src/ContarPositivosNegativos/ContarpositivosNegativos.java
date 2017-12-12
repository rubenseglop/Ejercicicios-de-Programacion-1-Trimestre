/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContarPositivosNegativos;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class ContarpositivosNegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fina=0,numero,positivo=0,negativo=0;        
        Scanner entrada = new Scanner(System.in);
        while (fina==0) {
           System.out.println("Introduce un valor positivo o negativo (0) para salir");
           numero = entrada.nextInt();
           if (numero==0) {
               System.out.println("Hay " + positivo + " valores positivos y " + negativo + " negativos");
               fina++;
           }
           if (numero>0) positivo++;
           if (numero<0) negativo++;
        }
    }
}
