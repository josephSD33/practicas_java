
package clases;


public class Estudiante {
    
    
    private String nombre;
    private String apellidos;
    private String cedula;
    private String correo;
    private String seccion;
    private String telefono;
    private double promedio;

    public Estudiante(String nombre, String apellidos, String cedula, String correo, String seccion, String telefono, double promedio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.seccion = seccion;
        this.telefono = telefono;
        this.promedio = promedio;
    }

    public Estudiante() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula.length()!=12) { 
            System.out.println("La cedula debe tener 12 caracteres");
        }
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        if (!seccion.equals("7-1") && !seccion.equals("7-2")) {
            System.out.println("La seccion solo puede ser 7-1 o 7-2");

        }
        
        this.seccion = seccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio<0) {
            System.out.println("El promedio no puede ser negativo");
             
        }
        
        this.promedio = promedio;
    }
    
    
      
    
 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

