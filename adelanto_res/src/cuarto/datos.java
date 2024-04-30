/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuarto;

import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class datos {
    
    private String nombre;
    private String curso; 
    private String tema;
    private String contenido;

    public datos(String nombre, String curso, String tema, String contenido) {
        this.nombre = nombre;
        this.curso = curso;
        this.tema = tema;
        this.contenido = contenido;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
    
    
    
}
