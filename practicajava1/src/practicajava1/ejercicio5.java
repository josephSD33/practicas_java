
package practicajava1;

import java.util.Scanner;



public class ejercicio5 {
    public static void main(String[] args){
        Scanner memb = new Scanner(System.in);
        System.out.println("Ingrese el tipo de membrecia del cliente: ");
        String tipoMembresia = memb.nextLine().toUpperCase();
        
        switch (tipoMembresia) {
            case "A":
                System.out.println("Se le debe realizar un descuento del 10% ");
                break;
            case "B":
                System.out.println("Se le debe realizar un descuento del 20% ");
                break;
            case "C":
                System.out.println("Se le debe realizar un descuento del 40% ");
                break;
            default:
                System.out.println("Tipo de membresia no valido.");
                return;
                  
        
       
        
       
            
        }
        
       
        
        
    }
    
}
