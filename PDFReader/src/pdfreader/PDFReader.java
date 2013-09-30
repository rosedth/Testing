/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfreader;

import org.apache.pdfbox.pdfparser.PDFParser;
/**
 *
 * @author Ro
 */
public class PDFReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ext= args[0].substring(args[0].lastIndexOf('.'));
        if (ext.equalsIgnoreCase(".pdf")) {
            String text = PDFTextParser.pdftoText(args[0]);
            System.out.printf(text);
        }
                
    }
    
    
}
