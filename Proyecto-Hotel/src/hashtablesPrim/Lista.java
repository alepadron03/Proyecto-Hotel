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
    public void insertar(int numhab, String nombre, String apellido){ 
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
    
    public void insertarnodo(int numhab, String nombre, String apellido){
        clientes ultimo=new clientes(numhab, nombre, apellido);
        
        this.primero=ultimo;
    }
    
    public void insertarfinal(int numhab, String nombre, String apellido){
        clientes ultimo=new clientes(numhab, nombre, apellido);
        this.primero.siguiente=ultimo;
    } 
    //para meter un nodo dentro de 2:
    public void insertarentredos(int numhab, String nombre, String apellido){
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
    public void buscarultimo(int numhab, String nombre, String apellido){ 
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
}
//    public String imprimir(){
//        Arista auz = this.primero;
//        String s = "";
//        while(auz!= null){
//            s+= auz.dato + ", ";
//            auz = auz.siguiente;
//        }
//        return s;
//    }
    
    
//    public void hacerLista(int dato){
//        Arista nuevo=new Arista(dato);
//        Arista aux=this.primero; 
//        if(aux==null){ //incluimos esto porque siempre es necesario saber si la lista tiene un primer elemento nulo o no
//            this.primero=nuevo; //aqui esta bien porque se declara "nuevo"
//        }
//        while(aux.siguiente!=null){
//            aux=aux.siguiente;
//        }
//        aux.siguiente=nuevo; //esto esta muy bien
    
    
/*
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
    */
    
    
    
    
  
  
  
  
        
//    public void rotar(Lista L, int dato){
//        Arista primero=this.primero;
//        Arista aux1=L.primero;
//        int veces=dato;
//        int contador=0;
//        
//        while(aux1.siguiente!=null){
//            aux1=aux1.siguiente;
//        }
//        Arista NodoUltimo=aux1;
//        aux1=L.primero;
//        
//        while(aux1.siguiente!=null && contador<=veces){
//            
//            
//            aux1=L.primero;
//            
//            NodoUltimo.siguiente=this.primero; //aqui hacemos que el siguiente del ultimo sea el primero de la listaUltimo ¡ 
//            NodoUltimo = this.primero; //el primero es lo que quiero cambiar, y lo segundo es el valor
//            this.primero=this.primero.siguiente; //aqui hacemos que el segundo sea el primero de la lista
//            NodoUltimo.siguiente=null;
//            contador++;
//        }
//    }
    
//    public void rotar2(Lista L, int dato){
//
//        int contador=0;
//        
//        while(contador<=dato){
//                    
//            Arista aux=L.primero;
//            L.insertarfinal(aux.dato);
////si estas dos funciones tienen el mismo tipo de ciclo (que hay 1), se suman las complejidades de estas funciones, de la función en sí y de la que llama. si una funcion es 0(n), y otra también (dentro de la funcion que llama entonces sera 2O(n))
//            L.eliminar(aux.dato);
//            contador++;
//        }
//    }
    
//    public int cuantasvecesLista1Lista2(Lista lista1, Lista lista2){
//        int contador=0;
//        int tamañoLista2=lista1.tamaño;
//        int veceQuerepite=0;
//        Arista aux1=lista1.primero;
//        Arista aux2=lista2.primero;
//        
//        while(aux1.siguiente!=null){
//            if(aux1.dato==aux2.dato){
//                aux1=aux1.siguiente;
//                contador++;
//            }else{
//                aux1=lista1.primero; //la lista referencial empieza de nuevo
//                contador=0;
//            }
//            aux2=aux2.siguiente;            
//            if(contador==tamañoLista2){
//                veceQuerepite++;
//            }
//        }
//        return veceQuerepite;
//    }
//    
//    public int cuantasvecesLista1Lista3(Lista lista1, Lista lista2){
//        int contador=0;
//        Arista aux1 = lista1.primero;
//        Arista aux2 = lista2.primero;
//        
//        while(aux2!= null){
//            if(aux1.dato == aux2.dato){
//                aux1 = aux1.siguiente;
//            }else{
//                aux1 =lista1.primero;
//        }
//            aux2 = aux2.siguiente;
//            
//            if(aux1 == null){
//                contador++;
//                aux1 = lista1.primero;
//            }
//        }
//        return contador;
//            
//    }
//}




/*
O(n) si tiene un ciclo 

O(n2) es un ciclo dentro de otro

logO(n)
*/
/*
  public String imprimirListas(){
        String listastring="";
        nodo aux=this.primero;
        
        while (aux!=null){
            listastring+=aux.dato;
            aux=aux.siguiente;
        }
        return listastring;
        
    }
*/


//para convertir todo en privado (  QUE DEBE HACERSE...) Redactor - > Encapsulate fields - > select all
//Insert code también sirve para poder insertar un constructor completo


/*
Instrucción
hacer una calculadora en que puedas insertar dos numeros por digito en que
*/

//Necesitamos hacer un método en que podamos hacer una lista
//Necesitamos otro en que puedan sumarse las listas
//Necesitamos uno en que pueda imprimirse la lista





