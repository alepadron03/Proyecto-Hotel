/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtablesPrim;

/**
 *
 * @author joseg
 */
public class NewMain {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        registroHash registro=new registroHash(9);
        registro.insertarHash(0, "José", "Kukluxklan");
        registro.insertarHash(11223322, "big", "chungus");
        registro.insertarHash(499292929, "José", "Gomez");
        registro.insertarHash(302, "Walter", "tutu");
        registro.insertarHash(0, "Jessy", "Joy");
        registro.insertarHash(666, "Miles", "Davis");
        registro.imprimirHash();
        
        
        registro.eliminarHash(11223322, "big", "chungus");
        System.out.println("------------------------------------");
        registro.imprimirHash();
        System.out.println("------------------------------------");
        System.out.println(registro.buscarHash(499292929, "José", "Gomez").nombre);
    }
    
}
