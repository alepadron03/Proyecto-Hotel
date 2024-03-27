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
                return "El cliente no existe";
            }else if(valor >= existencia.getTamano()){ 
                return "La habitacion no Existe";
            }else if(!existencia.cargar(valor).getTipo_Hab().equals(reserva.getData().getTipo_habitacion())){
                return "La Habitacion no es la correcta para el cliente";
            }else if(HashTable.buscarOcupacion(Habitacion)){
                return "La Habitacion ya esta tomada";
            }else{
                Cliente cliente = reserva.getData();
                HashTable.insertarHash(Habitacion, cliente.getNombre(), cliente.getApellido());
                Reservacion.eliminador(Reservacion.getRoot(), Ci);
                return "El cliente se ha movido";
            }
        }catch(NumberFormatException e){
            return "La habitacion no es un Numero";
        }
    }
}


