/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.hotel;

/**
 *
 * @author alexp
 */
public class ListaHabitacion {
    private Nodo pFirst;
    private Nodo pLast;
    private int size;

    public ListaHabitacion() {
        this.pFirst = null;
        this.pLast= null;
        this.size = 0;
    }
    
    public ListaHabitacion(Nodo dato){
        this.pFirst = dato;
        this.pLast = dato;
        this.size = 1;
                
    }

    public Nodo getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }



    public Nodo getpLast() {
        return pLast;
    }

    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

  
    
    
   public boolean esVacia(){
       return this.pFirst==null;
      
       
   }
  public int size(){
        int i = 0;
        
        if (esVacia()){
            return 0;
        }
        Nodo pAux= this.pFirst;
        while (pAux!=null){
            pAux=pAux.getpNext();
            i++;
        }
        return i;
    }
  
 
   /**
    * Este metodo me permite agregar un dato al final de la lista, primero pasamos por parametro el dato que queremos ingresar,
    * luego verificamos si la lista esta vacia,si es asi entonce el dato que queremos agregar se convertira en el primer dato de la lista
    * Si la lista no es vacia, creamo un nodo que nos permita recorrer la lista hasta que su pnext sea nulo, cuando el pnext es nulo ya sabemos que hemos llegado al final de la lista
    * y agregamos
    * @param dato 
    */
    public void InsertarFinal(Habitacion dato){
        if(esVacia()){
            pFirst=new Nodo(dato);
            return;
        }
        Nodo actual=pFirst;
        while(actual.getpNext()!=null){
            actual=actual.getpNext();
        }
        actual.setpNext(new Nodo(dato));
    }
    public void Eliminar(Object dato){
        if(esVacia()){
            return;
        }
        
        if(pFirst.getDato().equals(dato)){
            pFirst=pFirst.getpNext();
            return;
        }
        
        Nodo actual=pFirst;
        while(actual.getpNext()!=null){
            if(actual.getpNext().getDato()==dato){
            actual.setpNext(actual.getpNext().getpNext());
            return;
            }
            actual=actual.getpNext();
      
        }
        
    }
    public void print(){
        if(pFirst==null){
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo actual=pFirst;
        while(actual.getpNext()!=null){
            System.out.println(actual.getDato());
            actual=actual.getpNext();
        }
        System.out.println(actual.getDato());
    }
    public void deleteDuplicados(Nodo pFrist){
        if(esVacia()){
            System.out.println("No hay elementos duplicaods porque la lista es vacia");
        }
        Nodo actual=pFrist;
        while(actual.getpNext()!=null){
            
        }
    }
    
   public void InsertarInicio(Habitacion dato){
       Nodo pNuevo=new Nodo(dato);
       
       if(esVacia()){
           this.pFirst=pLast=pNuevo;     
       }
       else{
           pNuevo.setpNext(pFirst);
           this.pFirst=pNuevo;
           
       }
   }
   public void EliminaInicio(Object dato){
       if(esVacia()){
           return;
       }
       if(pFirst.getDato()==dato){
           pFirst=pFirst.getpNext();
           
       }
       if(pFirst.getDato()!=dato){
           System.out.println("El valor que ingresaste no esta en la lista");
           
       }
       
   }
   public void Insertar(Habitacion dato, int posicion){
       if(esVacia()|| posicion==0){
           this.InsertarInicio(dato);
       }
       else if(posicion>=size()-1){
           this.InsertarFinal(dato);
       }
       else if(posicion<0){
           System.out.println("Posicion invalida");
       }
       else{
           Nodo n = new Nodo(dato);
            Nodo aux = this.pFirst; // Nodo previo
            int count = 0;
            while(count < posicion -1) {
                aux = aux.getpNext();
                count++;
            }
            n.setpNext(aux.getpNext());
            aux.setpNext(n);
       }
       
   }
   public boolean buscar(Object dato){
       Nodo temp=pFirst;
       while(temp!=null){
           if(temp.getDato()==dato){
               return true;
           }
           temp=temp.getpNext();
       }
       return false;
   }
   
   public String imprimir(){
       Nodo aux = this.pFirst;
       String completo = "";
       while(aux != null){
           completo = (completo +"Nombre: "+ aux.getDato().getNombre() + "\nApellido: " + aux.getDato().getApellido()+ "\n");
           aux = aux.getpNext();
       }
       return completo;
   }
}
