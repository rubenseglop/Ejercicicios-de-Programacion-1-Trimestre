/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasPilasColas;

/**
 *
 * @author Ruben
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * Ejercicio 6.01
         */
        Lista lista = new Lista();

        System.out.println("Listas\n======\n");
        System.out.println("Lista " + lista.estaVacia()); // Al inicio debe estar vacía
        lista.ponPrimero(50); // Meto al inicio de lista un entero       
        System.out.println("Lista " + lista.estaVacia()); // Ahora la lista da llena
        lista.ponPrimero(25); // Meto al inicio de lista un entero (el que fuera primero, pasa ahora a ser segundo)
        lista.ponUltimo("Objeto"); // Meto al final de la lista un String
        lista.ponUltimo("Objeto2"); // Meto al final de la lista un String
        lista.visualizaElementos();
        System.out.println(lista.extraePrimero()); //saco el primer objeto
        System.out.println(lista.extraeUltimo()); //saco el último objeto

        /**
         * Ejercicio 6.02
         */
        Pila pila = new Pila();

        System.out.println("\nPilas\n======\n");
        System.out.println(pila.vacia());
        pila.pop(50);
        pila.pop("Objeto1");
        pila.pop(40);
        System.out.println(pila.vacia());
        System.out.println(pila.verCima());
        pila.push(pila);
        System.out.println(pila.verCima());

        /**
         * Ejercicio 6.03
         */
        Colas cola = new Colas();

        System.out.println("\nColas\n======\n");
        System.out.println(cola.vacia());
        cola.ponEnCola(50);
        cola.ponEnCola("Objeto1");
        cola.ponEnCola(40);
        System.out.println(cola.vacia());
        System.out.println(cola.frente());
    }
}
