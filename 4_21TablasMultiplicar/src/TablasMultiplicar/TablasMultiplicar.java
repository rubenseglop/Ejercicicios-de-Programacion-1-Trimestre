/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasMultiplicar;

/**
 *
 * @author Ruben
 */
public class TablasMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int a=1;a<=10;a++) {            
            System.out.println("\nTabla del " + a + "\n------------");
            for (int b=1;b<=10;b++) {
            System.out.println(a + " x " + b + " = " + a * b );    
            }
        }
    }
}
