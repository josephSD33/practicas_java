
package practicajava1;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);   
     int altura= scanner.nextInt();
     for (int i = 0; i < altura; i++) {
            
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }

            
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
             
    }
    
    }
    
}
