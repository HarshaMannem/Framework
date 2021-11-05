package com.elocalshops.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriver {
	public static XSSFSheet sheet;
	public static XSSFWorkbook workbook;

	public static void WorkBookSetup() throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\HARSHA\\MINDTREE\\Forms\\testData.xlsx");
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheetAt(0);	
	}
	public static String UserName()
	{   

		String  username=sheet.getRow(1).getCell(1).getStringCellValue();

		return username;	
	}

	public static String password()
	{
		String pass=sheet.getRow(3).getCell(1).getStringCellValue();	
		return pass;
	}
	public static String Email()
	{
		String email=sheet.getRow(1).getCell(1).getStringCellValue();
		return email;
	}

	public static String mobile_number()
	{
		double num=sheet.getRow(2).getCell(1).getNumericCellValue();
		String number=String.valueOf(num);  
		return number;
	}

}
