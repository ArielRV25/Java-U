/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.evaluada.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Ariel
 */
public class PracticaEvaluada3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cant;
        cant=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos productos quiere agregar"));
        Productos prod[] = new Productos[cant];
        solicitaDatosProductos(prod);
        imprimeDatosProductos(prod);
        JOptionPane.showMessageDialog(null, "La ganancia final es de: "+calcularGananciaFinal());
    }
    
    
    
    public static void solicitaDatosProductos(Productos[] vector){
        for (int i = 0; i < vector.length; i++) {
            String nombre = JOptionPane.showInputDialog("Digite el nombre del producto");
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto"));
            String tipo =JOptionPane.showInputDialog("Digite el tipo del producto");
            double precio= Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del producto"));
            double precioBruto=0;
            precioBruto= calcularPrecioBruto(tipo,precio,precioBruto);
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos"));
            vector[i]=new Productos(nombre, codigo, tipo, precio, precioBruto,cantidad);
        }
    }
    
    public  static double  calcularPrecioBruto(String tipo, double precio, double precioBruto){
        if (tipo.toUpperCase().equals("ALIMENTOS")) {
            precioBruto = precio*0.2+precio;
        }else if (tipo.toUpperCase().equals("BEBIDAS")){
            precioBruto=precio*0.3+precio;
        }else if (tipo.toUpperCase().equals("HIGIENE")){
            precioBruto=precio*0.25+precio+500;
        }else if (tipo.toUpperCase().equals("LIMPIEZA")){
            precioBruto=precio*0.19+precio+0.04+1000+precio;
        }    
    return precioBruto;
}
    public double calcularGananciaFinal(Productos[] vector, double precioBruto, double precio, double cantprod){
        double gananciaFinal=0;
         for (int i = 0; i < vector.length; i++) {
             gananciaFinal=precioBruto-precio*cantprod;
         }
        return gananciaFinal;
    }
  
    public static void imprimeDatosProductos(Productos[] vector){
    StringBuilder resultado= new StringBuilder();
        for (int i = 0; i < vector.length; i++) {
            resultado.append(vector[i]);
            resultado.append("\n");
        }
        
        JOptionPane.showMessageDialog(null, resultado);
}
}
