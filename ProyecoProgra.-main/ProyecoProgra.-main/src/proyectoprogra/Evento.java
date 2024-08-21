/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class Evento {

    private String descripcion;
    private String nombre;
    private int id;
    private String fecha;
    private String localizacion;

    public Evento(String descripcion, String nombre, int id, String fecha, String localizacion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.id = id;
        this.fecha = fecha;
        this.localizacion = localizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    // Método para mostrar la información del evento

    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Nombre del evento: " + nombre
                + "\nFecha del evento: " + fecha
                + "\nID del evento: " + id
                + "\nDescripcion del evento: " + descripcion
                + "\nIngrese donde se encuentra el evento: " + localizacion);
    }

    public void ensenarInformacion() {
        JOptionPane.showMessageDialog(null, "Nombre del evento: " + nombre
                + "\nFecha del evento: " + fecha
                + "\nID del evento: " + id
                + "\nDescripcion del evento: " + descripcion
                + "\nIngrese donde se encuentra el evento "+ localizacion);
    
    }
    
}
