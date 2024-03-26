/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.hotel;

/**
 *
 * @author alexp
 */
public class Habitacion {
    private String nombre;
    private String apellido;
    private String num_hab;

    public Habitacion(String[] dato) {
        this.nombre = dato[1];
        this.apellido = dato[2];
        this.num_hab = dato[6];
    }
    
    public Habitacion(String Nombre, String Apellido, String numHab){
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.num_hab = numHab;     
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

    public String getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(String num_hab) {
        this.num_hab = num_hab;
    }
 
    public String toString(){
        return("\nNombre y Apellido: " + this.nombre + " " + this.apellido + "\nNumHab: " + this.num_hab);
    }
}
    
    
    

