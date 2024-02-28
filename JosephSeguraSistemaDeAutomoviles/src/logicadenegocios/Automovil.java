
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
        placa = 0;
        fechaCompra = "Fecha de compra no especificada";
        isChocado = false;
    }
     public String getMarca() {
        return marca;
    }

    public void setMarca(String pMarca) {
        marca = pMarca;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int pCosto) {
        costo = pCosto;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int pPlaca) {
        placa = pPlaca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String pColor) {
        color = pColor;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String pFechaCompra) {
        fechaCompra = pFechaCompra;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String pDuenio) {
        duenio = pDuenio;
    }

    public String getTelefonoDuenio() {
        return telefonoDuenio;
    }

    public void setTelefonoDuenio(String pTelefonoDuenio) {
        telefonoDuenio = pTelefonoDuenio;
    }

    public boolean isChocado() {
        return isChocado;
    }

    public void setChocado(boolean pChocado) {
        isChocado = pChocado;
    }
    
     public void cambiarDuenio(String pNuevoDuenio, String pNuevoTelefono) {
        if (!isChocado) {
            duenio = pNuevoDuenio;
            telefonoDuenio = pNuevoTelefono;
            System.out.println("El cambio de dueño se ha realizado");
        } else {
            System.out.println("El automóvil está chocado, no se puede cambiar ");
        }
    }


     public void cambiarColor(String pNuevoColor) {
        if (!pNuevoColor.equals(color)) {
            color = pNuevoColor;
        } else {
            System.out.println("El color nuevo es igual al anterior, no se permite el cambio.");
        }
    }
     
     public void chocarAutomovil() {
        isChocado = true;
    }
     
      public void repararAutomovil() {
        isChocado = false;
    }
      private int generarCostoAleatorio() {
        Random rand = new Random();
        return rand.nextInt(4001) + 3000;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Automovil{");
        sb.append("marca=").append(marca);
        sb.append(", costo=").append(costo);
        sb.append(", placa=").append(placa);
        sb.append(", color=").append(color);
        sb.append(", fechaCompra=").append(fechaCompra);
        sb.append(", duenio=").append(duenio);
        sb.append(", telefonoDuenio=").append(telefonoDuenio);
        sb.append(", isChocado=").append(isChocado);
        sb.append('}');
        return sb.toString();
    }
      
    
      
    
        
      
    
     
      
      
      
     
     
     
}

    


