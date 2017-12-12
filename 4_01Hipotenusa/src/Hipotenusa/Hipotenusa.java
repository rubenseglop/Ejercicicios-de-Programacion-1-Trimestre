/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hipotenusa;

/**
 *
 * @author Ruben
 */
import java.util.Scanner;
public class Hipotenusa {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("La fórmula es hipotenusa es igual a la suma de los catetos al cuadrado\n");
        System.out.println("Introduce el cateto 1");
        double cateto1=sc.nextDouble();  
        System.out.println("Introduce el cateto2");
        double cateto2=sc.nextDouble(); 
        System.out.println("Resultado es: " + Math.sqrt((cateto1*cateto1)+(cateto2*cateto2)));                
    }
}
