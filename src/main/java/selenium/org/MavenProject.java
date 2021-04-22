package selenium.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hpsf.MarkUnsupportedException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenProject {
public static void main(String[] args) throws IOException {
File f =new File ("E:\\New java files\\Project1\\Input\\Book1.xls");
FileInputStream fi = new FileInputStream(f);
Workbook wk = new HSSFWorkbook(fi);
Sheet sheet = wk.getSheet("sheet1");
Row row = sheet.getRow(0);
Cell cell = row.getCell(0);
System.out.println(cell);
int type = cell.getCellType();
System.out.println(type);
if(type==0 ) {
	DateUtil.isCellDateFormatted(cell);
	Date date = cell.getDateCellValue();
	System.out.println(date);
	SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
	String format = sm.format(date);
	System.out.println(format);
}else{
double d = cell.getNumericCellValue();
long l = (long) d;
 String valueOf = String.valueOf(l);
System.out.println(valueOf);
}
}
}












