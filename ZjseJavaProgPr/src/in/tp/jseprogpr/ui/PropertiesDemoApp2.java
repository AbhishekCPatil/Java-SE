package in.tp.jseprogpr.ui;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemoApp2 {

	public static void main(String[] args) throws Exception {
		
		Properties p = new Properties();
		OutputStream os = new FileOutputStream ("database.properties");
		
		p.setProperty("url", "localhost\\:3306\\demoDB2");
		p.setProperty("uname", "acp@hpe.com");
		p.setProperty("pwd", "root@123");
		
		p.store(os, null);
		
		//InputStream 

	}

}
