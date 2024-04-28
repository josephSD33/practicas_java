/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proveedores;



/**
 *
 * @author USUARIO
 */
public class proveedores {
    
    private String nombre;
    private String telefono;
    private String correo;
    private String producto;

    public proveedores(String nombre, String telefono, String correo, String producto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.producto = producto;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    
    
    
    
    
}
