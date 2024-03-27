/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.hotel;

/**
 *
 * @author CMGamer
 */
public class Habitaciones {
    private String num_Hab;
    private String tipo_Hab;
    private String piso;

    public Habitaciones(String[] dato) {
        this.num_Hab = dato[0];
        this.tipo_Hab = dato[1];
        this.piso = dato[2];
    }

    public String getNum_Hab() {
        return num_Hab;
    }

    public String getTipo_Hab() {
        return tipo_Hab;
    }

    public String getPiso() {
        return piso;
    }
    
    
    
}
