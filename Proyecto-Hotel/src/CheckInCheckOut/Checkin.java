/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CheckInCheckOut;

import hashtablesPrim.registroHash;
import proyecto.hotel.*;


/**
 *
 * @author joseg
 */
public class Checkin {

    public String CheckIn(ArbolReservacion Reservacion, registroHash HashTable, String Ci, String Habitacion){
        
        NodoReser reserva = Reservacion.buscar(Ci);
        
        if(reserva == null){
            return "El cliente no existe";
        }else{
            Cliente cliente = reserva.getData();
            HashTable.insertarHash(Habitacion, cliente.getNombre(), cliente.getApellido());
            Reservacion.eliminador(Reservacion.getRoot(), Ci);
            return "El cliente se ha movido";
        }
    }
}
