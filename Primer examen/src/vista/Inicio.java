
package vista;
import java.util.Scanner;
import clases.Estudiante;



public class Inicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        
        while (intentos < 3) {
            
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Contrasenna: ");
            String contrasena = scanner.nextLine();
            
            if (usuario.equals("admin") && contrasena.equals("adminadmin")) {
                System.out.println("usuario correcto ");
                break;
            } else {
                System.out.println("Usuario o contrasenna incorrectos ");
                intentos++;
            }
        }
        if (intentos == 3) {
            System.out.println("Maximo de intentos alcansados ");
        }
        Estudiante[] estudiantes = new Estudiante[5];
        
        for (int i = 0; i < 5; i++) {
             System.out.println("Ingresando informacion del estudiante " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();
            System.out.print("Cedula: ");
            String cedula = scanner.nextLine();
            System.out.print("Correo: ");
            String correo = scanner.nextLine();
            System.out.print("Seccion (7-1 o 7-2): ");
            String seccion = scanner.nextLine();
            System.out.print("Telefono: ");
            String telefono = scanner.nextLine();
            System.out.print("Promedio: ");
            double promedio = Double.parseDouble(scanner.nextLine());
            
            
            estudiantes[i] = new Estudiante(nombre, apellidos, cedula, correo, seccion, telefono, promedio);
            
        }
        
     
        Estudiante mejorEstudiante = estudiantes[0];
        for (int i = 1; i < 5; i++) {
            if (estudiantes[i].getPromedio() > mejorEstudiante.getPromedio()) {
                mejorEstudiante = estudiantes[i];
            }
        }
        
      
        
        System.out.println("\nEstudiante con mejor nota:");
        System.out.printf("\nNombre: "+ mejorEstudiante.getNombre(), mejorEstudiante.getApellidos());
        System.out.printf("\nCedula: "+ mejorEstudiante.getCedula());
        System.out.printf("\nCorreo: "+ mejorEstudiante.getCorreo());
        System.out.printf("\nSeccion: "+ mejorEstudiante.getSeccion());
        System.out.printf("\nTelefono: "+ mejorEstudiante.getTelefono());
        System.out.printf("\nPromedio: "+ mejorEstudiante.getPromedio());
        
        
        
     
        
    }  
}
