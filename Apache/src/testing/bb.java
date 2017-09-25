package testing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class bb
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		FileOutputStream fs=new FileOutputStream("C:\\Users\\13407\\Downloads\\testdata11.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet s1=wb.getSheet("Sheet1");
		int n=s1.getPhysicalNumberOfRows();
		for(int i=0;i<n;i++)
		{
			XSSFRow r1=s1.getRow(i);
			XSSFCell c1=r1.getCell(0);
			if(c1.CELL_TYPE_STRING==1)
			{
				System.out.println(c1.getStringCellValue());
			}
			else if(c1.getCellType()==0)
			{
				System.out.println(c1.getNumericCellValue());
			}
			else if(c1.getCellType()==4)
			{
				System.out.println(c1.getBooleanCellValue());
			}
		}
		
	}
            
}
