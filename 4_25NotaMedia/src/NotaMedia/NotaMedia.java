/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotaMedia;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class NotaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bucle=0,nnotas=0;
        double media=0;
        while (bucle==0) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce una nota (0) para salir");
            int numero = entrada.nextInt();
            if (numero==0) {
                bucle++;
                break;
            }
            //Calculo la media
            if (numero>0 && numero<=10) {
                media=media+numero;
                nnotas++;
            }
            else System.out.println("Nota no válida");
        }
        System.out.println((media/nnotas) + " " + nota(media/nnotas));
    }
    /**
     * Clase nota que me devuelve la nota al introducirle un número
     * @param numero - Nota (int) introducida
     * @return - Me devuelve el resultado de mis notas (String)
     */
    private static String nota(double numero){
        
        if (numero>1 || numero<10) {
            if (numero>=1 && numero<3) return("Muy Deficiente");
            if (numero>=3 && numero<5) return("Insuficiente");
            if (numero>=5 && numero<6) return("Suficiente");
            if (numero>=6 && numero<7) return("Bien");
            if (numero>=7 && numero<9) return("Notable");
            if (numero>=9 ) return("Sobresaliente");
        }
        return null;
    }
}
    



