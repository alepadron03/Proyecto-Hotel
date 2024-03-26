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
            return arbol;
        }catch(IOException e){
            return null;
        }
    }
    

        public ArbolHabitacion abridorArchivoHistorico(){
        String linea;
        ArbolHabitacion arbol = new ArbolHabitacion();
        
        try{
            BufferedReader lector = new BufferedReader(new FileReader("CSV/Historico.csv"));
            linea = lector.readLine();
            while((linea = lector.readLine()) != null){
                String[] fila = linea.split(",");
                Habitacion habitacion = new Habitacion(fila);
                arbol.insertar(habitacion);
            }
           
            lector.close();
            arbol.imprimir(arbol.getRoot());
            return null;
        }catch(IOException e){
            return null;
        }
    }
    
    
    public registroHash abridorArchivoEstado(){
        String linea;
        try{
            BufferedReader contador = new BufferedReader(new FileReader("CSV/Estado.csv"));
            int cuentas = 0;
            while (contador.readLine() != null) cuentas++;
            contador.close();
            
 
            registroHash hashTable = new registroHash(cuentas);
            
            BufferedReader lector = new BufferedReader(new FileReader("CSV/Estado.csv"));
            linea = lector.readLine();
            while((linea = lector.readLine()) != null){
                String[] fila = linea.split(",");
                if ("".equals(fila[0])){
                    fila[0] = "No Existe";
                }
                hashTable.insertarHash(fila[0], fila[1], fila[2]);     
            }
            return hashTable;
            
        }catch(IOException e){
            return null;
        }
    }
}
