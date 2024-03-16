package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TextFileWriteData {

	String infilePath = "C:\\Users\\sathishkumar\\eclipse-workspace\\FITASelenium1PMBatch\\Input\\login.txt";

	String filePath = "C:\\Users\\sathishkumar\\eclipse-workspace\\FITASelenium1PMBatch\\Output\\result.txt";
	String name = "Sathish kumar r";

	public void writedata() throws IOException
	{
		File F = new File(filePath);
		FileOutputStream fs = new FileOutputStream(F);
		fs.write(name.getBytes());
		fs.close();

		System.out.println("Done");
	}

	public void writedataFileWrite() throws IOException
	{
		File F = new File(filePath);
		FileWriter fs = new FileWriter(F);
		fs.write(name);
		fs.close();

		System.out.println("Done");
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

	public void readandWrite() throws IOException, InterruptedException
	{
		File IF = new File(infilePath);
		File OF = new File(filePath);
		FileReader Ifs = new FileReader(IF);
		FileWriter FW = new FileWriter(OF);
		BufferedReader Bs = new BufferedReader(Ifs);
		String i;
		while((i=Bs.readLine())!=null)
		{
			FW.write(i);
			FW.write("\n");
		}
		FW.close();
		Ifs.close();
		System.out.println("Done");
	}

	public void copyAndPaste() throws IOException
	{
		File sourceFile = new File(infilePath);
		File destinationFile = new File(filePath);
		FileUtils.copyFile(sourceFile, destinationFile);

		System.out.println("Done");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		TextFileWriteData T = new TextFileWriteData();
		T.copyAndPaste();
	}

}
