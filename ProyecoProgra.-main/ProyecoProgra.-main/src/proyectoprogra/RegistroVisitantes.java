/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author sebastian
 */
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroVisitantes {
    private final Visitantes[] visitantes;
    private int contador;

    public RegistroVisitantes() {
        visitantes = new Visitantes[10]; // Inicia con un arreglo de tamaño 10
        contador = 0;
        agregarVisitantesPrecargados(); // Agregar visitantes precargados al iniciar
    }

    public void agregarVisitante() { 
        // Verificar si hay espacio en el arreglo para un nuevo visitante
        if (contador < visitantes.length) {
            Visitantes visitante = new Visitantes();
            visitante.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del visitante:"));

            int edad = 0;
            boolean edadValida = false;
            while (!edadValida) {
                try {
                    String edadInput = JOptionPane.showInputDialog("Ingrese la edad del visitante:");
                    edad = Integer.parseInt(edadInput);
                    edadValida = true; // Edad válida
                } catch (NumberFormatException e) {
                    // Mostrar mensaje de formato inválido
                    JOptionPane.showMessageDialog(null, "Formato inválido. Por favor, ingrese un número para la edad.");
                }
            }

            visitante.setEdad(edad);

            // Obtener la fecha y hora actuales
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String fechaIngreso = now.format(formatter);

            visitante.setFechaIngreso(fechaIngreso); // Fecha actual
            visitantes[contador] = visitante;
            contador++;
        } else {
            // Si no hay espacio, mostramos un mensaje al usuario
            JOptionPane.showMessageDialog(null, "No se pueden agregar más visitantes, arreglo lleno.");
        }
    }

    public void mostrarVisitantes() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < contador; i++) { // Cadena con la información de cada visitante
            resultado.append("Nombre: ").append(visitantes[i].getNombre())
                     .append(", Edad: ").append(visitantes[i].getEdad())
                     .append(", Fecha de Ingreso: ").append(visitantes[i].getFechaIngreso()).append("\n");
        }
        // Mostramos todos los visitantes al usuario
        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    public void mostrarEstadisticas() {
        int totalVisitantes = contador; // Total de visitantes agregados
        int totalNinos = 0; // Contador de niños
        int totalAdultos = 0; // Contador de adultos

        // Verifica que el array 'visitantes' y 'contador' estén correctamente inicializados
        if (visitantes != null && contador <= visitantes.length) {
            for (int i = 0; i < contador; i++) {
                // Asegúrate de que el objeto no sea nulo
                if (visitantes[i] != null) {
                    // Asegúrate de que getEdad() no lance excepciones
                    int edad = visitantes[i].getEdad();
                    if (edad < 18) {
                        totalNinos++;
                    } else {
                        totalAdultos++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Total de visitantes: " + totalVisitantes
                    + "\nTotal de niños: " + totalNinos
                    + "\nTotal de adultos: " + totalAdultos);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Datos no válidos.");
        }
    }

    private void agregarVisitantesPrecargados() {
        // Visitantes precargados
        visitantes[0] = new Visitantes("Juan Perez", 12, "25/07/2024 10:00:00");
        visitantes[1] = new Visitantes("Maria Gomez", 25, "25/07/2024 11:00:00");
        visitantes[2] = new Visitantes("Luis Rodriguez", 35, "25/07/2024 12:00:00");
        contador = 3;
    }
}
