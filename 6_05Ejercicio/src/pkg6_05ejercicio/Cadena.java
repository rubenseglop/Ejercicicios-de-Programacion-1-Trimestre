/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_05ejercicio;

/**
 *
 * @author Ruben
 */
public class Cadena {

    /**
     * Imprime cadena
     */
    public void visualizaCadena() {
        System.out.println(cadena);
    }
    private String cadena = "";

    /**
     * Método especial constructor
     *
     * @param cadena - valor de una cadena de caracteres
     */
    public Cadena(String cadena) {
        this.cadena = cadena;
    }

    /**
     * Método que convierte un ascii en su valor numérico
     *
     * @param caracter
     * @return
     */

    public int ordinal(char caracter) {
        return ((int) caracter);
    }

    /**
     * Método que convierte un número en su equivalente ascii
     *
     * @param numero
     * @return
     */
    public char ascii(int numero) {
        return ((char) numero);
    }

    public void invierteCadena() {
        String invierte = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invierte = invierte + cadena.charAt(i);
        }
        cadena = invierte;
    }

    /**
     * Método que suma en 5 el número ascii de la cadena
     */
    public void encriptaCadena() {
        String encripta = "";
        char c;
        for (int i = 0; i < cadena.length(); i++) {
            c = cadena.charAt(i);
            encripta = encripta + ascii(ordinal(c) + 5);
        }
        cadena = encripta;
    }

    /**
     * Método que resta en 5 el número ascii de la cadena
     */
    public void desencriptaCadena() {
        String desencripta = "";
        char caracter;
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            desencripta = desencripta + ascii(ordinal(caracter) - 5);
        }
        cadena = desencripta;
    }

}
