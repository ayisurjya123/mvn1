package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellLibrary implements Autoconstant
{
	public static String getcellvalue(String sheet, int row, int cell) throws IOException
	{
		FileInputStream fsi=new FileInputStream(excel_path);
		XSSFWorkbook workbook=new XSSFWorkbook(fsi);
		String cellvalue=workbook.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
	}

}
