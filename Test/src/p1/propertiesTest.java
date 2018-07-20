package p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src//demo.properties"));
		properties.setProperty("address", "patna bihar");
		properties.setProperty("name", "");
		System.out.println(properties.get("name"));
		
		properties.list(System.out);
		
		properties.store(new FileOutputStream("aa.properties"), "Auto generated file");
		
		System.out.println(System.getProperty("name"));
	}
}
