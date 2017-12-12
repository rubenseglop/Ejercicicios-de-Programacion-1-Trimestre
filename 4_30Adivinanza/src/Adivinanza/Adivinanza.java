/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adivinanza;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Adivinanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min,max;
        byte respuesta=0;
        byte juego=0;
        String salida;
        
               
        Scanner entrada=new Scanner(System.in);
        
        /**
         * Bucle que inicia el proceso
         */
        while (juego==0) {
            byte numazar=(byte)(Math.random()*100);
            byte intentos=5;
            min=0;
            max=100;
            /**
             * Bucle para introducir números (si no he acertado el número y me quedan intentos...)
             */
            while (numazar!=respuesta && intentos>0) {
                System.out.println("Introduce tu número del 0 al 100 (te quedan " + intentos +" intentos)");
                respuesta=entrada.nextByte();
                if (respuesta==numazar) {
                    System.out.println("ACERTASTE!!!! El número era el " + respuesta);
                    intentos=0; // salida del bucle de números.
                }
                else if (respuesta<numazar) {
                    if (min<respuesta) min=respuesta;
                    System.out.println("Mi número es MAYOR que " + respuesta + 
                            "\nEl rango ahora es: [" + min + ":" + max + "]");
                    intentos--;                
                }
                else if (respuesta>numazar) {
                    if (max>respuesta) max=respuesta;
                    System.out.println("Mi número es MENOR que " + respuesta + 
                            "\nEl rango ahora es: [" + min + ":" + max + "]");
                    intentos--;
                }
            
                if (intentos==0 && respuesta!=numazar) {
                System.out.println("Te quedaste sin intentos, el número era " + numazar);
                }
            }
                       
            //ESTO DE AQUI ABAJO ME HA COSTADO HORRORES SACARLO!!!!
            //ME QUEDABA PERENNE EN EL BUCLE DE JUEGO, PFFF
            
            int final0=0;
            while (final0==0) {
                System.out.println("\nTeclea (s/n) para reintentarlo");
                Scanner fin=new Scanner(System.in);
                String entrad = fin.nextLine();

                if (entrad.equalsIgnoreCase("n")==true) {                
                    final0++;juego++;
                }
                if (entrad.equalsIgnoreCase("s")==true) {
                    final0++;
                }
            }
        }
    }    
}

