/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DadosSuman10;

/**
 *
 * @author Ruben
 */
public class Dadossuman10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dado1,dado2;
        int suma=0;
        for (int i=0;i<=100;i++) {
            dado1 = Math.round(Math.random()*5)+1; // me da números entre 1-6 (valores de un dado)
            dado2 = Math.round(Math.random()*5)+1; // me da números entre 1-6 (valores de un dado)
            
            if (dado1+dado2==10) { // si coincide el azar que ambos suman 10
                System.out.println(dado1 + " + " + dado2);
                suma++;
            }
        }
        System.out.println("Me han salido " + suma + " veces el número 10");
    }
    
}
