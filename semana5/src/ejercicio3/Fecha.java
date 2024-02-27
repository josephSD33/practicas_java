
package ejercicio3;

public class Fecha {
    
    private int mes;
    private int dia;
    private int anno;
    
    //constructor
    public Fecha(int pMes, int pDia, int pAnno){
        mes=pMes;
        dia=pDia;
        anno=pAnno;   
    }
     public int getMes() {
        return mes;
    }
    public void setMes(int pMes) {
        mes = pMes;
    }
    
    public int getDia() {
        return dia;
    }
    public void setDia(int pDia) {
        dia = pDia;
    }
    
    public int getAnno() {
        return anno;
    }
    public void setAnno(int pAnno) {
        anno = pAnno;
    }
    public void mostrarFecha() {
        System.out.println(mes + "/" + dia + "/" + anno);
    }
    
    
    
    
   
    
    
}
