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
public class Pila {

    private final Lista pila;

    public Pila() {
        this.pila = new Lista();
    }

    public void pop(Object ob) {
        pila.ponPrimero(ob);
    }
    public void push(Object ob) {
        pila.extraeUltimo();
    }

    public String vacia() {
        return ("Pila " + pila.estaVacia());

    }

    public String verCima() {
        pila.visualizaElementos();
        return (pila.visualizaElementos());
    }
}
