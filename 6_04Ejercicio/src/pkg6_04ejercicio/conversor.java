/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_04ejercicio;

/**
 *
 * @author Ruben
 */

public class conversor {
    public static void main(String args[]) {
        Convertir numeros = new Convertir();
        
        System.out.println(numeros.ascii(65));
        System.out.println(numeros.ordinal(numeros.ascii(65)));
     
        
        
}
  public static class Convertir {
    public int ordinal(char c) {
        return ((int) c);
    }
    public char ascii(int i) {
        return ((char) i);
    }  
  }
}
