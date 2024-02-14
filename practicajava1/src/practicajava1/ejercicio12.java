
package practicajava1;
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double costoest;
        
        System.out.println("Ingrese la cantidad de estudiantes que asistiran al viaje");
        int estudiantes= scanner.nextInt();
        if (estudiantes>=100) {
            costoest= 65.00;  
        }else if (estudiantes>=50&& estudiantes<=99) {
            costoest=70.00;
            
    
        }else if (estudiantes>=30 && estudiantes<=49) {
            costoest=95.00;
            
            
        }else{
            costoest = estudiantes != 0 ? 4000.00 / estudiantes : 0;
             
        }
         System.out.println("El costo por alumno es: $" + costoest);
            
       
        
    }
    
}
