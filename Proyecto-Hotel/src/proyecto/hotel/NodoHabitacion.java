/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.hotel;

/**
 *
 * @author alexp
 */
public class NodoHabitacion {
    private NodoHabitacion hijoIzq;
    private NodoHabitacion hijoDer;
    private Habitacion data;

    public NodoHabitacion(Habitacion data) {
        this.hijoIzq = null;
        this.hijoDer = null;
        this.data = data;
    }

    public NodoHabitacion getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoHabitacion hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoHabitacion getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoHabitacion hijoDer) {
        this.hijoDer = hijoDer;
    }

    public Habitacion getData() {
        return data;
    }

    public void setData(Habitacion data) {
        this.data = data;
    }
    
    public boolean hasDer(){
        return getHijoDer()!=null;
    }
    
    public boolean hasIzq(){
        return getHijoIzq()!=null;
    }
     public boolean esHoja(){
         return (getHijoDer()==null && getHijoIzq()==null);
     }
    
    
}
