package com.ojas.ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FlieReadIntoXcell {

	public static void main(String[] args) throws IOException {
		// xfile data read into a java program
		//if you want to read the file you should be follewd by fileInputStream
		
		FileInputStream file = new FileInputStream("C:\\Users\\su22034\\Downloads");
		//create open workbook in xcell sheet
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//get  sheet in a workbook 
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		//get lastRownumber in a sheet
		int lastRowNum = sheet.getLastRowNum();
		
		//get a lastcolumn number in a each row
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		
		
		for(int i=0;i<lastRowNum;i++) {
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<lastCellNum;j++) {
				
				String value = row.getCell(j).toString();
				System.out.println(" "+value);
			}
		}
		System.out.println("");
		
		

	}

}
