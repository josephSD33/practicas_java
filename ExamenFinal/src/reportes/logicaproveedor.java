
package reportes;


import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import proveedores.proveedores;


public class logicaproveedor {
    
    String nombrearchivo;
    String fecha;
    ArrayList<proveedores> infoprov;
    
    Document documento;
    
    FileOutputStream archivo;
    Paragraph titulo;

    public logicaproveedor(String nombrearchivo, String fecha, ArrayList<proveedores> infoprov) {
        this.nombrearchivo = nombrearchivo;
        this.fecha = fecha;
        this.infoprov = infoprov;
        
        documento= new Document();
        titulo= new Paragraph("Reporte Proveedores");
        
    }
    public void crearReporte() throws FileNotFoundException, DocumentException{
        nombrearchivo="reporteproveedores";
        
        archivo= new FileOutputStream(nombrearchivo+".pdf");
        PdfWriter.getInstance(documento, archivo);
        documento.open();
        
        titulo.setAlignment(1);
        documento.add(titulo);
        documento.add(Chunk.NEWLINE);
        
        PdfPTable tabla = new PdfPTable(4);
        tabla.setWidthPercentage(100);
        PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
        
        PdfPCell telefono = new PdfPCell(new Phrase("telefono"));
        
        PdfPCell correo = new PdfPCell(new Phrase("correo"));
        
        PdfPCell producto = new PdfPCell(new Phrase("producto"));
        
        tabla.addCell(nombre);
        tabla.addCell(telefono);
        tabla.addCell(correo);
        tabla.addCell(producto);
        
        for (proveedores p : infoprov) {
            
            tabla.addCell(p.getNombre());
            tabla.addCell(p.getTelefono());
            tabla.addCell(p.getCorreo());
            tabla.addCell(p.getProducto());
            
        }
        documento.add(tabla);
        documento.add(new Paragraph(fecha));
        
        
        
        documento.close();
        
    }
     
    
    
    
    
    
    
}
