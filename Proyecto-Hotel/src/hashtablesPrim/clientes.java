/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashtablesPrim;

/**
 *
 * @author joseg
 */
public class clientes {
    String numHab;
    String nombre;
    String apellido;
    clientes siguiente;

    public clientes(String numHab, String nombre, String apellido) {
        this.numHab = numHab;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNumHab() {
        return numHab;
    }

    public void setNumHab(String numHab) {
        this.numHab = numHab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
    public String toString(){
        return ("Nro Hab: "+ this.numHab + "\n" + "Nombre y Apellido: " + this.nombre + " " + this.apellido);
    }
    
}
