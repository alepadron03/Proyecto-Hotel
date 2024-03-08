/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.hotel;

import java.io.File;
import java.util.Scanner;



/**
 *
 * @author CMGamer
 */
public class LectorArchivos {
    
    
    public static void main(String args[]) throws Exception{
        Scanner nuevoScanner = new Scanner(new File("CSV/Estado.csv"));
        nuevoScanner.useDelimiter(",");
        while(nuevoScanner.hasNext()){
            System.out.println(nuevoScanner.next());
        }
        nuevoScanner.close();
    }
    
//    public String abridorArchivos() throws Exception{
//        Scanner nuevoScanner = new Scanner(new File("CSV/Estado.csv"));
//        nuevoScanner.useDelimiter(",");
//        while(nuevoScanner.hasNext()){
//            System.out.println(nuevoScanner.next());
//        }
//        nuevoScanner.close();
//        return "Completado";
//    }

}
