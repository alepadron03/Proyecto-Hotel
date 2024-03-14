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
            System.out.println(arbol.buscar(arbol.getRoot(), "18.383.175"));
            return arbol;
        }catch(IOException e){
            return null;
        }
    }
    
        public ArbolReservacion abridorArchivoEstado(){
        String linea;
        
        try{
            BufferedReader lector = new BufferedReader(new FileReader("CSV/Estado.csv"));
            while((linea = lector.readLine()) != null){
                String[] fila = linea.split(",");
                Cliente clientela = new Cliente(fila);
            }
            lector.close();
            
            return null;
        }catch(IOException e){
            return null;
        }
    }
}
