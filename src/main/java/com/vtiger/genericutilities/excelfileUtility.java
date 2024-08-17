package com.vtiger.genericutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelfileUtility {
public String readDataFromExcel(String sheetname,int rownum,int cellnum) throws Throwable {
	FileInputStream fs=new FileInputStream(Iconstantpaths.excelfilepath);
	Workbook w = WorkbookFactory.create(fs);
	return w.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
}
}
