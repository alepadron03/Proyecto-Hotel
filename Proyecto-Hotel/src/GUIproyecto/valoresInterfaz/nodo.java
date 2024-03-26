/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIproyecto.valoresInterfaz;

import GUIproyecto.valoresInterfaz.*;

/**
 *
 * @author joseg
 */
public class nodo {
    int dato;
    nodo primero;
    nodo ultimo;
    nodo siguiente; //aquí es por el nodo siguiente
    boolean visitado;//Esto lo hacemos porque NO es CIRCULAR ni DOBLE

    public nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.visitado=false;
        this.primero=primero;
        this.ultimo=ultimo;
    }
}
