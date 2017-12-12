/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseMate;

import static java.lang.Math.abs;

/**
 *
 * @author Ruben
 */
public class Mate {
    static double resultado;

        
    public Mate() {
        resultado=0;
    }
    
    /**
     * Método factorial que nos cacula el factorial de un número
     * @param valor - el número a calcular su factorial
     * @return - devuelve un String con el resultado
     */
    public static String factorial(int valor) {
        int valorini=valor;
        if (valor != abs(valor)){
        
        resultado=1;
        while (Math.abs(valor)>1){            
            resultado = resultado * valor; 
            valor++;
            }
        return ("El número factorial de "+ valorini + " es: " + resultado); 
        
        }
        else {
        
        resultado=1;
        while (valor>1){            
            resultado = resultado * valor; 
            valor--;
            }
        return("El número factorial de "+ valorini + " es: " + resultado); 
        }
        
        
    }
    /**
     * Método primo para averiguar si un número es primo
     * @param valor
     * @return - devuelve un String con el resultado
     */
    public static String primo(int valor) {
        resultado=0;
        for (int i=1;i<=valor;i++) {
            if (valor%i==0) {
                resultado++;//Si es divisible, sumo resultado.
            }      
        }
        System.out.print(valor);
        if (resultado==2) return (" es un número primo"); // Un número primo es divisible siempre por 1 y por su própio número (por tanto un máximo de 2 veces)
        else return (" no es un número primo"); // cualquier otro valor (el 0 y el 1 están desestimados) indica que no es un número primo
        
    }
    /**
     * Método perfecto que nos ayuda a determinar si un número es perfecto
     * @param valor
     * @return - devuelve una String con el resultado
     */
    public static String perfecto(int valor) {
        resultado=0;       
        for (int i=1;i<valor;i++) { 
            if (valor%i==0) {
                resultado=resultado + i;     
            }
        }
        
        if (resultado==valor) {  
            return (valor + " es perfecto");
        } 
        else {
            return (valor + " no es perfecto");
        }
    }    
    /**
     * Método números amigos, devuelve si dos números son amigos
     * @param valor1
     * @param valor2
     * @return devuelve una String con el resultado de si son amigos
     */
    public static String amigos(int valor1, int valor2) {
        resultado=0;
        for(int i=1;i<valor1;i++){  
             if(valor1%i==0){
                resultado=resultado+i;
             }
        }
        if(resultado==valor2){ //si el número anterior es divisible tantas veces como número2
            resultado=0;
            for(int i=1;i<valor2;i++){ 
                if(valor2%i==0){
                   resultado=resultado+i;
                }
            }
           if(resultado==valor1) return (valor1 + " y " + valor2 + " son amigos"); // y también el número2 es divisible tantas veces como número1, son amigos
           else return (valor1 + " y " + valor2 + " no son amigos");
        }        
        else return (valor1 + " y " + valor2 + " no son amigos");
    }   
    /**
     * Método MCD, me realiza las operaciones de encontrar el mínimo común divisor
     * @param valora - primer número
     * @param valorb - segundo número
     * @return - devuelve una String con el resultado obetenido
     */
    public static String minimocomundivisor(int valora,int valorb) {
        
        String cadena="M.C.D. de " + valora + " y " + valorb + " es ";
        do{
            resultado=valorb;
            valorb=valora%valorb;
        } while (valorb!=0);
        
        return (cadena + resultado);
    }   
    /**
     * Método potencia, me realiza el cáculo potencia
     * @param valor1 - valor de la base
     * @param valor2 - valor del exponente
     * @return - devuelve un String con el valor exponenciado
     */      
    public static String potencia(int valor1,int valor2) {
    resultado=0;
    for (int i=0;i<valor2;i++) {
        resultado= resultado + (valor1 * valor1); 
        
    }
    return ("La potencia de " + valor1 + " a " + valor2 + " es: " + (resultado));    
    }
     
        
   
}
