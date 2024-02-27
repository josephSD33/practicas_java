
package Princiapl;

import ejercicio2.Encargado;


public class prueba2 {
    public static void main(String[] args) {
        
        
        Encargado encargado1= new Encargado("Joseph","Segura", 5000);
        Encargado encargado2= new Encargado("Cristian","Sanco", 7500);
        
        System.out.println("Salario anual del encargado1: " + encargado1.getSalarioMensual() * 12);
        System.out.println("Salario anual del encargado2: " + encargado2.getSalarioMensual() * 12);
         
        
        
        double aumento1 = (encargado1.getSalarioMensual()*12)*1.10;
        double aumento2 = (encargado2.getSalarioMensual()*12)*1.10;
        
        System.out.println("El salario anual del encargado1 tras el aumento es"+aumento1);
        System.out.println("El salario anual del encargado2 tras el aumento es"+aumento2);
                
         
        
        
       
    }
    
}
