/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.hotel;

/**
 *
 * @author CMGamer
 */
public class ArrayList {
    private final int inicial = 1;
    private Habitaciones[] objetos;
    private int tamano;
    
    public ArrayList(){
        this.objetos = new Habitaciones[inicial];
        this.tamano = 0;
    }
    
    public void agregar(Habitaciones objeto){
        if(tamano == objetos.length){
            aumentar(1);
        }
        objetos[tamano++] = objeto;
    }
    
    public Habitaciones cargar(int indice){
        if (indice < 0 || indice >= tamano){
            return null;
        }
        
        return (Habitaciones) objetos[indice];
    }
    
    private void aumentar(int cantidad){
        int nuevo = objetos.length + cantidad;
        Habitaciones[] array = new Habitaciones[nuevo];
        for (int i = 0; i < tamano; i++) {
            array[i] = objetos[i];
            
        }
        objetos = array;
    }

    public int getTamano() {
        return tamano;
    }
    
    
}
