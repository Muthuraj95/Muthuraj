package selenium.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Project2 {
public static void main(String[] args) throws IOException, InterruptedException {
	File f = new File ("E:\\New java files\\Project1\\Input\\Book1.xls");
	FileInputStream fi = new FileInputStream(f);
	Workbook w = new HSSFWorkbook(fi);
	Sheet sheet = w.createSheet("StudentDetails1");
	Row row = sheet.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue("S.No");
	Thread.sleep(2000);
	Row row4 = sheet.createRow(0);
	Cell cell4 = row4.createCell(1);
	cell4.setCellValue("Student Name");
	Row row2 = sheet.createRow(0);
	Cell cell2 = row2.createCell(2);
	cell2.setCellValue("Mark1");
	Row row3 = sheet.createRow(0);
	Cell cell3 = row3.createCell(3);
	cell3.setCellValue("Mark2");
	Row row5 = sheet.createRow(1);
	Cell cell5 = row5.createCell(0);
	cell5.setCellValue("1");
	Row row6 = sheet.createRow(1);
	Cell cell6 = row6.createCell(1);
	cell6.setCellValue("Mahesh");
	Row row7 = sheet.createRow(1);
	Cell cell7 = row7.createCell(2);
	cell7.setCellValue("1");
	Row row8 = sheet.createRow(1);
	Cell cell8 = row8.createCell(3);
	cell8.setCellValue("2");
	String value = cell8.getStringCellValue();
//	if (value.equalsIgnoreCase("98")) {
//		cell8.setCellValue("100");
//		System.out.println("Data Created");
//	}
	FileOutputStream fo =new FileOutputStream(f);
	w.write(fo);
	System.out.println("saved");
	}
	
	
	
}

