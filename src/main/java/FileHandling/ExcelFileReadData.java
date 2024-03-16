package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReadData {

	String filePath = "C:\\Users\\sathishkumar\\eclipse-workspace\\FITASelenium1PMBatch\\Input\\Students.xlsx";

	public void ReadData() throws IOException
	{
		File F = new File(filePath);
		FileInputStream fs = new FileInputStream(F);
		XSSFWorkbook wbk = new XSSFWorkbook(fs);
		Sheet sht = wbk.getSheet("Details");
		int totalRows = sht.getPhysicalNumberOfRows();
		for(int i=0;i<totalRows;i++)
		{
			Row eachRow = sht.getRow(i);
			int totalColumn = eachRow.getLastCellNum();
			for(int j=0;j<totalColumn;j++)
			{
				Cell eachCell = eachRow.getCell(j);
				System.out.print(eachCell.getStringCellValue());
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFileReadData E = new ExcelFileReadData();
		E.ReadData();
	}

}
