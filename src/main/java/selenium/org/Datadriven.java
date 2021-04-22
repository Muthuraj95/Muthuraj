package selenium.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Datadriven {
public static void main(String[] args) throws Throwable {
	File f = new File ("E:\\New java files\\Project1\\Input\\Book1.xls");
	FileInputStream fi = new FileInputStream(f);
	Workbook w = new HSSFWorkbook(fi);
	Sheet sheet = w.getSheet("sheet1");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(0);
	System.out.println(cell);
	Row row1 = sheet.getRow(0);
	Cell cell1 = row1.getCell(1);
	System.out.println(cell1);
	Row row2 = sheet.getRow(0);
	Cell cell2 = row2.getCell(2);
	System.out.println(cell2);
	int rows = sheet.getPhysicalNumberOfRows();
	System.out.println(rows);
	int cells = row.getPhysicalNumberOfCells();
	System.out.println(cells);
	for (int i = 0; i <rows; i++) {
		Row row3 = sheet.getRow(i);
		System.out.println(row3);
		for (int j = 0; j <cells; j++) {
			Cell cell3 = row.getCell(j);
			System.out.println(cell3);
	}
	FileOutputStream fo = new FileOutputStream(f);
	w.write(fo);
	
	System.out.println("ok");

	
	
	
}
}}
