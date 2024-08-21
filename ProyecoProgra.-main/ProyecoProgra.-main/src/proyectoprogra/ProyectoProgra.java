package proyectoprogra;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author sebastian
 */
   public class ProyectoProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            // declaramos el menu principal
            String[] opcionesMenuPrincipal = {
                "Gestionar Visitantes",
                "Gestionar Habitats",
                "Gestionar Eventos",
                "Registrar Alimentacion",
                "Registrar animales",
                "Mostrar Mapa",
                "Salir"

            };
            int opcionPrincipal = JOptionPane.showOptionDialog(
                    null, //En estas lineas lo que se hace es mediante el uso de botones solicitarle al cliente cual accion quiere realizar 
                    "MENU PRINCIPAL",
                    "Sistema de Gestion del Zoologico",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcionesMenuPrincipal,
                    opcionesMenuPrincipal[0]
            );
            switch (opcionPrincipal) {
                case 0: {
                    gestionarVisitantes();
                    break;
                }
                case 1: {
                    gestionarHabitats();
                    break;
                }
                case 2: {
                    gestionarEventos();
                    break;
                }
                case 3: {
                    registrarAlimentacion();
                    break;
                }
                case 4: {
                    registrarAnimales();

                    break;
                }
                case 5: {
                    new ZoologicoGUI();
                    break;
                }

                case 6: {
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    continuar = false;
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "¡Opcion incorrecta!");
                }
            }
        }
    }

    private static void gestionarVisitantes() {
// Instancia de la clase RegistroVisitantes
        // Instancia de la clase RegistroVisitantes
        RegistroVisitantes registro = new RegistroVisitantes();

        // Cadenas que contienen las opciones del menu
        String[] opciones = {"Agregar visitante", "Mostrar visitantes", "Mostrar estadísticas", "Salir"};

        int opcion = -1; // Inicializamos con un valor que no sea valido

        // Bucle while
        while (opcion != 3) {
            // Mostrar el menu y obtener la opcion seleccionada
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opcion:",
                    "Menu de Registro de Visitantes",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            // Ejecutar acción basada en la opción seleccionada
            switch (opcion) {
                case 0:
                    registro.agregarVisitante();
                    JOptionPane.showMessageDialog(null, "Visitante agregado exitosamente.");
                    break;
                case 1:
                    registro.mostrarVisitantes();
                    break;
                case 2:
                    registro.mostrarEstadisticas();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }

    private static void gestionarHabitats() {
    GestionHabitats gestionHabitats = new GestionHabitats();
    String[] opciones = {"Agregar Habitat", "Consultar Habitats", "Modificar Habitat", "Eliminar Habitat", "Volver al Menú Principal"};
    int opcion;

    do {
        // Mostramos un menú al usuario y le pedimos que seleccione una opción
        opcion = JOptionPane.showOptionDialog(null, "***MENÚ DE HABITATS***", "Sistema de Gestión de Habitats",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        // Usamos un switch para manejar la opción seleccionada por el usuario
        switch (opcion) {
            case 0:
                // Si el usuario selecciona "0", llamamos al método para agregar un nuevo habitat
                gestionHabitats.agregarHabitat();
                break;
            case 1:
                // Si el usuario selecciona "1", llamamos al método para consultar todos los habitats
                gestionHabitats.consultarHabitats();
                break;
            case 2:
                // Si el usuario selecciona "2", llamamos al método para modificar un habitat existente
                gestionHabitats.modificarHabitat();
                break;
            case 3:
                // Si el usuario selecciona "3", llamamos al método para eliminar un habitat
                gestionHabitats.eliminarHabitat();
                break;
            case 4:
                // Si el usuario selecciona "4", volvemos al menú principal
                return; // Salimos del método para regresar al menú principal
            default:
                // Este caso no debería ser necesario, pero se incluye por seguridad
                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                break;
        }
    } while (opcion != 4);
}

    // Este método representa el menú principal del sistema
    private static void mostrarMenuPrincipal() {
    String[] opciones = {"Gestionar Hábitats", "Otra Opción", "Salir"};
    int opcion;

    do {
        // Mostramos el menú principal al usuario
        opcion = JOptionPane.showOptionDialog(null, "***MENÚ PRINCIPAL***", "Sistema de Gestión",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch (opcion) {
            case 0:
                // Si el usuario selecciona "Gestionar Hábitats"
                gestionarHabitats();
                break;
            case 1:
                // Aquí iría otra opción
                break;
            case 2:
                // Si el usuario selecciona "Salir"
                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                break;
        }
    } while (opcion != 2);
}

       private static void gestionarEventos() {
    GestionEventos gestionEventos = new GestionEventos(); // Cambiado a "gestionEventos" para coincidir con el uso posterior
    String[] opciones = {"Agregar Evento", "Consultar Eventos", "Modificar Evento", "Eliminar Evento", "Volver al Menú Principal"};
    int opcion;

    do {
        // Mostramos un menú al usuario y le pedimos que seleccione una opción
        opcion = JOptionPane.showOptionDialog(null, "***MENÚ DE EVENTOS***", "Sistema de Gestión de Eventos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        // Usamos un switch para manejar la opción seleccionada por el usuario
        switch (opcion) {
            case 0:
                // Si el usuario selecciona "0", llamamos al método para agregar un nuevo evento
                gestionEventos.agregarEvento(); // Corrección del nombre de variable
                break;
            case 1:
                // Si el usuario selecciona "1", llamamos al método para consultar todos los eventos
                gestionEventos.consultarEvento(); // Corrección del nombre de método
                break;
            case 2:
                // Si el usuario selecciona "2", llamamos al método para modificar un evento existente
                gestionEventos.modificarEvento(); // Corrección del nombre de método
                break;
            case 3:
                // Si el usuario selecciona "3", llamamos al método para eliminar un evento
                gestionEventos.eliminarEvento(); // Corrección del nombre de método
                break;
            case 4:
                // Si el usuario selecciona "4", volvemos al menú principal
                return; // Salimos del método para regresar al menú principal
            default:
                // Este caso no debería ser necesario, pero se incluye por seguridad
                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                break;
        }
    } while (opcion != 4);
}

 
    private static void registrarAnimales() {
    GestionAnimales2 gestionAnimales = new GestionAnimales2();
    String[] opciones = {"Agregar Animal", "Consultar Animal", "Eliminar Animal", "Modificar Animal", "Volver al Menú Principal"};
    int opcion;

    do {
        // Mostramos un menú al usuario y le pedimos que seleccione una opción
        opcion = JOptionPane.showOptionDialog(null, "***MENÚ DE ANIMALES***", "Sistema de Gestión de Animales",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        // Usamos un switch para manejar la opción seleccionada por el usuario
        switch (opcion) {
            case 0:
                // Si el usuario selecciona "0", llamamos al método para agregar un nuevo animal
                gestionAnimales.agregarAnimales();
                break;
            case 1:
                // Si el usuario selecciona "1", llamamos al método para consultar un animal
                gestionAnimales.consultarAnimales();
                break;
            case 2:
                // Si el usuario selecciona "2", llamamos al método para eliminar un animal
                gestionAnimales.eliminarAnimal();
                break;
            case 3:
                // Si el usuario selecciona "3", llamamos al método para modificar un animal
                gestionAnimales.modificarAnimal();
                break;
            case 4:
                // Si el usuario selecciona "4", volvemos al menú principal
                return; // Salimos del método para regresar al menú principal
            default:
                // Este caso no debería ser necesario, pero se incluye por seguridad
                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                break;
        }
    } while (opcion != 4);
}

private static void registrarAlimentacion() {
    int RegistroAlimentacion = 0;
    boolean entradaValida = false;
    
    // Registro precargados
            Alimentacion[] registrosPrecargados = {
        new Alimentacion("León", "7:00 am", "Carne", "8 horas", 10),
        new Alimentacion("Elefante", "12:00 pm", "Vegetales", "1 día", 300),
        new Alimentacion("Hiena", "7:00 pm", "Carne", "8 horas", 8)
    };

    int registrosExistentes = registrosPrecargados.length;

    // Mostramos los registros precargados
    for (int i = 0; i < registrosExistentes; i++) {
        JOptionPane.showMessageDialog(null,
                "Registro " + (i + 1) +
                "\nAnimal: " + registrosPrecargados[i].getNombreanimal() +
                "\nHora de alimentación: " + registrosPrecargados[i].getHorario() +
                "\nEste animal consume: " + registrosPrecargados[i].getAlimentos() +
                "\nEste animal come cada: " + registrosPrecargados[i].getFrecuenciaalimentacion() +
                "\nEste animal come (kilos): " + registrosPrecargados[i].getCantidadalimento());
    }

    // Validación de la cantidad de registros
    do {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Ingrese la cantidad de registros que desea crear (1-10): ");
        JTextField textField = new JTextField(10);
        panel.add(label);
        panel.add(textField);

        // Crear los botones
        String[] options = {"OK", "Cancelar", "Volver al Menú Principal"};

        int result = JOptionPane.showOptionDialog(
                null, 
                panel, 
                "Cantidad de Registros", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                options, 
                options[0]
        );

        if (result == 2) {  // Si el usuario selecciona "Volver al Menú Principal"
            return;  // Salir del método para regresar al menú principal
        }

        if (result == 0) {  // Si el usuario selecciona "OK"
            String input = textField.getText().trim();
            try {
                RegistroAlimentacion = Integer.parseInt(input);
                if (RegistroAlimentacion > 0 && RegistroAlimentacion <= 10) {
                    entradaValida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entre 1 y 10.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        } else if (result == 1) {  // Si el usuario selecciona "Cancelar"
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
            return;
        }
    } while (!entradaValida);

    Alimentacion[] arrAlimentacion = new Alimentacion[RegistroAlimentacion];

    // Se creó un bucle que depende de la cantidad de registros
    for (int i = 0; i < RegistroAlimentacion; i++) {
        entradaValida = false;  // Se reinicia para cada nuevo registro

        // Solicitamos nombre del animal
        String nombreanimal = JOptionPane.showInputDialog(null, "Ingrese el nombre del animal para el registro " + (i + 1) + ": ");

        // Selección de horario
        String[] opcioneshorario = {"7:00 am", "12:00 pm", "7:00 pm"};
        int opcionH = JOptionPane.showOptionDialog(
                null,
                "Seleccione una hora:",
                "Horarios",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcioneshorario,
                opcioneshorario[0]
        );
        String horario = opcioneshorario[opcionH];

        // Selección de tipo de alimento
        String[] opcionesAlimentos = {"Frutas", "Vegetales", "Carne", "Pescado"};
        int opcionA = JOptionPane.showOptionDialog(
                null,
                "Seleccione un tipo de Alimento:",
                "Alimentos",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcionesAlimentos,
                opcionesAlimentos[0]
        );
        String alimentos = opcionesAlimentos[opcionA];

        // Selección de frecuencia de alimentación
        String[] opcionesFrecuencia = {"5 horas", "8 horas", "1 día"};
        int opcionF = JOptionPane.showOptionDialog(
                null,
                "Seleccione la frecuencia de alimentación:",
                "Frecuencias",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcionesFrecuencia,
                opcionesFrecuencia[0]
        );
        String frecuenciaalimentacion = opcionesFrecuencia[opcionF];

        // Validación para determinar la cantidad de alimento
        double cantidadAlimento = 0;
        do {
            try {
                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de alimento en kg para el registro " + (i + 1) + ": ");
                if (input != null && !input.trim().isEmpty()) {  // Verificamos que la entrada no esté vacía
                    cantidadAlimento = Double.parseDouble(input);
                    if (cantidadAlimento > 0) {  // Aseguramos que la cantidad sea un número positivo
                        entradaValida = true;  // Establecemos que la entrada es válida
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor positivo.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El valor ingresado no puede estar vacío.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        } while (!entradaValida);

        // Creamos y almacenamos el objeto Alimentacion
        arrAlimentacion[i] = new Alimentacion(nombreanimal, horario, alimentos, frecuenciaalimentacion, cantidadAlimento);
    }

    // Mostramos los datos recopilados
    for (int i = 0; i < RegistroAlimentacion; i++) {
        JOptionPane.showMessageDialog(null,
                "Animal: " + arrAlimentacion[i].getNombreanimal()
                + "\nHora de alimentación: " + arrAlimentacion[i].getHorario()
                + "\nEste animal consume: " + arrAlimentacion[i].getAlimentos()
                + "\nEste animal come cada: " + arrAlimentacion[i].getFrecuenciaalimentacion()
                + "\nEste animal come (kilos): " + arrAlimentacion[i].getCantidadalimento());
        }
    }
   }
