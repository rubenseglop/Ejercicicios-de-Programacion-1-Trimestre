/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BolasUrnaTrampa;

/**
 *
 * @author Ruben
 */
public class urna {
    protected int bolas_blancas=0,bolas_negras=0;
 
    protected int bola_actual;

    
    public urna(int a){ // Constructor
        bola_actual=a;
        for (int e=0;e<bola_actual;e++) {
            int bolita_azar =  (int)(Math.random()*100);
            
            if (bolita_azar>=50) bolas_blancas++;
            else if (bolita_azar<50)bolas_negras++;
        }
    }

    public void saca_bolas() {
        int repeticion=0;
        int contar_blanca=0;
        int contar_negra=0;
        do {
            
            if (bola_actual<=1 && (bolas_blancas+bolas_negras==1)) { //Si es la última bola, salgo bucle
                if (bolas_blancas==0) repeticion=2;
                else if(bolas_negras==0) repeticion=2;
            }
            else if(bola_actual>=2) { //Quedan bolas en la urna que pueden ser sacadas
                
                int azar=(int)(Math.random()*100); //tiro un numero al azar (0-100)
                if (azar>50 && bolas_blancas>0) { //(>50% sale blanca, quito blanca)
                    repeticion++;
                    bola_actual--;
                    bolas_blancas--;
                    contar_blanca++;

                }
                else if(azar>50 && bolas_blancas==0) { //sale blancas pero no quedan (quito una si quedan negra)
                    if (bolas_negras>1) {
                        repeticion++;
                        bola_actual--;
                        bolas_negras--;
                        contar_negra++;
                }

                }
                if (azar<50 && bolas_negras>0) {  //sale negra, quito negra
                    repeticion++;
                    bola_actual--;
                    bolas_negras--;
                    contar_negra++;
                    
                }
                if (azar<50 && bolas_negras==0) { //sale negra, pero no quedan (quito una blanca)
                    if (bolas_blancas<1) {
                        repeticion++;
                        bola_actual--;
                        bolas_blancas--;
                        contar_blanca++;
                    }
                }
            }   
            if (contar_blanca==2 || contar_negra==2) { //Si ya meti previamente dos blancas sumo una negra
                System.out.print("[");     
                System.out.print("BLANCAS " + bolas_blancas + " - NEGRAS " + bolas_negras+"] -->");
                System.out.println("2 bolas iguales, + bola negra");
                bolas_negras++;
                bola_actual++;
                }
            else if (contar_blanca+contar_negra==2) {
                System.out.print("[");     
                System.out.print("BLANCAS " + bolas_blancas + " - NEGRAS " + bolas_negras+"] -->");
                System.out.println("2 bolas diferentes, + bola blanca");
                bolas_blancas++;
                bola_actual++;
            }
            
             
        }while (repeticion==0||repeticion==1);        
    }
    public void mira_bolas() {
        System.out.print("[");     
        System.out.println ("BLANCAS " + bolas_blancas + " - NEGRAS " + bolas_negras+"]");   
    }
    public int dime_bola_actual(){
        return (bola_actual);
    }
    public void resultado_final() {
        if (bolas_blancas==0) System.out.println("NEGRA");
        else if(bolas_negras==0) System.out.println("BLANCA");
    }
    public void  urnaTrampa() {
        int azar=(int)(Math.random()*100);
        if (azar<=2) {
            
        }
        
    }
}
  

