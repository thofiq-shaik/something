package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
    public FileInputStream fis;
    public static XSSFWorkbook wb;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    String value;
   

    public String excelRead(int sheetNumber,int rowNumber,int cellNumber) throws FileNotFoundException,IOException{
        fis=new FileInputStream(System.getProperty("user.dir")+"/testdata/data.xlsx");
        wb=new XSSFWorkbook(fis);
        sheet=wb.getSheetAt(sheetNumber);
        row=sheet.getRow(rowNumber);
        cell=row.getCell(cellNumber);
        DataFormatter dfrom=new DataFormatter();
        value=dfrom.formatCellValue(cell);
        return value;
    }
}
