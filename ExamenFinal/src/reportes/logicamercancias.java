/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportes;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import ingresomercancias.mercancias;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;







public class logicamercancias {
    String nombrearchivo;
    String fecha;
    ArrayList<mercancias> infomercancia;
    
    Document documento;
    
    FileOutputStream archivo;
    Paragraph titulo;

    public logicamercancias(String nombrearchivo, String fecha, ArrayList<mercancias> infomercancia) {
        this.nombrearchivo = nombrearchivo;
        this.fecha = fecha;
        this.infomercancia = infomercancia;
        
        documento= new Document();
        titulo= new Paragraph("Reporte Mercancias");
    }
    
     public void crearReporte() throws FileNotFoundException, DocumentException{
        nombrearchivo="reportemercancias";
         archivo= new FileOutputStream(nombrearchivo+".pdf");
        PdfWriter.getInstance(documento, archivo);
        documento.open();
        
        titulo.setAlignment(1);
        documento.add(titulo);
        documento.add(Chunk.NEWLINE);
        
        
        
        PdfPTable tabla = new PdfPTable(2);
        tabla.setWidthPercentage(100);
        PdfPCell nombreproducto = new PdfPCell(new Phrase("nombreproducto"));
        PdfPCell precio = new PdfPCell(new Phrase("precio"));
        
        tabla.addCell(nombreproducto);
        tabla.addCell(precio);
        
         for (mercancias m : infomercancia) {
             tabla.addCell(m.getNombreproducto());
             tabla.addCell(m.getPrecio());
             
         }
         
         documento.add(tabla);
         documento.add(new Paragraph(fecha));
        
        
        
        documento.close();
     }

       

     
    
}
