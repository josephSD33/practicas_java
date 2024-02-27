
package logicadenegocios;

import java.util.Random;

public class Automovil {
    
    private String marca;
    private int costo;
    private int placa;
    private String color;
    private String fechaCompra;
    private String duenio;
    private String telefonoDuenio;
    private boolean isChocado;
    
    public Automovil(String pDuenio, String pTelefonoDuenio, String pMarca, String pColor) {
        marca = pMarca;
        color = pColor;
        duenio = pDuenio;
        telefonoDuenio = pTelefonoDuenio;
        costo = generarCostoAleatorio();
        placa = 0; // La placa se asignará automáticamente más adelante
        fechaCompra = "Fecha de compra no especificada";
        isChocado = false;
    }
    private int generarCostoAleatorio() {
        Random rand = new Random();
        return rand.nextInt((7000 - 3000) + 1) + 3000;
    }
    
    public void cambiarDuenio(String nuevoDuenio, String nuevoTelefono) {
        if (!isChocado) {
            duenio = nuevoDuenio;
            telefonoDuenio = nuevoTelefono;
            System.out.println("El cambio de duenno se ha realizado satisfactoriamente.");
        } else {
            System.out.println("El automovil está chocado. No se puede cambiar de dueño.");
        }
    }
    public void cambiarColor(String nuevoColor) {
        if (!color.equals(nuevoColor)) {
            color = nuevoColor;
            System.out.println("El cambio de color se ha realizado satisfactoriamente.");
        } else {
            System.out.println("El color nuevo es igual al anterior. No se permite el cambio.");
        }
    }
    public void chocarAutomovil() {
        isChocado = true;
    }
    public void repararAutomovil() {
        isChocado = false;
    }
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", costo=" + costo +
                ", placa=" + placa +
                ", color='" + color + '\'' +
                ", fechaCompra='" + fechaCompra + '\'' +
                ", duenio='" + duenio + '\'' +
                ", telefonoDuenio='" + telefonoDuenio + '\'' +
                ", isChocado=" + isChocado +
                '}';
    }
    
}
