/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.hotel;

/**
 *
 * @author alexp
 */
public class ArbolReservacion {
    private NodoReser Root;
    
    public ArbolReservacion(){
        this.Root=null;
    }

    public NodoReser getRoot() {
        return Root;
    }

    public void setRoot(NodoReser Root) {
        this.Root = Root;
    }
    
    public boolean esVacio(){
        return getRoot()==null;
    }
    
    public void insertar(Cliente data){
        NodoReser newNodo=new NodoReser(data);
        if(this.Root==null){
            this.Root=newNodo;
        }else{
            insertador(this.Root, newNodo);
        }
    }
                
    public NodoReser insertador(NodoReser Root, NodoReser newNodo){
        if(esVacio()){
            return newNodo;
            
        }else{
            if(Root.getData().getCi().compareTo(newNodo.getData().getCi()) > 0){
                if(Root.getHijoIzq()==null){
                    Root.setHijoIzq(newNodo);
                }else{
                    insertador(Root.getHijoIzq(), newNodo);
                }
                
            }else if(Root.getData().getCi().compareTo(newNodo.getData().getCi()) < 0){
                if(Root.getHijoDer()==null){
                    Root.setHijoDer(newNodo);
                }else{
                    insertador(Root.getHijoDer(),newNodo);
                }
            }else{
                System.out.println("El elemento ya se encuentra en el arbol");
            }
        }
        return rebalance(Root);
    }
    
    public int altura(NodoReser node) {
        if (node == null) {
            return -1;
        } else {
            return node.getAltura();
        }
    }
    
    public void actualizarAltura(NodoReser nodo){
        nodo.setAltura(1 + Math.max(altura(nodo.getHijoIzq()), altura(nodo.getHijoDer())));
    }
    
    
    public NodoReser rotarDerecha(NodoReser y) {
        NodoReser x = y.getHijoIzq();
        NodoReser T2 = x.getHijoDer();
        x.setHijoDer(y);
        y.setHijoIzq(T2);

        actualizarAltura(y);
        actualizarAltura(x);
        return x;
    }
     public NodoReser rotarIzquierda(NodoReser x) {
        NodoReser y = x.getHijoIzq();
        NodoReser T2 = y.getHijoDer();
        y.setHijoIzq(x);
        x.setHijoDer(T2);
        
        actualizarAltura(y);
        actualizarAltura(x);
        return y;
    }    
    
    public int balance(NodoReser nodo){
        if (nodo == null){
            return 0;
        }else{
            return altura(nodo.getHijoDer()) - altura(nodo.getHijoIzq());
        }
    }
    
    public NodoReser rebalance(NodoReser nodo){
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
    
    

    
    public NodoReser eliminador(NodoReser Root, String CI){
        if (Root == null){
            return Root;
        }else if(Root.getData().getCi().compareTo(CI) > 0){
            Root.setHijoIzq(eliminador(Root.getHijoIzq(), CI));
        }else if(Root.getData().getCi().compareTo(CI) > 0){
            Root.setHijoDer(eliminador(Root.getHijoDer(), CI));
        }else{
            if(Root.getHijoIzq() == null){
                Root = Root.getHijoDer();
            }else if(Root.getHijoDer() == null){
                Root = Root.getHijoIzq();
 
            }else{
                
                NodoReser succesoral = Root;

                NodoReser succesorado = Root.getHijoDer();

                while(succesorado.getHijoIzq() != null){
                    succesoral = succesorado;
                    succesorado = succesorado.getHijoIzq();
                }

                if(succesoral != Root){
                   succesoral.setHijoIzq(succesorado.getHijoDer());
                }else{
                    succesoral.setHijoDer(succesorado.getHijoIzq());
                }
                Root.setData(succesorado.getData());
                
            }
        }
        if(Root != null){
            Root = rebalance(Root);
        }
        return Root;
    }
    
    public NodoReser buscar(String data){
        NodoReser aux = this.Root;
        
        if (aux==null){ 
            return null;
        }else{
            NodoReser info = buscador(aux, data);
            return info;
        }
        
    }
    
    public NodoReser buscador(NodoReser aux, String data){
        
        if(aux==null) return null;
        
        if(aux.getData().getCi().equals(data)){
            return aux;
        }else if(aux.getData().getCi().compareTo(data) > 0){
            return buscador(aux.getHijoIzq(), data);
        }else{
            return buscador(aux.getHijoDer(),data);
        }
    }
    
    
    public void preorden(NodoReser Root){
        if(Root!=null){
            System.out.println(Root.getData() +",");
            preorden(Root.getHijoIzq());
            preorden(Root.getHijoDer());           
        }
    }
    
    public void postorden(NodoReser Root){
        if(Root!=null){
            postorden(Root.getHijoIzq());
            postorden(Root.getHijoDer());
            System.out.println(Root.getData() +",");
        }
    }
    
    public void inorden(NodoReser Root){
        if(Root!=null){
            inorden(Root.getHijoIzq());
            System.out.println(Root.getData() + ",");
            inorden(Root.getHijoDer());
        }
    }
    
    public void imprimir(NodoReser nodo){
        if(nodo!=null){
            imprimir(nodo.getHijoIzq()); // Visita el hijo izquierdo
            System.out.println(nodo.getData()); // Imprime el valor del nodo
            imprimir(nodo.getHijoDer()); // Visita el hijo derecho
        }
    }
}
