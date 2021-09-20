package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static void getRowCount() {
		try {
			String excelpath="./data/TestData.xlsx";
			XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println(rowCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void getCellData() {
		try {
			String excelpath="./data/TestData.xlsx";
			XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
			String val=sheet.getRow(1).getCell(0).getStringCellValue();
		    System.out.println(val);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		getRowCount();
		getCellData();
	}



}
