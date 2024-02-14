
package practicajava1;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumanotas = 0;
        int totalnotas = 0;
        while(true){
            System.out.println("Ingrese la nota del estudiante");
            double nota=scanner.nextDouble();
            sumanotas+=nota;
            totalnotas++;
            
            System.out.println("desea ingresar otro estudiante?");
            String continuar = scanner.next().toLowerCase();
            if (!continuar.equals("si")) {
                break;
                
                
            }
        }
        double promedio = 0;
      
            promedio = sumanotas / totalnotas;
        System.out.println("El promedio de las notas ingresadas es: " + promedio);

        
        
        
    }
    
}
