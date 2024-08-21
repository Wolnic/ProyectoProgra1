/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;

/**
 *
 * @author sebastian
 */
public class Animales {
    
    private String Tipo;
    private String nombre;
    private String habitats;

    public Animales(String Tipo, String nombre, String habitats) {
        this.Tipo = Tipo;
        this.nombre = nombre;
        this.habitats = habitats;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitats() {
        return habitats;
    }

    public void setHabitats(String habitats) {
        this.habitats = habitats;
    }

    
    
   
}

