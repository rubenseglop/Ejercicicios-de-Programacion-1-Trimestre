/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salario;
import java.util.Scanner;
/**
 *
 * @author Ruben
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        int salarioFabricante, salarioDiseno;
        System.out.print("Por favor, introduzca el valor del producto\n");
        String entradaTeclado;
        entradaTeclado = entradaEscaner.nextLine(); //Invocamos un metodo sobre un objeto Scanner
        salarioFabricante = Integer.parseInt(entradaTeclado) / 5; // Dividimos entre 5 personas
        salarioDiseno = salarioFabricante * 2; // Cobra el doble
        System.out.println("El salario del diseñador es: " + salarioDiseno + "\nEl salario de un fabricante es: " + salarioFabricante);   
     
    }
}
