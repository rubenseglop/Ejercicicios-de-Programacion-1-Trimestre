/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author Ruben
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        int secuencia = 1;
        for(int i=1;i<=100;i++) {           
            switch (secuencia) {
                case 1: System.out.println("Hola: " + i ); secuencia = 2; break;
                case 2: System.out.println("Adiós: " + i ); secuencia = 1;
            }
        }
    }
}
    
