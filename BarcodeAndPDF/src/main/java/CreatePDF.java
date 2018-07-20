import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePDF {
	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
		OutputStream outputStream = new FileOutputStream("mypdf.pdf");
		Document document = new Document();
		PdfWriter.getInstance(document, outputStream);
		
		//write image in pdf
		
		Image image = Image.getInstance("krishna.jpg");
		image.scaleAbsolute(100f, 100f);
		
		//Add table in side the pdf
		
		PdfPTable pdfPTable = new PdfPTable(3);
		
		PdfPCell cell = 
		
		
		document.open();
		document.add(image);
		
		document.close();
		outputStream.close();
		
		System.out.println("opetation done...");
		
	}
}
