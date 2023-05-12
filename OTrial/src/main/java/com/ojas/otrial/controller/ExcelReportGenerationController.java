package com.ojas.otrial.controller;



import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.otrial.services.ExcelReportGenerationService;
import com.ojas.otrial.services.ExcellReportGeneratioServicesDate;

@RestController
public class ExcelReportGenerationController {
    @Autowired
    ExcelReportGenerationService excelReportGenerationService;
    @Autowired
    ExcellReportGeneratioServicesDate excellReportGeneratioServicesDate;
    @GetMapping("/excelReportGeneration")
    public void excelReportGeneration(HttpServletResponse response) throws IOException {
        excelReportGenerationService.downloadTemplate(response);
    }
    
    @GetMapping("/excelReportGenerationday")
    public void excelReportGenerationdate(HttpServletResponse response)throws IOException{
    	
    	excellReportGeneratioServicesDate.downloadTemplate(response);
    	
//    	LocalDate start = YearMonth.now().atDay(1); LocalDate end = YearMonth.now().atEndOfMonth(); OR: LocalDate startDay = Year.of(2020).atMonth(11).atDay(1); LocalDate endDay = Year.of(2020).atMonth(11).atEndOfMonth(); – 
//    	Wedson Quintanilha da Silva
//    	 Nov 17, 2020 at 16:59
    	
//    	LocalDate today = LocalDate.now();
//
//    	DayOfWeek dayOfWeek = today.getDayOfWeek();
//
//    	System.out.println("Day of the Week :: " + dayOfWeek);
//    	System.out.println("Day of the Week - in Number :: "
//    	    + dayOfWeek.getValue());
//    	System.out.println("Day of the Week - Formatted FULL :: "
//    	    + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()));
//    	System.out.println("Day of the Week - Formatted SHORT :: "
//    	    + dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
    	
//    	LocalDate start = YearMonth.now().atDay(1);
//    	LocalDate end = YearMonth.now().atEndOfMonth(); 
//    	
//    	System.out.println(start);
//    	System.out.println(end);
//    	
//    	
//    	
//    	
//    	for(int i=start.getDayOfMonth();i<=end.getDayOfMonth();i++) {
//    		LocalDate start1 = YearMonth.now().atDay(i);
//    		System.out.print(start1);
//    		DayOfWeek dayOfWeek = start1.getDayOfWeek();
//    		System.out.print(dayOfWeek);
//    		System.out.print("BALA BALA "+i);
//    		System.out.println("--");
//    		
//    	}
//    	
    	
    	
        
    	
    }
    
    
}
