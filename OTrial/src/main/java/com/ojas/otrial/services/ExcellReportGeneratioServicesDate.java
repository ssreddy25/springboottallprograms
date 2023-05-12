package com.ojas.otrial.services;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

@Service
public class ExcellReportGeneratioServicesDate {

	public void downloadTemplate(HttpServletResponse response) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();

		// First Sheet
		XSSFSheet sheet1 = workbook.createSheet("Ravi");
		writeHeaderLine(sheet1);

		// Write the workbook to a file

		// Create Second sheet
		XSSFSheet sheet2 = workbook.createSheet("Siva");
		writeHeaderLine(sheet2);

		// Create third sheet
		XSSFSheet sheet3 = workbook.createSheet("Rithu");
		writeHeaderLine(sheet3);

		ByteArrayOutputStream outByteStream = new ByteArrayOutputStream();
		workbook.write(outByteStream);

		byte[] outArray = outByteStream.toByteArray();
		response.setContentType("application/ms-excel");
		response.setContentLength(outArray.length);
		response.setHeader("Expires:", "0"); // eliminates browser
		// caching
		response.setHeader("Content-Disposition", "attachment; filename=CustomerDetails.xlsx");
		OutputStream outStream = response.getOutputStream();
		outStream.write(outArray);
		outStream.flush();

	}


	private void writeHeaderLine(XSSFSheet sheet) {

		// first row
		Row firstRow = sheet.createRow(0);



		Cell reportId = firstRow.createCell(10);
		reportId.setCellValue("Report Id");

		Cell reportValue = firstRow.createCell(11);
		reportValue.setCellValue("1111122223333");

		// second row

		Row secondRow = sheet.createRow(1);
		Cell date = secondRow.createCell(10);
		date.setCellValue("Date");

		Cell dateValue = secondRow.createCell(11);
		dateValue.setCellValue(String.valueOf(LocalDate.now()));

		sheet.addMergedRegion(new CellRangeAddress(2, 2, 0, 11));
		Row row = sheet.getRow(2);
		if (row == null) {
			row = sheet.createRow(2);
		}

		Cell cell = row.createCell(0);
		cell.setCellValue("Ojas Time Sheet");

		CellStyle style = sheet.getWorkbook().createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);
		style.setVerticalAlignment(VerticalAlignment.CENTER);
		style.setFillForegroundColor(IndexedColors.BLUE.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		Font font = sheet.getWorkbook().createFont();
		font.setColor(IndexedColors.WHITE.getIndex());
		font.setBold(true);
		font.setFontHeightInPoints((short) 17);
		style.setFont(font);
		cell.setCellStyle(style);

		// Header columns

		Row headerRow = sheet.createRow(3);

		Cell headerCell = headerRow.createCell(0);
		headerCell.setCellValue("CurrentMonthDates");

		CellStyle style1 = sheet.getWorkbook().createCellStyle();
		Font font1 = sheet.getWorkbook().createFont();
		font1.setColor(IndexedColors.BLUE.getIndex());
		font1.setBold(true);
		font1.setFontHeightInPoints((short) 12);
		style1.setFont(font1);
		headerCell.setCellStyle(style1);

		headerCell = headerRow.createCell(1);
		headerCell.setCellValue("Day-type");

		CellStyle style2 = sheet.getWorkbook().createCellStyle();
		Font font2 = sheet.getWorkbook().createFont();
		font2.setColor(IndexedColors.BLUE.getIndex());
		font2.setBold(true);
		font2.setFontHeightInPoints((short) 12);
		style2.setFont(font2);
		headerCell.setCellStyle(style2);

		headerCell = headerRow.createCell(2);
		headerCell.setCellValue("Description");
		CellStyle style3 = sheet.getWorkbook().createCellStyle();
		Font font3 = sheet.getWorkbook().createFont();
		font3.setColor(IndexedColors.BLUE.getIndex());
		font3.setBold(true);
		font3.setFontHeightInPoints((short) 12);
		style3.setFont(font3);
		headerCell.setCellStyle(style3);


		
		LocalDate start = YearMonth.now().atDay(1);
    	LocalDate end = YearMonth.now().atEndOfMonth(); 
    	
    	System.out.println(start);
    	System.out.println(end);
    	
    //values	
    	
    	
    	for(int i=start.getDayOfMonth();i<=end.getDayOfMonth();i++) {
    		LocalDate start1 = YearMonth.now().atDay(i);
//    		System.out.print(start1);
    		DayOfWeek dayOfWeek = start1.getDayOfWeek();
//    		System.out.print(dayOfWeek);
//    		System.out.print("BALA BALA "+i);
//    		System.out.println("--");
    		
    		Row row4 = sheet.createRow(i+3);

    		Cell headerCell2 = row4.createCell(0);
    		headerCell2.setCellValue(""+start1);
    		headerCell2 = row4.createCell(1);
    		headerCell2.setCellValue(""+dayOfWeek);
    		headerCell2 = row4.createCell(2);
    		headerCell2.setCellValue("BALA BALA "+i);
    		
    		
    	}
    	



	}
	
}
