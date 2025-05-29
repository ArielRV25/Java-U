/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.evaluada.pkg1;

import javax.swing.JOptionPane;
/**
 *
 * @author Ariel
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double SEM=0;
       double IVM=0;;
       int salario;
       JOptionPane.showMessageDialog(null, "Bienvenido al calculo de pago a la CCSS ");
       String leer=JOptionPane.showInputDialog("Digite el salario del colaborador");
       salario = Integer.parseInt(leer);
       SEM=salario*0.0925;
       IVM=salario*0.0508;
       double deducible=SEM+IVM;
       double salar=salario-deducible;
       double asosiacion=salar*0.025;
       JOptionPane.showMessageDialog(null, "La Empresa deberá abonar a la CCSS el monto de "+deducible+" por concepto de SEM y IVM");
       JOptionPane.showMessageDialog(null, "Para la asociación de la empresa se le asigna un valor de"+asosiacion);
    }
    
}
