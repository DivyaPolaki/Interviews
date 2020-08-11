package dataDriven;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelPractice {
	//Identify Testcases coloum by scanning the entire 1st row
	//once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
	//after you grab purchase testcase row = pull all the data of that row and feed into test

	public ArrayList<String> datadrivenpractice(String testcaseName) throws IOException  {
		ArrayList<String> strn=new ArrayList<String>();
	FileInputStream fis=new FileInputStream("C://Users//Phani//Documents//Demodata.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	int sheets=wb.getNumberOfSheets();
	for (int i = 0; i < sheets; i++) {
		if (wb.getSheetName(i).equalsIgnoreCase("Testdata")) {
		
		
		XSSFSheet sheet= wb.getSheetAt(i);
		//iterate the rows in the sheet
		Iterator<Row> rows=sheet.iterator();//sheet is collection of rows
		Row firstrow=rows.next();
		//Iterate cells in a row
		Iterator<Cell> cells=firstrow.cellIterator();//row is collection of cells
		int k = 0;
		int column=0;
		while (cells.hasNext()) {
			Cell value=cells.next();
			
			if (value.getStringCellValue().equalsIgnoreCase("Testcase"))
				//get the column number
			{
			column=k;
		
			}
			k++;
			
			}
		System.out.println(column);
		//once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
		while (rows.hasNext()) {
		Row r=rows.next();
			if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
			////after you grab purchase testcase row = pull all the data of that row and feed into test
				Iterator<Cell> cv=r.cellIterator();
				while (cv.hasNext()) {
					Cell c=cv.next();
					if (c.getCellTypeEnum()==CellType.STRING) {
						strn.add(c.getStringCellValue());
					}
					else{
						strn.add(NumberToTextConverter.toText(c.getNumericCellValue()));
					}
					
				
				}
				System.out.println(strn);
				
			}
		}

		}
		}
	return strn;
	
	}
	}

