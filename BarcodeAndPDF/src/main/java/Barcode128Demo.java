import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfWriter;

public class Barcode128Demo {
		public static void main(String[] args) throws FileNotFoundException, DocumentException {
			Document document = new  Document(PageSize.A4);
			PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("barcode.pdf"));
			document.open();
			document.add(new Paragraph("This is just a test demo file for barcode reading in java"));
			
			Barcode128 barcode128 = new Barcode128();
			barcode128.setGenerateChecksum(true);
			barcode128.setCode("123456789");
			document.add(barcode128.createImageWithBarcode(pdfWriter.getDirectContent(), null, null));
			document.close();
			System.out.println("bar code pdf created...");
		}
}
