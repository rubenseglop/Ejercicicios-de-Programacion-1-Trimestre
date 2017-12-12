/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiniela;

/**
 *
 * @author Ruben
 */
public class Quiniela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int azar;
        System.out.println("Programa Quiniela v5.5\nSi esto toca, acordarse de mí, el programador que lo hizo\n");
        for (int i=1;i<=15;i++) {
            System.out.print(i + ". ");
            azar=(int)(Math.random()*100); //me devuelve números decimales entre 0 y 100
            if (azar<=50) System.out.println("1"); // 50%
            else if (azar<=80) System.out.println("X"); // 30% (del 50% al 80%)
            else System.out.println("2"); // 20% restante
        }
    }
}
