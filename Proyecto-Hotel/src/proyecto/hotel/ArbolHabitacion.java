/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.hotel;

/**
 *
 * @author alexp
 */
public class ArbolHabitacion {
    private NodoHabitacion Root;

    public ArbolHabitacion() {
        this.Root = null;
    }

    public NodoHabitacion getRoot() {
        return Root;
    }

    public void setRoot(NodoHabitacion Root) {
        this.Root = Root;
    }
    
    public boolean esVacio(){
        return  getRoot()==null;
        
    }
    
    
    public void insertar(Habitacion data){
        NodoHabitacion newNodo=new NodoHabitacion(data);
        if(esVacio()){
            this.Root=newNodo;
        }else{
            insertar(Root, newNodo);
        }
    }
    public void insertar(NodoHabitacion Root, NodoHabitacion newNodo){
        if(esVacio()){
            this.Root=newNodo;
        }
        else{
            if(Root.getNroHab().compareTo(newNodo.getNroHab())>0){
                if(Root.getHijoIzq()==null){
                    Root.setHijoIzq(newNodo);
                }else{
                    insertar(Root.getHijoIzq(),newNodo);
                }
                
            }else if(Root.getNroHab().compareTo(newNodo.getNroHab())<0){
                if(Root.getHijoDer()==null){
                    Root.setHijoDer(newNodo);
                }else{
                    insertar(Root.getHijoDer(),newNodo);
                }
            }else{
                System.out.println("El elemento ya se encuentra en el arbol");
            }
        }
        
    }
    
    public int altura(NodoHabitacion node) {
        if (node == null) {
            return 0;
        } else {
            return Math.max(altura(node.getHijoIzq()), altura(node.getHijoDer())) + 1;
        }
    }
  
    public NodoHabitacion rotarDerecha(NodoHabitacion y) {
        NodoHabitacion x = y.getHijoIzq();
        NodoHabitacion T2 = x.getHijoDer();
        x.setHijoDer(y);
        y.setHijoIzq(T2);

        y.setAltura(Math.max(altura(y.getHijoIzq()), altura(y.getHijoDer())) + 1);
        x.setAltura(Math.max(altura(x.getHijoIzq()), altura(x.getHijoDer())) + 1);
        return x;
    }
}
