/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.hotel;

import java.io.*;
import hashtablesPrim.*;



/**
 *
 * @author CMGamer
 */
public class LectorArchivos {

    
    public ArbolReservacion abridorArchivoReservas(){
        String linea;
        ArbolReservacion arbol = new ArbolReservacion();
        
        try{
            BufferedReader lector = new BufferedReader(new FileReader("CSV/Reservas.csv"));
            linea = lector.readLine();
            while((linea = lector.readLine()) != null){
                String[] fila = linea.split(",");
                Cliente clientela = new Cliente(fila);
                arbol.insertar(clientela);
            }
            lector.close();
//            System.out.println(arbol.buscar(arbol.getRoot(), "18.383.175"));
            return arbol;
        }catch(IOException e){
            return null;
        }
    }
    
        public ArbolHabitacion abridorArchivoEstado(){
        String linea;
        ArbolHabitacion arbol = new ArbolHabitacion();
        
        try{
            BufferedReader lector = new BufferedReader(new FileReader("CSV/Historico.csv"));
            while((linea = lector.readLine()) != null){
                String[] fila = linea.split(",");
                Habitacion habitacion = new Habitacion(fila);
                arbol.insertar(habitacion);
            }
            lector.close();
            
            return null;
        }catch(IOException e){
            return null;
        }
    }
}
