import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class PDFReaderTest {

    public static void main(String[] args) throws IOException {
        readPDFTest();
    }

    public static void readPDFTest() throws IOException {

        URL url = new URL("file:///Users/ludo/formulier_beschermingsbewind_ca0451z5fol.pdf");

        InputStream is = url.openStream();
        BufferedInputStream fileParse = new BufferedInputStream(is);
        PDDocument document = null;


        document = PDDocument.load(fileParse);
        String pdfContent = new PDFTextStripper().getText(document);
        System.out.println(pdfContent);

    }
}
