
package logica;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 *
 * @author keidy
 */


import javax.imageio.ImageIO;
import javax.servlet.http.HttpSessionAttributeListener;
 
 
public class ModificarPDF{
 

    public void modificarPDF (String nombreParticipante ,String Path,String correo){
        try {
            
    
            // input PDF
            PdfReader reader = new PdfReader(Path+"Diseño Diplomas La Florida.pdf");

            // output PDF
            PdfStamper stamper = new PdfStamper(reader,
                new FileOutputStream(Path+"Diploma_"+correo+".pdf"));

            PdfContentByte pdfContentByte = stamper.getOverContent(1);
        
            // imagen del nombre del participante
            float x1 = reader.getPageSize(1).getWidth() - 525;
            float y1 = reader.getPageSize(1).getHeight() - 328;
            com.itextpdf.text.Image imageParticipante = com.itextpdf.text.Image.getInstance(createImage(nombreParticipante), null);
            imageParticipante.setAbsolutePosition(x1, y1);
            pdfContentByte.addImage(imageParticipante);
            
            // imagen de la firma
            float x = reader.getPageSize(1).getWidth() - 450;
            float y = reader.getPageSize(1).getHeight() - 470;
            com.itextpdf.text.Image image = com.itextpdf.text.Image.getInstance(getImage(Path), null);
            image.setAbsolutePosition(x, y);
            pdfContentByte.addImage(image);

            stamper.close(); 
            
        } catch (IOException ex) {
            //Logger.getLogger(PedirNombre.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } catch (DocumentException ex) {
            //Logger.getLogger(PedirNombre.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }
 
    public  Image getImage(String Path) {
 
        File file = new File(Path+"firma1.png");
 
        BufferedImage image = null;
 
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        System.out.println("PDF MODIFICADO");
        return image;
    }
    
    public Image createImage(String nombre){
        BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        Font font = new Font("Algerian", Font.PLAIN, 26);
        g2d.setFont(font);
        FontMetrics fm = g2d.getFontMetrics();
        int width = fm.stringWidth(nombre);
        int height = fm.getHeight();
        g2d.dispose();

        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        g2d = img.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        g2d.setFont(font);
        fm = g2d.getFontMetrics();
        g2d.setColor(Color.BLACK);
        g2d.drawString(nombre, 0, fm.getAscent());
        g2d.dispose();
        try {
            ImageIO.write(img, "png", new File("Text.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return img;
    }
    
}