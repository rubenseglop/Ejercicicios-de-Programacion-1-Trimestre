/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContarNumerosPares;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class ContarNumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        System.out.println("Por favor, introduzca el primer número");
        int numero1 = entradaEscaner.nextInt();
        System.out.println("Por favor, introduzca el segundo número mayor que el anterior");
        int numero2 = entradaEscaner.nextInt();
        if (numero2<=numero1) {
            System.out.println("El segundo número no puede ser menor o igual que el primer número");
        }
        int suma=0, contador=0;      
        
        /**
         * Bucle que realiza un contador para números pares y otro con la suma
         */
        while (numero1<=numero2) {
            
            if (numero1%2==0){
                contador++;
                suma = suma + numero1;                                
            }
            numero1++;
        }
        System.out.println("La suma de números pares entre ese rango es de: " + suma);
        System.out.println("El número de numeros pares entre ese rango es de: " +contador);
    }    
}
