package selenium.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Datadriven1 {
	public static String getData(int row , int cell) throws IOException {
	File f = new File ("E:\\New java files\\Project1\\Input\\Book1.xls");
	FileInputStream fi = new FileInputStream(f);
	Workbook w = new HSSFWorkbook(fi);
	Sheet sheet = w.getSheet("sheet1");
	Row row2 = sheet.getRow(row);
	Cell cell2= row2.getCell(cell);
	String cellValue = null;
	int type = cell2.getCellType();
	if (type==1) {
		cellValue = cell2.getStringCellValue();
		System.out.println(cellValue);
	}	else if(type == 0) { 
		if(DateUtil.isCellDateFormatted(cell2)){
		Date value = cell2.getDateCellValue();
		System.out.println(value);
		SimpleDateFormat sm  =new SimpleDateFormat("MM/dd/yyyy");
		cellValue = sm.format(value);
		System.out.println(cellValue);
		}else {
			double d = cell2.getNumericCellValue();
			long l =(long) d;
			 cellValue = String.valueOf(l);
			System.out.println(cellValue);
		
		
		}}
	
	return cellValue;
}}