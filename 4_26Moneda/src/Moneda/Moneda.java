/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moneda;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Moneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int repetir=0;
        while (repetir==0) {
            int azar=(int) Math.round(Math.random()); // resuelve un número entre 0 y 1 (cara o cruz)
            if (azar==1) System.out.println("Ha salido cara");
            else System.out.println("Ha salido cruz");
            System.out.println("Jugar otra vez (s/n)");
            Scanner entrada = new Scanner(System.in);
            String jugar= entrada.nextLine();
            if ("n".equals(jugar) || "N".equals(jugar)) repetir++; // salgo del bucle al introducir n o N (cualquier otra cosa repite bucle)
        }
    }
}
