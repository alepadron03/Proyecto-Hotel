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
    registroHash registroHotel=new registroHash(9);
    ArbolHabitacion arbolHabitaciones=new ArbolHabitacion();
    ArbolReservacion arbolReservaciones=new ArbolReservacion();
    
    public void hacerReservación(String data) {
        if (arbolReservaciones.buscar(arbolReservaciones.getRoot(), data) != null) {
           Cliente reservacion1=arbolReservaciones.buscar(arbolReservaciones.getRoot(), data);
           if(reservacion1 != null){
               Habitacion hab = arbolHabitaciones.buscarHabitacion(reservacion1.getTipo_habitacion(), arbolHabitaciones.getRoot());
               if hab.equals(null){
                   
               }else{10
               registroHotel.insertarHash(String.valueOf(hab.getNum_hab()),reservacion1.getNombre(), reservacion1.getApellido());
           }
           
           
        }
    }
    
}
