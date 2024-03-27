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
            insertar(Root, data);
        }
    }
    public NodoHabitacion insertar(NodoHabitacion Root, Habitacion data){
        NodoHabitacion newNodo = new NodoHabitacion(data);
        
        if(esVacio()){
            return newNodo;
        }
        else{
            if(Root.getNroHab().compareTo(newNodo.getNroHab())>0){
                if(Root.getHijoIzq()==null){
                    Root.setHijoIzq(newNodo);
                }else{
                    insertar(Root.getHijoIzq(),data);
                }
                
            }else if(Root.getNroHab().compareTo(newNodo.getNroHab())<0){
                if(Root.getHijoDer()==null){
                    Root.setHijoDer(newNodo);
                }else{
                    insertar(Root.getHijoDer(),data);
                }
            }else{
                 Root.getLista().InsertarFinal(data); 
//                 return Root;
            }
        }
        return rebalance(Root);
    }
    

    
    public int altura(NodoHabitacion node) {
        if (node == null) {
            return -1;
        } else {
            return node.getAltura();
        }
    }
    
    public void actualizarAltura(NodoHabitacion nodo){
        nodo.setAltura(1 + Math.max(altura(nodo.getHijoIzq()), altura(nodo.getHijoDer())));
    }
    
  
    public NodoHabitacion rotarDerecha(NodoHabitacion y) {
        NodoHabitacion x = y.getHijoIzq();
        NodoHabitacion T2 = x.getHijoDer();
        x.setHijoDer(y);
        y.setHijoIzq(T2);

        actualizarAltura(y);
        actualizarAltura(x);
        return x;
    }
     public NodoHabitacion rotarIzquierda(NodoHabitacion x) {
        NodoHabitacion y = x.getHijoIzq();
        NodoHabitacion T2 = y.getHijoDer();
        y.setHijoIzq(x);
        x.setHijoDer(T2);
        
        actualizarAltura(y);
        actualizarAltura(x);
        return y;
    }
    
    public int balance(NodoHabitacion nodo){
        if (nodo == null){
            return 0;
        }else{
            return altura(nodo.getHijoDer()) - altura(nodo.getHijoIzq());
        }
    }
    
    public NodoHabitacion rebalance(NodoHabitacion nodo){
        nodo.setAltura(altura(nodo));
        int balance = balance(nodo);
        if(balance > 1){
            if(altura(nodo.getHijoDer().getHijoDer()) > altura(nodo.getHijoDer().getHijoIzq())){
                nodo = rotarIzquierda(nodo);
            }else{
                nodo.setHijoDer(rotarDerecha(nodo.getHijoDer()));
                nodo = rotarIzquierda(nodo);
            }
        }else if(balance > 1){
            if(altura(nodo.getHijoIzq().getHijoIzq()) > altura(nodo.getHijoIzq().getHijoDer())){
                nodo = rotarDerecha(nodo);
            }else{
                nodo.setHijoIzq(rotarIzquierda(nodo.getHijoIzq()));
                nodo = rotarDerecha(nodo);
            }
        }
        return nodo;
    }
    
    
    
    public void imprimir(NodoHabitacion nodo){
        if(nodo!=null){
            imprimir(nodo.getHijoIzq()); // Visita el hijo izquierdo
            nodo.getLista().imprimir(); // Imprime el valor del nodo
            imprimir(nodo.getHijoDer()); // Visita el hijo derecho
        }
    }
    
    
    public NodoHabitacion buscar(String data){
        NodoHabitacion aux = this.Root;

        if (aux==null){ 
            return null;
        }else{
            NodoHabitacion info = buscador(aux, data);
            return info;
        }
        
    }
    
    public NodoHabitacion buscador(NodoHabitacion aux, String data){
        
        if(aux==null) return null;
        
        if(aux.getNroHab().equals(data)){
            return aux;
        }else if(aux.getNroHab().compareTo(data) > 0){
            return buscador(aux.getHijoIzq(), data);
        }else{
            return buscador(aux.getHijoDer(),data);
        }
    }
    
    
}
