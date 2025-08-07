/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio2;
import javax.swing.JOptionPane;
/**
 *
 * @author Ariel
 */
public class CasoEstudio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        
        //opciones del menu
        String[] opciones = {"Ver habitaciones", "Modificar habitación", "Ver resumen", "Salir"};
        int opcion;
       //print del menu
        do {
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Sistema de Gestión Hotelera",
                    "Menú Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (opcion) {
                case 0 -> hotel.mostrarEstadoHotel();
                case 1 -> hotel.modificarHabitacion();
                case 2 -> hotel.mostrarResumen();
                case 3 -> JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema.");
                default -> {}
            }
            //while para salir del programa al presionar salir
        } while (opcion != 3 && opcion != JOptionPane.CLOSED_OPTION);
    }
}





