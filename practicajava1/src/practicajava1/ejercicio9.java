package practicajava1;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer anno");
        int primer= scanner.nextInt();
        System.out.println("Ingrese el segundo anno");
        int segundo= scanner.nextInt();
        
        for (int i = primer; i <= segundo; i++) {
            System.out.println(i);
            
        }
    }
    
}
