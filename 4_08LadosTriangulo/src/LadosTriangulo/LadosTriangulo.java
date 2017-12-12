/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LadosTriangulo;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class LadosTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        System.out.print("Por favor, introduzca el primer número\n");
        int numero1 = entradaEscaner.nextInt();
        System.out.print("Por favor, introduzca el segundo número\n");
        int numero2 = entradaEscaner.nextInt();
        System.out.print("Por favor, introduzca el tercer número\n");
        int numero3 = entradaEscaner.nextInt();
        
// Calculando el mayor y convirtiendo número1 en el mayor
        int intermedio;
        if(numero1 > numero2 && numero1 > numero3){
        
        }
        else{
            if(numero2 > numero1 && numero2 > numero3){
            intermedio=numero2;
            numero2=numero1;
            numero1=intermedio;
            }
            else{
            intermedio=numero3;
            numero3=numero1;
            numero1=intermedio;
            }
        }

// Calculamos las operaciones con if-else      
        if (numero1 >= numero2 + numero3) {
            System.out.print("No es un triángulo\n");
        }
        else if (numero1 * numero1 == (numero2 * numero2) + (numero3 * numero3)) {
            System.out.print("Triángulo rectángulop\n");
        }
        else if (numero1 * numero1 >= (numero2 * numero2) + (numero3 * numero3)) {
        System.out.print("Triángulo obtusángulo\n");
        }
        else if (numero1 * numero1 <= (numero2 * numero2) + (numero3 * numero3)) {
        System.out.print("Triángulo acutángulo\n"); 
        }
        
    }
    
}
