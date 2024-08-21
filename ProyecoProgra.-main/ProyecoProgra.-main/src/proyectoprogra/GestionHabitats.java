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
public class GestionHabitats {
    public String[][] habitats;  // Lista para almacenar informacion sobre diferentes habitats
    public int contador; // Namero de habitats actuales en la lista

    public GestionHabitats() {
        habitats = new String[10][5]; // Creamos una lista para 10 habitats, cada uno con 5 detalles
        contador = 0; // Comenzamos con cero habitats agregados
        agregarHabitatsPrecargados(); // Agregamos algunos habitats de ejemplo al iniciar
    }

    public void agregarHabitat() {
        // Revisamos si todavia hay espacio para mas habitats
        if (contador < habitats.length) {
            // Pedimos al usuario que ingrese detalles sobre el nuevo habitat
            String id = JOptionPane.showInputDialog("Ingrese el ID del habitat:");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del habitat:");
            String tipo = JOptionPane.showInputDialog("Ingrese el tipo del habitat:");
            String capacidad = JOptionPane.showInputDialog("Ingrese la capacidad del habitat:");
            String ubicacion = JOptionPane.showInputDialog("Ingrese la ubicacion del habitat:");

            // Guardamos la informacion del nuevo habitat en la lista
            habitats[contador][0] = id;
            habitats[contador][1] = nombre;
            habitats[contador][2] = tipo;
            habitats[contador][3] = capacidad;
            habitats[contador][4] = ubicacion;
            contador++; // Aumentamos el numero de habitats
        } else {
            // Si no hay espacio, mostramos un mensaje al usuario
            JOptionPane.showMessageDialog(null, "No se pueden agregar mas habitats. Arreglo lleno.");
        }
    }

    public void consultarHabitats() {
        String resultado = ""; // Variable para almacenar los detalles de todos los habitats
        for (int i = 0; i < contador; i++) {
            // Anadimos la informacion de cada habitat a la variable resultado
            resultado += "ID: " + habitats[i][0] +
                         ", Nombre: " + habitats[i][1] +
                         ", Tipo: " + habitats[i][2] +
                         ", Capacaidad: " + habitats[i][3] +
                         ", Ubicacion: " + habitats[i][4] + "\n";
        }
        // Mostramos todos los habitats al usuario
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void modificarHabitat() {
        // Pedimos al usuario el ID del habitat que quiere cambiar
        String id = JOptionPane.showInputDialog("Ingrese el ID del habitat a modificar:");
        for (int i = 0; i < contador; i++) {
            // Buscamos el habitat con el ID dado
            if (habitats[i][0].equals(id)) {
                // Pedimos al usuario que ingrese los nuevos detalles del habitat
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del habitat:");
                String nuevoTipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo del habitat:");
                String nuevaCapacidad = JOptionPane.showInputDialog("Ingrese la nueva capacidad del habitat:");
                String nuevaUbicacion = JOptionPane.showInputDialog("Ingrese la nueva ubicación del habitat:");

                // Actualizamos la informacion del habitat en la lista
                habitats[i][1] = nuevoNombre;
                habitats[i][2] = nuevoTipo;
                habitats[i][3] = nuevaCapacidad;
                habitats[i][4] = nuevaUbicacion;
                // Mostramos un mensaje confirmando la modificacion
                JOptionPane.showMessageDialog(null, "Habitat modificado correctamente.");
                return; // Salimos del metodo ya que hemos terminado de modificar
            }
        }
        // Si no encontramos el habitat, mostramos un mensaje al usuario
        JOptionPane.showMessageDialog(null, "Habitat no encontrado."); //validamos que el numero este entre uno y cuatro 
    }

    public void eliminarHabitat() {
        // Pedimos al usuario el ID del habitat que quiere eliminar
        String id = JOptionPane.showInputDialog("Ingrese el ID del habitat a eliminar:");
        for (int i = 0; i < contador; i++) {
            // Buscamos el habitat con el ID dado
            if (habitats[i][0].equals(id)) {
                // Eliminamos el habitat estableciendo sus detalles a null
                for (int j = 0; j < habitats[i].length; j++) {
                    habitats[i][j] = null;
                }
                // Desplazamos los habitats restantes para llenar el espacio vacio
                for (int k = i; k < contador - 1; k++) {
                    habitats[k] = habitats[k + 1];
                }
                contador--; // Disminuimos el numero de habitats
                // Mostramos un mensaje confirmando la eliminacion
                JOptionPane.showMessageDialog(null, "Habitat eliminado correctamente.");
                return; // Salimos del metodo ya que hemos terminado de eliminar
            }
        }
        // Si no encontramos el habitat, mostramos un mensaje al usuario
        JOptionPane.showMessageDialog(null, "Habitat no encontrado.");
    }

    private void agregarHabitatsPrecargados() {
        // Agregamos algunos habitats de ejemplo para comenzar
        habitats[0] = new String[]{"1", "Selva Amazonica", "Selva", "1000", "america"};
        habitats[1] = new String[]{"2", "Desierto del Sahara", "Desierto", "500", "africa"};
        habitats[2] = new String[]{"3", "Arrecife de corales", "Acuatico", "1400", "oceano pacifico"};
        contador = 3; // Establecemos que comenzamos con tres habitats
    }
    
}
