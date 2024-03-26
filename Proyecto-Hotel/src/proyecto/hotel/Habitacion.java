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
    private String ci ;
    private String nombre;
    private String apellido;
    private String email;
    private String genero;
    private String llegada;
    private String num_hab;

    public Habitacion(String[] dato) {
        this.ci = dato[0];
        this.nombre = dato[1];
        this.apellido = dato[2];
        this.email = dato[3];
        this.genero = dato[4];
        this.llegada = dato[5];
        this.num_hab = dato[6];
    }
    
    public Habitacion(String Nombre, String Apellido, String numHab){
        this.ci = null;
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.email = null;
        this.genero = null;
        this.llegada = null;
        this.num_hab = numHab;     
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public String getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(String num_hab) {
        this.num_hab = num_hab;
    }
 
    public String toString(){
        return("CI: " + this.ci + "\nNombre y Apellido: " + this.nombre + " " + this.apellido + "\nNumHab: " + this.num_hab);
    }
}
    
    
    

