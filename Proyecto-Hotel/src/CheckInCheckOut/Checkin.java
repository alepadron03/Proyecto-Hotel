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
    registroHash registroHotel=new registroHash(9); //hacemos un nuevo hash de 9 personas
    ArbolHabitacion arbolHabitaciones=new ArbolHabitacion(); //nuevo arbolhabitacion
    ArbolReservacion arbolReservaciones=new ArbolReservacion(); //nuevo arbolreservacion
    
    public void hacerReservación(String data) { //hacemos una funcion hacerreservcion que consiga string de data
        if (arbolReservaciones.buscar(arbolReservaciones.getRoot(), data) != null) { //buscamos si la información de la reservación aún existe en la raíz del arbol, si no es null
           Cliente reservacion1=arbolReservaciones.buscar(arbolReservaciones.getRoot(), data); //hacemos el cliente reservación
           if(reservacion1 != null){ //si la reservación no es nula entoncea
               Habitacion hab = arbolHabitaciones.buscarHabitacion(reservacion1.getTipo_habitacion(), arbolHabitaciones.getRoot()); 
               if(hab == null){
                   
               }else{
               registroHotel.insertarHash(Integer.parseInt(hab.getNum_hab()),reservacion1.getNombre(), reservacion1.getApellido());
           }
           
           
        }
    }
    
}}
