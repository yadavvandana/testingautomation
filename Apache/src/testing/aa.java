package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class aa
{
	public static void main(String[] args) throws IOException  
	{
		File f1=new File("C:\\Users\\13407\\Downloads\\testdata.xlsx");
		FileInputStream fs=new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet s1=wb.getSheet("Sheet1");
		int r=s1.getPhysicalNumberOfRows();
		for(int i=0;i<r;i++)
		{
			XSSFRow r1=s1.getRow(i);
		int c=  r1.getPhysicalNumberOfCells();
		for(int j=0;j<c;j++)
		{
			XSSFCell x1=r1.getCell(j);
			System.out.println(x1.getStringCellValue());
		}
		}
	     
	}
	
	

}
