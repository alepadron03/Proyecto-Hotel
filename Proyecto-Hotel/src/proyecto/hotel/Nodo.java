/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.hotel;

/**
 *
 * @author alexp
 */
public class Nodo {
    private Habitacion dato;
    private Nodo pNext;

    public Nodo(Habitacion dato) {
        this.dato = dato;
        this.pNext = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Habitacion dato) {
        this.dato = dato;
    }

    public Nodo getpNext() {
        return pNext;
    }

    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }
    
    
    
    
    
}

