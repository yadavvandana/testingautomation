package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class cc 
{
    public static void main(String[] args) throws IOException
    {
    	File f1=new File("C:\\Users\\13407\\Downloads\\testdata.xlsx");
    	FileInputStream fs=new FileInputStream(f1);
    	XSSFWorkbook wb=new XSSFWorkbook(fs);
    	XSSFSheet s1=wb.getSheet("Sheet1");
    	XSSFRow r1=s1.getRow(0);
        XSSFCell c1=r1.getCell(0);
    	System.out.println(c1);
    	

	}
}
