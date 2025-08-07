/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2;

/**
 *
 * @author Ariel
 */

import javax.swing.JOptionPane;

public class Hotel {

    private Habitacion[][] habitaciones;

    public Hotel() {
        habitaciones = new Habitacion[3][3]; // 3 pisos, 3 habitaciones por piso
        precargarHabitaciones();
    }

    private void precargarHabitaciones() {
        int numeroBase = 101;

        for (int piso = 0; piso < 3; piso++) {
            for (int hab = 0; hab < 3; hab++) {
                String numero = "" + (numeroBase + piso * 100 + hab);

                String tipo;
                if (hab % 2 == 0) {
                    tipo = "Simple";
                } else {
                    tipo = "Doble";
                }

                int precio;
                if (tipo.equals("Simple")) {
                    precio = 40;
                } else {
                    precio = 60;
                }

                String estado = "Libre";

                habitaciones[piso][hab] = new Habitacion(numero, tipo, precio, estado);
            }
        }

        //Actua como si ya hubieran habitaciones reservadas
        habitaciones[0][2].setEstado("Sucia");   
        habitaciones[1][1].setEstado("Ocupada"); 
        habitaciones[2][0].setEstado("Sucia");  
    }

    public void mostrarEstadoHotel() {
        String info = "=== Estado de las habitaciones ===\n";
        //print de la matriz
        for (int piso = 2; piso >= 0; piso--) {
            info += "Piso " + (piso + 1) + ":\n";
            for (int hab = 0; hab < 3; hab++) {
                info += habitaciones[piso][hab].getInfo() + "\n";
            }
            info += "\n";
        }

        JOptionPane.showMessageDialog(null, info, "Estado del Hotel", JOptionPane.INFORMATION_MESSAGE);
    }
    //cambia la informacion de las habitaciones
    public void modificarHabitacion() {
        String numero = JOptionPane.showInputDialog("Ingrese número de habitación a modificar:");
        boolean encontrada = false;

        for (int piso = 0; piso < 3; piso++) {
            for (int hab = 0; hab < 3; hab++) {
                Habitacion h = habitaciones[piso][hab];
                if (h.getNumero().equals(numero)) {
                    String nuevoEstado = JOptionPane.showInputDialog("Nuevo estado (Libre, Ocupada, Sucia):");
                    String nuevoTipo = JOptionPane.showInputDialog("Nuevo tipo (Simple, Doble):");
                    int nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog("Nuevo precio:"));

                    h.setEstado(nuevoEstado);
                    h.setTipo(nuevoTipo);
                    h.setPrecio(nuevoPrecio);

                    JOptionPane.showMessageDialog(null, "Habitación " + numero + " modificada con éxito.");
                    encontrada = true;
                    break;
                }
            }
        }
        //alerta de que no se encontró el numero de habitación
        if (!encontrada) {
            JOptionPane.showMessageDialog(null, "Habitación no encontrada.");
        }
    }
    //calcula la cantidad de habitaciones libres, ocupadas, sucias y la ganancia de las habitaciones ocupadas
    public void mostrarResumen() {
        int libres = 0, ocupadas = 0, sucias = 0, ganancia = 0;
        int total = 9;

        for (int piso = 0; piso < 3; piso++) {
            for (int hab = 0; hab < 3; hab++) {
                Habitacion h = habitaciones[piso][hab];
                String estado = h.getEstado().toLowerCase();

                if (estado.equals("libre")) {
                    libres++;
                } else if (estado.equals("ocupada")) {
                    ocupadas++;
                    ganancia += h.getPrecio();
                } else if (estado.equals("sucia")) {
                    sucias++;
                }
            }
        }


        String resumen = "";
        resumen += "Total habitaciones: " + total + "\n";
        resumen += "Libres: " + libres + "\n";
        resumen += "Ocupadas: " + ocupadas + " \n";
        resumen += "Sucias: " + sucias + " \n";
        resumen += "Ganancia actual: $" + ganancia;

        JOptionPane.showMessageDialog(null, resumen, "Resumen del Hotel", JOptionPane.INFORMATION_MESSAGE);
    }
}

