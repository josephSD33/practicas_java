
package practicajava1;


import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        
        double montocompra;
        double montofinal;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el monto a pagar del cliente:");
        montocompra = scanner.nextDouble(); 
        
        if (montocompra >= 10000 && montocompra <= 20000) {
            montofinal = montocompra * 0.9; 
        } else if (montocompra >= 20001 && montocompra <= 50000) {
            montofinal = montocompra * 0.7; 
        } else if (montocompra > 50000) {
            montofinal = montocompra * 0.5;
        } else {
            montofinal = montocompra; 
        }
    
        System.out.println("El monto a pagar con el descuento aplicado es de: " + montofinal);
        
        scanner.close();
    }
}

