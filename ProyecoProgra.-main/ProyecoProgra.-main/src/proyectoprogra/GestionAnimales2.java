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
class GestionAnimales2 {
    public String[][] Animales;  // Lista para almacenar informacion sobre diferentes animales
    public int contador; // Namero de animales actuales en la lista

    public GestionAnimales2() {
        Animales = new String[10][3]; // Creamos una lista para 10 animales, cada uno con 5 detalles
        contador = 0; // Comenzamos con cero animales agregados
        agregarAnimalesPrecargados(); // Agregamos algunos animales de ejemplo al iniciar
    }

    public void agregarAnimales() {
        // Revisamos si todavia hay espacio para mas animales
        if (contador < Animales.length) {
            // Pedimos al usuario que ingrese detalles sobre el nuevo animall
            String id = JOptionPane.showInputDialog("Ingrese el ID del animal:");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal ");
            String tipo = JOptionPane.showInputDialog("Ingrese el tipo del animal:");

            // Guardamos la informacion del nuevo animal en la lista
            Animales[contador][0] = id;
            Animales[contador][1] = nombre;
            Animales[contador][2] = tipo;
            contador++; // Aumentamos el numero de animales 
        } else {
            // Si no hay espacio, mostramos un mensaje al usuario
            JOptionPane.showMessageDialog(null, "No se pueden agregar mas animales . Arreglo lleno.");
        }
    }

    public void consultarAnimales() {
        String resultado = ""; // Variable para almacenar los detalles de todos los animales
        for (int i = 0; i < contador; i++) {
            // Anadimos la informacion de cada animal a la variable resultado
            resultado += "ID: " + Animales[i][0] +
                         ", Nombre: " + Animales[i][1] +
                         ", Tipo: " + Animales[i][2]+"\n";
        }
        // Mostramos todos los animales al usuario
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void modificarAnimal() {
        // Pedimos al usuario el ID del animal  que quiere cambiar
        String id = JOptionPane.showInputDialog("Ingrese el ID del Animal a modificar:");
        for (int i = 0; i < contador; i++) {
            // Buscamos el animal con el ID dado
            if (Animales[i][0].equals(id)) {
                // Pedimos al usuario que ingrese los nuevos detalles del animal
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de animal ");
                String nuevoTipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo de animal :");

                // Actualizamos la informacion del hanimal  en la lista
                Animales[i][1] = nuevoNombre;
                Animales[i][2] = nuevoTipo;
                // Mostramos un mensaje confirmando la modificacion
                JOptionPane.showMessageDialog(null, "animal  modificado correctamente.");
                return; // Salimos del metodo ya que hemos terminado de modificar
            }
        }
        // Si no encontramos el aniumal mostramos un mensaje al usuario
        JOptionPane.showMessageDialog(null, "animal  no encontrado."); //validamos que el numero este entre uno y cuatro 
    }

    public void eliminarAnimal () {
        // Pedimos al usuario el ID del animal  que quiere eliminar
        String id = JOptionPane.showInputDialog("Ingrese el ID del animal a eliminar:");
        for (int i = 0; i < contador; i++) {
            // Buscamos el animal con el ID dado
            if (Animales[i][0].equals(id)) {
                // Eliminamos el animal
                for (int j = 0; j < Animales[i].length; j++) {
                    Animales[i][j] = null;
                }
                // Desplazamos los animales restantes para llenar el espacio vacio
                for (int k = i; k < contador - 1; k++) {
                    Animales[k] = Animales [k + 1];
                }
                contador--; // Disminuimos el numero de animales 
                // Mostramos un mensaje confirmando la eliminacion
                JOptionPane.showMessageDialog(null, "animal eliminado correctamente.");
                return; // Salimos del metodo ya que hemos terminado de eliminar
            }
        }
        // Si no encontramos el animal mostramos un mensaje al usuario
        JOptionPane.showMessageDialog(null, "Hqbitat no encontrado.");
    }

    private void agregarAnimalesPrecargados() {
        // Agregamos algunos animales de ejemplo para comenzar
        Animales[0] = new String[]{"1", "Leon", "SIMBA", "Carnivoro"};
        Animales[1] = new String[]{"2", "Tigre", "KHAN", "Carnivoro"};
        Animales[2] = new String[]{"3", "Mono", "KIKO ", "Herviboro"};
        Animales[3] = new String[]{"4", "Jirafa", "MELMAN", " Herviboro "};
        Animales[4] = new String[]{"5", "Elefante", "DUMBO", "Herviboro"};
        
        contador = 5; // Establecemos que comenzamos con 5 animales
    }
    
}

  
