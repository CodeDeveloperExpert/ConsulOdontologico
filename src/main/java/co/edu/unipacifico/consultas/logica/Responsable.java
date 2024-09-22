/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipacifico.consultas.logica;

import java.util.Date;

public class Responsable  extends Persona{
    private int id_responsable;
    private String tipo_respon;

    public Responsable() {
    }

    public Responsable(int id_responsable, String tipo_respon, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_responsable = id_responsable;
        this.tipo_respon = tipo_respon;
    }

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getTipo_respon() {
        return tipo_respon;
    }

    public void setTipo_respon(String tipo_respon) {
        this.tipo_respon = tipo_respon;
    }
}
