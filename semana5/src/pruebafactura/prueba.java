
package pruebafactura;

import Ejercicio5.Factura;

public class prueba {
    public static void main(String[] args) {
        
    Factura factura = new Factura("001", "Teclado", 2, 15.5);

       
    System.out.println("Numero de pieza: " + factura.getNumeroDePieza());
    System.out.println("Descripcion de pieza: " + factura.getDescripcionDePieza());
    System.out.println("Cantidad de articulos: " + factura.getCantidadDeArticulos());
    System.out.println("Precio por articulo: " + factura.getPrecioPorArticulo());
    System.out.println("Monto de la factura: " + factura.obtenerMontoFactura());

        
    factura.setCantidadDeArticulos(3);
    factura.setPrecioPorArticulo(20.0);

        
    System.out.println("\nCantidad de articulos actualizada: " + factura.getCantidadDeArticulos());
    System.out.println("Precio por articulo actualizado: " + factura.getPrecioPorArticulo());
    System.out.println("Monto de la factura actualizado: " + factura.obtenerMontoFactura());
    }
    
}
