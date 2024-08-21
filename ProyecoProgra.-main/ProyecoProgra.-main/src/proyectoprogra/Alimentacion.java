/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;

/**
 *
 * @author sebastian
 */
public class Alimentacion {
    private String nombreanimal;
    private String horario;
    private String alimentos;
    private String frecuenciaalimentacion;
    private double cantidadalimento; 
    
    public Alimentacion (String nombreanimal, String horario, String alimentos, String frecuenciaalimentacion, double cantidadalimento){
        this.nombreanimal = nombreanimal;
        this.horario = horario;
        this.alimentos = alimentos;
        this.frecuenciaalimentacion = frecuenciaalimentacion;
        this.cantidadalimento = cantidadalimento;
    }

    public String getNombreanimal() {
        return nombreanimal;
    }

    public void setNombreanimal(String nombreanimal) {
        this.nombreanimal = nombreanimal;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(String alimentos) {
        this.alimentos = alimentos;
    }

    public String getFrecuenciaalimentacion() {
        return frecuenciaalimentacion;
    }

    public void setFrecuenciaalimentacion(String frecuenciaalimentacion) {
        this.frecuenciaalimentacion = frecuenciaalimentacion;
    }

    public double getCantidadalimento() {
        return cantidadalimento;
    }

    public void setCantidadalimento(double cantidadalimento) {
        this.cantidadalimento = cantidadalimento;
    }

   
    
}
