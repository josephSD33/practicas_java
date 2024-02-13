
package practicajava1;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        
        int numarticulos;
        double total;
        double dinerodesc;
        
        Scanner arti = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de articulos comprados:");
        numarticulos= arti.nextInt();
        System.out.println("Ingrese la cantidad total a pagar: ");
        total=arti.nextDouble();
        
        if (numarticulos <20) {
            dinerodesc= total *0.15;
            
            
        }else{ 
            dinerodesc=total *0.20;  
    }
        
        System.out.println("El descuento obtenido es: " + dinerodesc);
        
        // no entendi lo de al azar 
        
        
        
        
      
    }
    
    
}
