/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashtablesPrim;



/**
 *El enunciado
 * 
 *
 * 
 *
 * @author joseg
 */

public class Lista{
    int tamaño; //tiene un atributo de tamaño
    clientes primero; //tiene un primer nodo
    public Lista(){
        this.tamaño=0; //tamaño 0 porque no hay nada aun, this es para llamar a atributos especificos
        this.primero=null; //el primer nodo esta vacío
    }
    public void insertar(String numhab, String nombre, String apellido){ 
        clientes nuevo=new clientes(numhab, nombre, apellido);
        //par colocar el cuarto en primero
        if(primero==null){
            this.primero=nuevo;
        }
        else{
            nuevo.siguiente=this.primero;
            this.primero=nuevo;
        }
    }
    
    public void insertarnodo(String numhab, String nombre, String apellido){
        clientes ultimo=new clientes(numhab, nombre, apellido);
        
        this.primero=ultimo;
    }
    
    public void insertarfinal(String numhab, String nombre, String apellido){
        clientes ultimo=new clientes(numhab, nombre, apellido);
        this.primero.siguiente=ultimo;
    } 
    //para meter un nodo dentro de 2:
    public void insertarentredos(String numhab, String nombre, String apellido){
        clientes medio= new clientes(numhab, nombre, apellido);
        medio.siguiente = this.primero.siguiente; //primero.siguiente es el 2do
        this.primero.siguiente=medio;
    }
    /*
    Lo que hace es que primero crea un nuevo nodo
    
    Luego, hace que el siguiente del medio apunte al MISMO valor que el siguiente del primero
    
    Luego igualamos el valor al que ambos this.primero y medio.siguiente estan apuntando a "medio"
    */
    
    
    //si su siguiente es nulo parar(recorre lista hasta hallar nulo)
    public void buscarultimo(String numhab, String nombre, String apellido){ 
        clientes ultimo= new clientes(numhab, nombre, apellido);
        clientes aux=this.primero;
        while (aux.siguiente!=null){
        aux=aux.siguiente;        
    }} //illegal start of expression corchete

    //eliminar datos:
    public void eliminar(String nombre, String apellido){
        if (this.primero.nombre.equals(nombre) && this.primero.apellido.equals(apellido)){
            this.primero=this.primero.siguiente;}  //transformas esto en un apuntador hacia el siguiente.
        else{  
    
        clientes aux=this.primero;
        while (aux.siguiente!=null && !aux.siguiente.nombre.equals(nombre) && !aux.siguiente.apellido.equals(apellido)){
            aux=aux.siguiente;
        }
            if(aux.siguiente!=null){
            aux.siguiente=aux.siguiente.siguiente;} //aqui es donde se borra parte de la lista
        }
        }
    
    public clientes buscar(String nombre, String apellido){  //paso dato y devuelve el nodo ej: dame el 3 y regresa nodo 3 (ver el de jose)
//        if (this.primero.destino==nombre){ 
//            return primero;
//        }
//        else{
        clientes aux=this.primero;
        while (aux!=null && !aux.nombre.equals(nombre) && !aux.apellido.equals(apellido)){
            aux=aux.siguiente;
        }
//            if (aux..destino==nombre){
//                return aux; //¡ARREGLAR CODIGO!
//            }
//            }
        return aux;
    }
    
    public String imprimir(){
        clientes aux=this.primero;
        String S=" ";
        while(aux!=null){
            S+=aux.nombre+", ";
            S+=aux.apellido+" ";
            S+=aux.numHab+"\n";
            aux=aux.siguiente;
        }
        return S;
    }
    
    public Boolean BuscarOcupacion(String NroHab){
        clientes aux = this.primero;
        
        while(aux != null){
            if(aux.numHab.equals(NroHab)){
                return true;
            }
            aux = aux.siguiente;
        }
        return false;
    }
}