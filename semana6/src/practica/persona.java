
package practica;

public class persona {
    private  String nombre;
    private  String cedula;       
    private String telefono; 
    private  int edad;
    private double altura; 
    
    
    public persona(String cedula, String nombre, String telefono, int edad, double altura){
        this.altura=altura;
        this.nombre=nombre;
        this.cedula=cedula;
        this.telefono=telefono;
        this.edad=edad;
        
        
            
        }
    }
    
    
    
    
    
  
    

    
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    






       
    

    
    

        
        
    
    
    
    
    
    
    
    
    
    
    
}
