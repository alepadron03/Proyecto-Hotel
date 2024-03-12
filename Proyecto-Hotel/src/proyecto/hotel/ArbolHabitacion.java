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
            if(Root.getData().getNum_hab().compareTo(newNodo.getData().getNum_hab())>0){
                if(Root.getHijoIzq()==null){
                    Root.setHijoIzq(newNodo);
                }else{
                    insertar(Root.getHijoIzq(),newNodo);
                }
                
            }else if(Root.getData().getNum_hab().compareTo(newNodo.getData().getNum_hab())<0){
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
    
    
    
    
}
