/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.hotel;

/**
 *
 * @author alexp
 */
public class Cliente {
   private String ci;
   private String nombre;
   private String apellido;
   private String email;
   private String genero;
   private String tipo_habitacion;
   private String celular;
   private String llegada;
   private String salida;

    public Cliente(String[] dato) {
        this.ci = dato[0];
        this.nombre = dato[1];
        this.apellido = dato[2];
        this.email = dato[3];
        this.genero = dato[4];
        this.tipo_habitacion = dato[5];
        this.celular = dato[6];
        this.llegada = dato[7];
        this.salida = dato[8];
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

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
  
    
   public String toString(){
       return (this.ci + " " + this.nombre + " " + this.apellido + " " + this.email + " " + this.genero + " " + this.tipo_habitacion + " " + this.celular + " " + this.llegada + " " + this.salida);
   }
   
}
