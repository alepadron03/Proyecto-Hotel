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

    public String CheckIn(ArbolReservacion Reservacion, registroHash HashTable, ArrayList existencia, String Ci, String Habitacion){
        
        NodoReser reserva = Reservacion.buscar(Ci);
        try{
            int valor = Integer.parseInt(Habitacion);
            if(reserva == null){
                return "El cliente no esta dentro de la lista de reservas";
            }else if(valor >= existencia.getTamano()){ 
                return "La habitacion no esta dentro de la lista de habitaciones";
            }else if(!existencia.cargar(valor).getTipo_Hab().equals(reserva.getData().getTipo_habitacion())){
                return "El tipo de habitacion no es la correcta para el cliente";
            }else if(HashTable.buscarOcupacion(Habitacion)){
                return "La Habitacion ya esta ocupada por otro cliente";
            }else{
                Cliente cliente = reserva.getData();
                HashTable.insertarHash(Habitacion, cliente.getNombre(), cliente.getApellido());
                Reservacion.eliminador(Reservacion.getRoot(), Ci);
                return "El cliente se ha puesto en la lista de Estadias exitosamente :D";
            }
        }catch(NumberFormatException e){
            return "El numero de habitacion no es un numero";
        }
    }
}


