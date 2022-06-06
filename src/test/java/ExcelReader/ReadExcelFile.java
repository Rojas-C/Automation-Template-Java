package ExcelReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;
import utils.SeleniumDriver;


public class ReadExcelFile {

    public static HashMap<String, HashMap<String, String>> hm1 = new HashMap<>();
    static String s3;

    /**
     * Reading the excel file
     * @throws IOException
     */
    public static void ReadTestData() throws IOException {
        SeleniumDriver.log.info("Start reading Excel File");
        System.getProperty("user.home");
        String TestDataPath = Constants.excelFile;
        FileInputStream file = new FileInputStream(TestDataPath);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        //Setting name of sheet where the data is.
        XSSFSheet sheet = workbook.getSheet(Constants.sheetName);
        Row HeaderRow = sheet.getRow(0);
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row currentRow = sheet.getRow(i);
            HashMap<String, String> currentHash = new HashMap<String, String>();
            for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {

                Cell currentCell1 = currentRow.getCell(0);
                switch (currentCell1.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        s3 = currentCell1.getStringCellValue();
                        System.out.println(s3);
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        s3 = String.valueOf(currentCell1.getNumericCellValue());
                        System.out.println(s3);
                        break;
                }

                Cell currentCell = currentRow.getCell(j);
                switch (currentCell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        currentHash.put(HeaderRow.getCell(j).getStringCellValue(),
                                currentCell.getStringCellValue());
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        currentHash.put(HeaderRow.getCell(j).getStringCellValue(),
                                String.valueOf(currentCell.getNumericCellValue()));
                        break;
                }

            }
            hm1.put(s3, currentHash);
        }
        SeleniumDriver.log.info("Finish reading Excel File");
    }
}

