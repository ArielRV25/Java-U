/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2;

/**
 *
 * @author Ariel
 */
public class Habitacion {
    private String numero;
    private String tipo;
    private int precio;
    private String estado;

    
    //Constructores
    
    public Habitacion() {
    }

    public Habitacion(String numero, String tipo, int precio, String estado) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
    }
    //getters y setters
    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getInfo() {
        return "Habitación " + numero + " | Tipo: " + tipo + " | Precio: $" + precio + " | Estado: " + estado;
    }
}





