package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFilewriteData {

	String filePath = "C:\\Users\\sathishkumar\\eclipse-workspace\\FITASelenium1PMBatch\\Output\\ResultSheet.xlsx";

	String[] course = {"JAva","Python","Testing"};

	public void WriteData() throws IOException
	{
		File F = new File(filePath);
		FileOutputStream fs = new FileOutputStream(F);
		XSSFWorkbook wbk = new XSSFWorkbook();
		Sheet sht = wbk.createSheet("Output");

		for(int i=0;i<course.length;i++)
		{
			Row firstRow = sht.createRow(i);
			Cell firstcolumn =firstRow.createCell(i);
			firstcolumn.setCellValue(course[i]);
		}


		wbk.write(fs);
		fs.close();
		System.out.println("Done");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFilewriteData E = new ExcelFilewriteData();
		E.WriteData();
	}

}
