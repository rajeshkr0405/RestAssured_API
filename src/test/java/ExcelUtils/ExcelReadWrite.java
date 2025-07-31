package ExcelUtils;

import Data.DataForTest;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelReadWrite {
    static XSSFWorkbook workbook;
    static  XSSFSheet sheet;

    public ExcelReadWrite(String excelPath , String sheetName){
        try {

         workbook= new XSSFWorkbook(excelPath);
         sheet = workbook.getSheet("sheet1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
            //throw new RuntimeException(e);
        }
    }
    public static void main(String[] agrs){
        getRowCount();
        getcelldata();
    }

    private static void getcelldata() {
    }

    public static int getRowCount(){
        //String projectPath= System.getProperty("user.dir");
            /*XSSFWorkbook workbook= new XSSFWorkbook(excelPath);
            XSSFSheet sheet = workbook.getSheet("sheet1");*/
            int rowcount = sheet.getPhysicalNumberOfRows();
            System.out.println("numbers of rows : "+rowcount);
            return rowcount;

    }

    public static void getcelldata(int rowNum, int colNum) {
        //String cellvalues = sheet.getRow(1).getCell(1).getStringCellValue();
        DataFormatter formatter = new DataFormatter();
        Object values = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
        System.out.println("cell values are :" + values);

    }
}
