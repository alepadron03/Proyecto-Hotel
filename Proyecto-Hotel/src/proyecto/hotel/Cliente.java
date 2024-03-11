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

    public Cliente(String ci, String nombre, String apellido, String email, String genero, String tipo_habitacion, String celular, String llegada, String salida) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
        this.tipo_habitacion = tipo_habitacion;
        this.celular = celular;
        this.llegada = llegada;
        this.salida = salida;
    }
  
    
   
   
}
