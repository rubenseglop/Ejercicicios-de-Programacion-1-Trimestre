/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dado6;

/**
 *
 * @author Ruben
 */
public class Dado6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero;
        int resultado=0;
        for (int i=0;i<=100;i++) {
            numero = Math.round(Math.random()*5)+1; // me da números entre 1-6 (valor del dado)
            if (numero==6) resultado++; // si sale 6, me suma un resultado
        }
        System.out.println("Me han salido " + resultado + " veces el dado con número 6");
    }    
}
