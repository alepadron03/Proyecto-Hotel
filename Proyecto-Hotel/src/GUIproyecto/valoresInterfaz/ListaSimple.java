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
public class ListaSimple {
    nodo primero;
   //si quisiera hacer un ATRIBUTO si es CICLO, entonces es MEJOR inicializarla en lista SIMPLE.
 

    public ListaSimple() {
        this.primero = null;
        
    }
    
    public boolean esCiclo(){ //este método verifica ei es una lista circular
        nodo aux=this.primero;
        while (aux.siguiente!=null && aux.visitado==false){
            aux=aux.siguiente; 
            aux.visitado=true;
    }
        if(aux.visitado==true){
            return true;
    }else{
            return false;
        }
            
        //ultimo.siguiente=this.primero; //esto apunta del ultimo hacia el principio
    
    }
    
    public void buscarPosicion(int dato, int pos){ //
        int contador=1;
        nodo nuevo = new nodo(dato);
        nodo aux=this.primero;
        while (aux.siguiente!=null){
            aux=aux.siguiente;
        }
        aux.siguiente = nuevo;
        
        if(pos > 0){
            aux = this.primero;
            while (pos > contador){ //aqui lo ponemos para que la posición del recorrido este justo
                aux=aux.siguiente;
                contador++;
                
            }
            nuevo.siguiente=aux; //aqui ya decimos que el aux apunta hacia el nuevo.
        }
         //
    }
    
    public String buscarUltimoString(){
        nodo aux=this.primero;
        if(this.primero!=null){
            while(aux.siguiente!=null){
                aux=aux.siguiente;
            }
        return aux.toString();    
        }
        return null;
    }
    
    public void iniciarYeliminar(){ //esto es para eliminar toda la lista 
        this.primero=null;
    }
    
    public int tamano(){
        int contador=0;
        nodo aux=this.primero;
        while (aux.siguiente!=null && aux.visitado==false){
            aux=aux.siguiente;
            aux.visitado=true;
            contador++;
        }
        return contador;
    }
    
    public String imprimir(){
        String cadena = "";
        nodo aux=this.primero;
        while (aux.siguiente!=null && aux.visitado==false){
            cadena += aux.dato;
            aux=aux.siguiente;
            aux.visitado=true;
            
            
        }
        return cadena;      

    }
    
    public void hacerLista1(int dato){
        nodo ultimo=new nodo(dato);
        nodo aux=this.primero;
        if(this.primero==null){
            this.primero = ultimo;
        }else{
         while (aux.siguiente!=null){
            aux=aux.siguiente;
        }
        aux.siguiente=ultimo; //aquí el apuntador del ultimo apunta hacia el ultimo
        }
    }
    
   public String sumarListas(ListaSimple lista2){
       String num1 = this.imprimirListas(); //primero hacemos las listas, las convertimos ambas en String con ImprimirListas
       String num2 = lista2.imprimirListas(); //y aqui tambien, que es la que pusimos en los parametros; ahora lo vemos con imprimirLista
       
       int suma = Integer.parseInt(num1) + Integer.parseInt(num2); //aqui los sumamos en forma de numeros enteros
       String resultado = String.valueOf(suma); //Aquí hacemos un string con String.valueof(suma)
       ListaSimple resultadoLista=new ListaSimple(); //Aquí hacemos una nueva lista con "lista resultadoLista=new lista"
       
       for (int i = 0; i < resultado.length(); i++) { //aquí recorremos toda la lista
           char c = resultado.charAt(i); //aquí con char c=resultado.charAt(i)
           String r = String.valueOf(c); //aqui con valueof  hacemos un string
           int dato = Integer.parseInt(r); //aquí con integer.parseint(r) convertimos el string en entero
           resultadoLista.hacerLista1(dato); //aquí hacemos la lista con el dato con la lista del principio
       }
       return resultadoLista.imprimirListas(); //aquí ahora tenemos que imprimir la lista hecha con resultado lista
       
   }
    
   public void insertarfinal(int dato){
        nodo ultimo=new nodo(dato);
        this.primero.siguiente=ultimo;
   }
    /**
     *
     * @return
     */
    public String imprimirListas(){
        String listastring="";
        nodo aux=this.primero;
        
        while (aux!=null){
            listastring+=aux.dato;
            aux=aux.siguiente;
        }
        return listastring;
        
    }
    
}
