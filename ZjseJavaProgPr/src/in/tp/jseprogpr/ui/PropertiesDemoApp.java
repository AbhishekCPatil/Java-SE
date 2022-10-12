package in.tp.jseprogpr.ui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemoApp {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		
		OutputStream outStream = new FileOutputStream("dataConfig.properties");
		
		prop.setProperty("url", "localhost:3306/demoDB");
		prop.setProperty("uname", "root");
		prop.setProperty("password", "root123");
		
		prop.store(outStream, null);
		
		InputStream inpStream = new FileInputStream("dataConfig.properties");
		prop.load(inpStream);
		
		System.out.println(prop.getProperty("uname"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("password"));
		
		prop.list(System.out);

	}

}
