package practicajava1;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero natural");
        int numero = scanner.nextInt();
        int suma =0;
        int contador = 1;
        
        while(contador<=numero){
            suma+=contador;
            contador++;
            
      
            
            
        }
    System.out.println("La suma de los numeros naturales hasta " + numero + " es: " + suma);     
         
    }
}
