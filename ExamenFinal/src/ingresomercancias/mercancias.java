/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresomercancias;

/**
 *
 * @author USUARIO
 */
public class mercancias {
    
    
    private String nombreproducto;
    private String precio;

    public mercancias(String nombreproducto, String precio) {
        this.nombreproducto = nombreproducto;
        this.precio = precio;
    }
    

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
    

    