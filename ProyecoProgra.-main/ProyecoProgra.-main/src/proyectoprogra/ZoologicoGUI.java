/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZoologicoGUI extends JFrame{
     public ZoologicoGUI() {
        // Configurar el JFrame (la ventana)
        setTitle("Mapa del Zoológico");  // Titulo de la ventana
        setSize(1024, 768);               // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Acción al cerrar la ventana
        setLocationRelativeTo(null);     // Centrar la ventana en la pantalla

        JPanel panelMapa = new JPanel(); // Crear el panel
        panelMapa.setLayout(null);       // Configurar el layout como null

        // Cargar la imagen del mapa y agregarla a un JLabel (inicialmente invisible)
        ImageIcon mapaZoologico = new ImageIcon("C:\\Users\\josem\\Downloads\\zoologico.png"); // ruta de tu imagen
        JLabel labelMapa = new JLabel(mapaZoologico);
        labelMapa.setBounds(0, 0, mapaZoologico.getIconWidth(), mapaZoologico.getIconHeight()); // Posición de la imagen en el panel
        labelMapa.setVisible(false); // Inicialmente invisible

        // Anadir la imagen al panel
        panelMapa.add(labelMapa);

        // Botón para mostrar el mapa
        JButton btnMostrarMapa = new JButton("Mostrar Mapa");
        btnMostrarMapa.setBounds(10, 10, 150, 30);
        btnMostrarMapa.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                labelMapa.setVisible(true); // Mostrar el mapa
            }
        });
        panelMapa.add(btnMostrarMapa);

        // Botones para diferentes animales (inicialmente invisibles)
        JButton btnLeon = new JButton("León");
        btnLeon.setBounds(299, 5, 100, 30);
        btnLeon.setVisible(false); // Inicialmente invisible
        btnLeon.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "El león es un mamífero carnívoro de la familia de los félidos.");
            }
        });
        panelMapa.add(btnLeon);

        JButton btnElefante = new JButton("Elefante");
        btnElefante.setBounds(200, 150, 100, 30);
        btnElefante.setVisible(false); // Inicialmente invisible
        btnElefante.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "El elefante es el animal terrestre más grande.");
            }
        });
        panelMapa.add(btnElefante);

        JButton btnMono = new JButton("Mono");
        btnMono.setBounds(300, 200, 80, 30);
        btnMono.setVisible(false); // Inicialmente invisible
        btnMono.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Los monos son primates que viven en todo el mundo.");
            }
        });
        panelMapa.add(btnMono);

        JButton btnJirafa = new JButton("Jirafa");
        btnJirafa.setBounds(400, 300, 80, 30);
        btnJirafa.setVisible(false); // Inicialmente invisible
        btnJirafa.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "La jirafa es el mamífero más alto del mundo.");
            }
        });
        panelMapa.add(btnJirafa);

        JButton btnTigre = new JButton("Tigre");
        btnTigre.setBounds(300, 100, 80, 30);
        btnTigre.setVisible(false); // Inicialmente invisible
        btnTigre.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "El tigre es el felino más grande del mundo.");
            }
        });
        panelMapa.add(btnTigre);

        // Modificar la acción del botón "Mostrar Mapa" para mostrar los botones de animales también
        btnMostrarMapa.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                labelMapa.setVisible(true); // Mostrar el mapa
                btnLeon.setVisible(true);   // Mostrar botones
                btnElefante.setVisible(true);
                btnMono.setVisible(true);
                btnJirafa.setVisible(true);
                btnTigre.setVisible(true);
            }
        });

        // Añadir el panel al JFrame
        add(panelMapa);

        // Hacer visible la ventana
        setVisible(true);
    }

}