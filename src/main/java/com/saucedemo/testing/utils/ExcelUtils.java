package com.saucedemo.testing.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFRow row;
    private static XSSFCell cell;

    public void setExcelFile(String excelFilePath,String sheetName) throws IOException {
        //Crear un objeto de la clase File para abrir el archivo excel
        File file =    new File(excelFilePath);

        //Crear un objeto de FileInputStream para leer el excel
        FileInputStream inputStream = new FileInputStream(file);

        //Crear una instancia workbook que refiere al archivo excel
        workbook=new XSSFWorkbook(inputStream);

        //Crear un objeto sheet
        sheet=workbook.getSheet(sheetName);

    }

    public String getCellData(int rowNumber,int cellNumber){
        //Obtener el valor de la colunmna, desde la numero de fila y numero de columna
        cell =sheet.getRow(rowNumber).getCell(cellNumber);

        //Retornar el valor de la celda como String
        return cell.getStringCellValue();
    }

}
