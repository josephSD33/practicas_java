
package ejercicio2;

public class Encargado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;
   
    //constructor
    public Encargado(String pPrimerNombre, String pApellidoPaterno, double pSalarioMensual) {
        primerNombre = pPrimerNombre;
        apellidoPaterno = pApellidoPaterno;
        salarioMensual = pSalarioMensual;
    }
    public String getPrimerNombre() {
        return primerNombre;
    }
    public void setPrimerNombre(String pPrimerNombre) {
        primerNombre = pPrimerNombre;
    }
    
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String pApellidoPaterno) {
        apellidoPaterno = pApellidoPaterno;
    }
    
    public double getSalarioMensual() {
        return salarioMensual;
    }
    public void setSalarioMensual(double pSalarioMensual){
        if (salarioMensual>0) {
            salarioMensual = pSalarioMensual;
        }else{System.out.println("salario mensual no positivo");
           
           
            
        }
        
        
        
    }
   
  
    
    
    
    
    
    
    
    

    
}
