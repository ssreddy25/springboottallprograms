package com.ojas.reactive.services;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.ojas.reactive.entity.Student;


@Service
public class StudentServices {

	
	@Autowired
	private JavaMailSender javaMailSender;
	@Autowired
	private MailProperties mailProperties;
	
	

	
	
//	List<Student> findAll = studentRepository.findAll();

	public byte[] generateExcel(List<Student> student) throws IOException {
		student.forEach(System.out::println);
		// create a new workbook
		Workbook workbook = new XSSFWorkbook();
		// First Sheet // create a new sheet

		Sheet createSheet = workbook.createSheet("studentdata");
		

		// first row

		Row firstRow1 = createSheet.createRow(1);

		Cell cell=firstRow1.createCell(2);
		cell.setCellValue("student data");
		
//crete a color for head elements
//		CellStyle style = createSheet.getWorkbook().createCellStyle();
//		style.setAlignment(HorizontalAlignment.CENTER);
//		style.setVerticalAlignment(VerticalAlignment.CENTER);
//		style.setFillForegroundColor(IndexedColors.BLUE.getIndex());
//		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//
//		Font font = createSheet.getWorkbook().createFont();
//		font.setColor(IndexedColors.WHITE.getIndex());
//		font.setBold(true);
//		font.setFontHeightInPoints((short) 17);
//		style.setFont(font);
//		cell.setCellStyle(style);
		
		// create cells in rwo in the cells
		Row firstRow = createSheet.createRow(3);
		
		firstRow.createCell(0).setCellValue("id");
		firstRow.createCell(1).setCellValue("name");
		firstRow.createCell(2).setCellValue("lastname");
		firstRow.createCell(3).setCellValue("marks");
		firstRow.createCell(4).setCellValue("coures");
		firstRow.createCell(4).setCellValue("status");

		// call the data to in the data base
		
		int number = 5;
		for (Student stude : student) {

			Row row4 = createSheet.createRow(number++);
			System.out.println(number);

			row4.createCell(0).setCellValue(stude.getId());
			row4.createCell(1).setCellValue(stude.getName());
			row4.createCell(2).setCellValue(stude.getLastName());
			row4.createCell(3).setCellValue(stude.getMarks());
			row4.createCell(4).setCellValue(stude.getCoures());
			row4.createCell(4).setCellValue(stude.getStatus());

		}

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		workbook.write(outputStream);
		byte[] bytes = outputStream.toByteArray();
		outputStream.close();
		return bytes;

	}
	
	
	public void sendtheMail(List<Student> stu) throws IOException, MessagingException {
		byte[] generateExcel = generateExcel(stu);
		String[] listEmails = { "manmadharao94@gmail.com", "umasr25@gmail.com", "sivasankarreddyuppaluru@gmail.com" };

		System.out.println("mail send every 10 seconds");

		String recepientEmail = "manmadharao94@gmail.com";
		String subject = "subjectilove";
		String body = " your are selected the tcs company all the best";
		String fromemail = mailProperties.getUsername();
		

			MimeMessage mimeMessage = javaMailSender.createMimeMessage();

			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

			try {
				helper.setSubject(subject);
				helper.setText(body, true);
				helper.setFrom(fromemail);
				helper.setTo(recepientEmail);

				helper.setCc(listEmails);
				helper.addAttachment("student.xlsx", new ByteArrayResource(generateExcel) );
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			javaMailSender.send(mimeMessage);
		
		
	}

}
