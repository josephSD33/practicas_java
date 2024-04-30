/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuarto;
import com.itextpdf.text.Chunk;
import cuarto.fichas;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Component;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.Phaser;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class logicafichas {
    
    
    String nombrearchivo;
    String fecha;
    ArrayList<datos> datos;
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public logicafichas(String nombrearchivo, String fecha, ArrayList<datos> datos) {
        this.nombrearchivo = nombrearchivo;
        this.fecha = fecha;
        this.datos = datos;
        
        documento= new Document();
       titulo = new Paragraph("Ficha De Informacion");
        
        
    }
    
    public void crearFicha(){
        
        try {
            
            archivo= new FileOutputStream(nombrearchivo+".pdf");
            
            PdfWriter.getInstance(documento, archivo);
            
            documento.open();
            titulo.setAlignment(1);
            documento.add(titulo);
            
            
            
            documento.add(Chunk.NEWLINE);

            // Crear la tabla para el
            PdfPTable encabezadoTabla = new PdfPTable(3);
            encabezadoTabla.setWidthPercentage(100);

            // Añadir encabezados
            encabezadoTabla.addCell("Nombre");
            encabezadoTabla.addCell("Curso");
            encabezadoTabla.addCell("Tema");

            //tabla de encabezado
            for (datos dato : datos) {
                encabezadoTabla.addCell(dato.getNombre());
                encabezadoTabla.addCell(dato.getCurso());
                encabezadoTabla.addCell(dato.getTema());
            }

            documento.add(encabezadoTabla);

            documento.add(Chunk.NEWLINE);
            // Añadir el contenido
            for (datos dato : datos) {
                documento.add(new Paragraph("Contenido: " + dato.getContenido()));
                documento.add(Chunk.NEWLINE);
            }
            
            documento.add(new Paragraph(fecha));
            documento.close();
            
            
            
            
            
            
        } catch (Exception e) {
            
        }
    
}
    
    
    
    
    
    
    
    
}
