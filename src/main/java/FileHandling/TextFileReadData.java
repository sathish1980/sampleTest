package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReadData {

	String filePath = "C:\\Users\\sathishkumar\\eclipse-workspace\\FITASelenium1PMBatch\\Input\\login.txt";
	public void readdata() throws IOException
	{
		File F = new File(filePath);
		FileInputStream fs = new FileInputStream(F);
		int i;
		while((i=fs.read())!=-1)
		{
			System.out.print((char)i);
		}
	}

	public void readdatafileREader() throws IOException, InterruptedException
	{
		File F = new File(filePath);
		FileReader fs = new FileReader(F);
		int i;
		while((i=fs.read())!=-1)
		{
			System.out.print((char)i);
			Thread.sleep(500);
		}
	}

	public void readdatabufferedreader() throws IOException, InterruptedException
	{
		File F = new File(filePath);
		FileReader fs = new FileReader(F);
		BufferedReader Bs = new BufferedReader(fs);
		String i;
		while((i=Bs.readLine())!=null)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		TextFileReadData T = new TextFileReadData();
		//T.writedata();
	}

}
