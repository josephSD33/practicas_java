package practicajava1;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos numeros va a introducir al programa");
        int cantidad= scanner.nextInt();
        
        int positivos=0;
        int negativos=0;
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            int numero= scanner.nextInt();
            
            if (numero>0) {
                positivos++;
                
                
            }else if (numero<0) {
                negativos++;
                
            }
            
         
        }
        System.out.println("Cantidad de numeros positivos introducidos: " + positivos);
        System.out.println("Cantidad de numeros negativos introducidos: " + negativos);
        
        }
        
                
    }
    

