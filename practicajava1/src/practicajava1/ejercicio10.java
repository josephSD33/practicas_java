
package practicajava1;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad a invertir");
        double cantidad= scanner.nextDouble();
        System.out.println("ingrese el porcentage de interes anual");
        double interes= scanner.nextDouble()/100;
        System.out.println("Ingrese el numero de annos que desea invetir");
        int annos= scanner.nextInt();
        for (int i = 0; i < annos; i++) {
            cantidad += cantidad * interes;
            System.out.println("Capital obtenido despues de " + i + " annos: " + cantidad);
            
            
        }
        
        
        
        
        
    }
    
}
