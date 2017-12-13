/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_05ejercicio;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class EjCadena {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres (String)");
        String datos = entrada.nextLine();

        Cadena cadena = new Cadena(datos);

        cadena.invierteCadena();
        System.out.print("Invertida: ");
        cadena.visualizaCadena();

        System.out.print("Encriptada: ");
        cadena.encriptaCadena();
        cadena.visualizaCadena();

        System.out.print("Desencriptada: ");
        cadena.desencriptaCadena();
        cadena.visualizaCadena();

        cadena.invierteCadena();
        System.out.print("Invertida de nuevo (posición original): ");
        cadena.visualizaCadena();

    }
}
