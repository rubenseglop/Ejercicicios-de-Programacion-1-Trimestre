/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BolasUrnaTrampa;
import javax.swing.JOptionPane;
/**
 *
 * @author Ruben
 */
public class Bolas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bolas=Integer.parseInt (JOptionPane.showInputDialog("Introduce el número de bolas"));
        urnaTrampa mi_urna=new urnaTrampa(bolas); // creo una instancia de urna llamada mi_urna
        System.out.println("Bienvenido al mundo de las urnas con trampa\nEl número de bolas es de: " + mi_urna.dime_bola_actual());
        
        
        int repeticion=0;
        while (repeticion==0) {
            

            if (mi_urna.dime_bola_actual()==1) {
                
                System.out.println("\nEl resultado final es");
                mi_urna.mira_bolas(); 
                System.out.print("LA ULTIMA BOLA ES: ");
                mi_urna.resultado_final();
                repeticion++;
            }
            else {
                mi_urna.mira_bolas(); 
                mi_urna.saca_bolas();
                mi_urna.mira_bolas();
                mi_urna.trampa(); //Posibilidad de cambiar una bola (urna trampa)

                       
            }
           
        }
    }
}
