/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CheckInCheckOut;


import hashtablesPrim.*;
import proyecto.hotel.*;


/**
 *
 * @author joseg
 */

public class Checkout {
    
        public String CheckOut(ArbolHabitacion Habitacion, registroHash HashTable, String Nombre, String Apellido){

        clientes cliente = HashTable.buscarHash(Nombre, Apellido);
        
        
        if(cliente == null){
            return "El cliente no existe";
        }else{
            Habitacion data = new Habitacion(cliente.getNombre(),cliente.getApellido(),cliente.getNumHab());
            HashTable.eliminarHash(Nombre, Apellido);
            Habitacion.insertar(data);
            return "El cliente se ha movido";
        }
    }
}