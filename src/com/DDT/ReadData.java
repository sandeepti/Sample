package com.DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	//HSSFWorkbook wb;
	//HSSFSheet sheet;
	
	HSSFWorkbook wb;
	HSSFSheet sheet;
	
	public ReadData(String Excelurl)
	{
		try {
			File fs = new File(Excelurl);
			FileInputStream fis = new FileInputStream(fs);
			wb = new HSSFWorkbook(fis);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
		  System.out.println(e.getMessage());
		}
		
	
		}
	
	public String Excelconfig(int sheetnumber,int row,int col)
	{
	    sheet = wb.getSheetAt(sheetnumber);
	    String data0= sheet.getRow(row).getCell(col).getStringCellValue();
	    return data0;
	    
	}
	
	

}
