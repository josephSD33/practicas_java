
package practicajava1;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad del cliente");
        int edad= scanner.nextInt();
        if (edad<4) {
            System.out.println("El cliente entra gratis");
            
        }else if (edad>=4&&edad<=9) {
            System.out.println("El cliente debe pagar 5 dolares ");
            
            
        }else if (edad>=10&&edad<=15) {
            System.out.println("Debe pagar 7 dolares");
            
        } else if (edad>=16) {
            System.out.println("Debe pagar 10 dolares");
            
        }
 {
            
        }
            
        }
        
    }
    

