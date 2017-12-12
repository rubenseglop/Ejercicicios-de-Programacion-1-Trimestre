package Notas;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruben
 */
public class Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una nota");
        int nota= entrada.nextInt();
        if (nota>0 || nota<10) {
            if (nota>=0 && nota<3) System.out.println("Muy Deficiente");
            if (nota>=3 && nota<5) System.out.println("Insuficiente");
            if (nota>=5 && nota<6) System.out.println("Suficiente");
            if (nota>=6 && nota<7) System.out.println("Bien");
            if (nota>=7 && nota<9) System.out.println("Notable");
            if (nota>=9 ) System.out.println("Sobresaliente");
        }
    }
}
//0 >= Nota < 3 Muy deficiente
//3 >= Nota < 5 Insuficiente
//5 >= Nota < 6 Suficiente
//6 >= Nota < 7 Bien
//7 >= Nota < 9 Notable
//9 >= Nota =< 10 Sobresaliente