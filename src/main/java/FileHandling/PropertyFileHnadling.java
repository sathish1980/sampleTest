package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileHnadling {

	String filePath = "C:\\Users\\sathishkumar\\eclipse-workspace\\FITASelenium1PMBatch\\Input\\env.properties";

	public void readdata() throws IOException
	{
		File F = new File(filePath);
		FileInputStream fs = new FileInputStream(F);
		Properties p = new Properties();
		p.load(fs);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("age"));
		System.out.println(p.getProperty("dob"));
		p.setProperty("address", "Tambaram");
		System.out.println(p.getProperty("address"));

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyFileHnadling p = new PropertyFileHnadling();
		p.readdata();
	}

}
