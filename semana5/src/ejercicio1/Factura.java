
package ejercicio1;

public class Factura {
    
    private String numeroDePieza;
    private String descripcionDePieza;
    private int cantidadDeArticulos;
    private double precioPorArticulo;
    
    //constructor
    public Factura(String pNumeroDePieza, String pDescripcionDePieza, int pCantidadDeArticulos, double pPrecioPorArticulo) {
        numeroDePieza = pNumeroDePieza;
        descripcionDePieza = pDescripcionDePieza;
        setCantidadDeArticulos(pCantidadDeArticulos);
        setPrecioPorArticulo(pPrecioPorArticulo);
    }
    
    
    public String getNumeroDePieza() {
        return numeroDePieza;
    }
    
    public void setNumeroDePieza(String pNumeroDePieza) {
        numeroDePieza = pNumeroDePieza;
    }

     public String getDescripcionDePieza() {
        return descripcionDePieza;
    }
     
    public void setDescripcionDePieza(String pDescripcionDePieza) {
        descripcionDePieza = pDescripcionDePieza;
    }
    public int getCantidadDeArticulos() {
        return cantidadDeArticulos;
    }
    public void setCantidadDeArticulos(int pCantidadDeArticulos){
        cantidadDeArticulos = pCantidadDeArticulos;
    }
    
     public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }
    public void setPrecioPorArticulo(double pPrecioPorArticulo) {
        if (pPrecioPorArticulo > 0) {
            precioPorArticulo = pPrecioPorArticulo;
        } else {
            precioPorArticulo = 0.0;
        }
    }
    public double obtenerMontoFactura() {
    return cantidadDeArticulos * precioPorArticulo;
}
    
}
