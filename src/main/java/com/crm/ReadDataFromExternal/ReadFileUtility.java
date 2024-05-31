package com.crm.ReadDataFromExternal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.listenercode.BaseClass;

public class ReadFileUtility extends BaseClass
	{
		public static String property(String key) throws IOException
		{
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream("./config/dwsfile.properties");
			prop.load(fis);
			String data=prop.getProperty(key);
			return data;
		}
		public static String excel(String s,int row,int cell) throws EncryptedDocumentException, IOException
		{
			File path=new File("C:\\Users\\91902\\Desktop\\dws1.xlsx");
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sheet=wb.getSheet(s);
			String data = sheet.getRow(row).getCell(cell).toString();
			return data;
			
		}
}
