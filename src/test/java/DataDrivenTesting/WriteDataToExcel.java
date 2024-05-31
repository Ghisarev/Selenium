package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDataToExcel 
	{
		@Test
		public void dataToexcel() throws EncryptedDocumentException, IOException
		{
			//t0 make connection
			FileInputStream fis=new FileInputStream("C:\\Users\\91902\\Desktop\\Book1.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row=sheet.getRow(0);
			Cell cell=row.createCell(3);
			cell.setCellType(CellType.STRING);
			cell.setCellValue("Vaishnavi");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\91902\\Desktop\\Book1.xlsx");
			wb.write(fos);
			wb.close();
			
			
			
		}

}
