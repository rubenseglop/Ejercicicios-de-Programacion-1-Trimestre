/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BolasUrnaTrampa;

/**
 *
 * @author ruben
 */
public class urnaTrampa extends urna {
    
    public urnaTrampa(int a) {
        super(a);
    }
    public void trampa() {
        int aleatorio = (int) Math.round(Math.random()*1000);
        
        if (aleatorio<=2) { // 2/1000 posibilidad de salir la urna trampa (casi nunca vaya)
            
            if (bolas_blancas>=1 && bolas_negras>=1) {
                int aleatorio2 = (int) Math.round(Math.random()*100);
                if (aleatorio2>=50) { // quito al 50% blanca o negra
                    bolas_negras--;
                    bolas_blancas++;
                    System.out.print("[BLANCAS " + bolas_blancas + " - NEGRAS " + bolas_negras+"] -->");
                    System.out.println("TRAMPA - Quito una negra y pongo una blanca");
                }
                else {
                    bolas_negras++;
                    bolas_blancas--;
                    System.out.print("[BLANCAS " + bolas_blancas + " - NEGRAS " + bolas_negras+"] -->");
                    System.out.println("TRAMPA - Quito una blanca y pongo una negra");
                }
            } 
        }
    }
}
