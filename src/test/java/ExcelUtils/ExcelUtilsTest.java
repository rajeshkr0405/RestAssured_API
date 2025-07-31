package ExcelUtils;

public class ExcelUtilsTest {
public static void main(String[] agrs){
    String excelPath = "./Data/Test_Dat.xlsx";
    String sheetName = "sheet1";

    ExcelReadWrite excel =  new ExcelReadWrite(excelPath,sheetName);
    int rowcount= excel.getRowCount();
    for(int rowNum=1; rowNum<rowcount; rowNum++)
    {
        for(int colNum=0; colNum<=1; colNum++){
        excel.getcelldata(rowNum,colNum);
    }}


}
}
