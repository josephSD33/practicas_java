
package logicadenegocios;

import java.util.*;
import java.text.*;


public class Cuenta {
    
    private static int sCantCuentas = 0;
    private int numCuenta = 0;
    private String duenio = null;
    private double saldo = 0;
    private Date fechaCreacion;
    
//constructor
    public Cuenta(String pNombre, double pMonto) {
    sCantCuentas++;
    setNumCuenta(sCantCuentas);
    depositar(pMonto);
    setDuenio(pNombre);
    setFechaCreacion( );
    }

    public int getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(int pNumCuenta) {
        numCuenta = pNumCuenta;
    }
    
    public String getDuenio(){
        return duenio; 
    }
     public void setDuenio(String pDuenio) {
        duenio = pDuenio;
    }
     
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double pSaldo) {
        saldo = pSaldo;
    }
    
     public String depositar(double pMonto) {
        saldo += pMonto;
        return "El saldo actual despues del deposito es: " + saldo;
    }

    private boolean validarRetiro(double pMonto) {
        return pMonto <= saldo;
    }
    
    public String retirar(double pMonto) {
        if (validarRetiro(pMonto)) {
            saldo -= pMonto;
            return "El saldo actual despues del retiro es: " + saldo;
        } else {
            return "No tiene suficiente dinero";
        }
    }
    
    public String toString() {
    String msg;
    msg = "Cuenta Numero: " + getNumCuenta() + "\n";
    msg += "Fecha Creacion: " + getFechaCreacion() + "\n";
    msg += "Dueno: " + getDuenio() + "\n";
    msg += "Saldo: " + getSaldo() + "\n";
    return msg;
    }

    public void setFechaCreacion() {
    Calendar calendario = Calendar.getInstance();
    fechaCreacion = calendario.getTime();
    }
    public String getFechaCreacion() {
    SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
    return mascara.format(fechaCreacion);
}
        
        
    
    
    
    
}
