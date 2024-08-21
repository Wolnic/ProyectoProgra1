/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class GestionEventos {

    public String[][] eventos;
    public int contador;

    public GestionEventos() {
        eventos = new String[10][5]; // Creamos una lista para 10 eventos, cada uno con 5 detalles
        contador = 0; // Comenzamos con cero eventos agregados
        agregarEventosPrecargados(); // Agregamos algunos eventos de ejemplo al iniciar
        }
    public void agregarEvento() {
        // Revisamos si todavia hay espacio para mas eventos

        if (contador < eventos.length) {
            // Pedimos al usuario que ingrese detalles sobre el nuevo evento
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del evento:");
            String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del evento:");
            String id = JOptionPane.showInputDialog("Ingrese el ID del evento:");
            String fecha = JOptionPane.showInputDialog("Ingrese la fecha del evento (dd-mm-yyyy):");
            String localizacion = JOptionPane.showInputDialog("Ingrese la localización del evento:");
            // Guardamos la información del nuevo evento en la lista
            eventos[contador][0] = nombre;
            eventos[contador][1] = descripcion;
            eventos[contador][2] = id;
            eventos[contador][3] = fecha;
            eventos[contador][4] = localizacion;
            contador++; // Aumentamos el número de eventos
        } else {
            // Si no hay espacio, mostramos un mensaje al usuario
            JOptionPane.showMessageDialog(null, "No se pueden agregar más eventos. Arreglo lleno.");
        }
    }

    public void consultarEvento() {
        String resultado = ""; // Variable para almacenar los detalles de todos los eventos
        for (int i = 0; i < contador; i++) {
            resultado += "Nombre: " + eventos[i][0]
                    + ", Descripción: " + eventos[i][1]
                    + ", ID: " + eventos[i][2]
                    + ", Fecha: " + eventos[i][3]
                    + ", Localización: " + eventos[i][4] + "\n";
        }
        // Mostramos todos los eventos al usuario
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void modificarEvento() {
        String id = JOptionPane.showInputDialog("Ingrese el ID del evento a modificar:");
        for (int i = 0; i < contador; i++) {
            if (eventos[i][2].equals(id)) { // Corregido el índice para comparar el ID
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del evento:");
                String nuevaDescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripción del evento:");
                String nuevaFecha = JOptionPane.showInputDialog("Ingrese la nueva fecha del evento (dd-mm-yyyy):");
                String nuevaLocalizacion = JOptionPane.showInputDialog("Ingrese la nueva localización del evento:");

                eventos[i][0] = nuevoNombre;
                eventos[i][1] = nuevaDescripcion;
                eventos[i][3] = nuevaFecha;
                eventos[i][4] = nuevaLocalizacion;
                // Mostramos un mensaje confirmando la modificación
                JOptionPane.showMessageDialog(null, "Evento modificado correctamente.");
                return; // Salimos del método ya que hemos terminado de modificar
            }
        }
        // Si no encontramos el evento, mostramos un mensaje al usuario
        JOptionPane.showMessageDialog(null, "Evento no encontrado.");
    }

    public void eliminarEvento() {
        // Pedimos al usuario el ID del evento que quiere eliminar
        String id = JOptionPane.showInputDialog("Ingrese el ID del evento a eliminar:");
        for (int i = 0; i < contador; i++) {
            if (eventos[i][2].equals(id)) { // Corregido el índice para comparar el ID
                // Eliminamos el evento desplazando los restantes
                for (int k = i; k < contador - 1; k++) {
                    eventos[k] = eventos[k + 1];
                }
                eventos[contador - 1] = new String[5]; // Borramos el último duplicado
                contador--; // Disminuimos el número de eventos
                // Mostramos un mensaje confirmando la eliminación
                JOptionPane.showMessageDialog(null, "Evento eliminado correctamente.");
                return; // Salimos del método ya que hemos terminado de eliminar
            }
        }
        // Si no encontramos el evento, mostramos un mensaje al usuario
        JOptionPane.showMessageDialog(null, "Evento no encontrado.");
    }

    private void agregarEventosPrecargados() {
        eventos[0] = new String[]{"Tour por el zoológico", "Tour de bienvenida", "1", "10-09-2024", "Puerta principal"};
        eventos[1] = new String[]{"Charla con expertos", "Charla con Juan Pérez, Biólogo", "2", "01-10-2024", "Salón de eventos"};
        eventos[2] = new String[]{"Taller de manualidades", "Taller sobre carpintería", "3", "02-11-2024", "Salón de eventos"};
        contador = 3; // Establecemos que comenzamos con tres eventos
    }
}
        
    
    

    

