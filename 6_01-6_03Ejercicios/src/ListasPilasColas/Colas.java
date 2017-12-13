/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasPilasColas;

/**
 *
 * @author ruben
 */
public class Colas {

    private final Lista cola;

    public Colas() {
        this.cola = new Lista();
    }
    
    /*
     * extraeDeCola(), ponEnCola(Object ob), vacia() y frente()
     * 
     */

    public void extraeDeCola(){
        cola.extraeUltimo();
                
    }
    
    public void ponEnCola(Object ob) {
        cola.ponUltimo(ob);
    }
    
    public String vacia() {
        return ("Cola " + cola.estaVacia());

    }

    public String frente() {
        return (cola.visualizaElementos());
    }
}
