/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;

/**
 *
 * @author sebastian
 */
public class Visitantes {
  // Atributos privados para almacenar la información de cada visitante
    private String nombre;
    private int edad;
    private String fechaIngreso;
    
     // Constructor de atributos a valores predeterminados
    public Visitantes() {
        this.nombre = "";
        this.edad = 0;
        this.fechaIngreso = "";
    }
    
     // Constructor de atributos al crear un objeto Visitante
    public Visitantes(String nombre, int edad, String fechaIngreso) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
    }
        // Método para obtener el nombre del visitante
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
}
