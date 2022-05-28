package com.apachepoiapi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
//readdata from excel so v use fis and getrows() and getcell(col).getstringvalue()
//getcountof testcase v use obj.getlastrownum()
//create data in excel fis and fos and cell.setcellvalue("value") then write() n close() it will save n close sheet
public class readexceldata {
@Test            
public void Readexceldata() throws EncryptedDocumentException,IOException{
String filepath="C:\\Users\\LOKESH\\OneDrive\\Desktop\\Book1.xlsx";  //locate the file
FileInputStream fis=new FileInputStream(filepath);
Workbook wb=WorkbookFactory.create(fis);                             //locate the workbook
Sheet sh=wb.getSheet("Sheet1");                                      //locate the sheet
Row rw=sh.getRow(1);
String Username=rw.getCell(1).getStringCellValue();
String Password=rw.getCell(2).getStringCellValue();
System.out.println(Username);
System.out.println(Password);
}
@Test
public void getcountoftestcase() throws EncryptedDocumentException,IOException {
	String filepath="C:\\Users\\LOKESH\\OneDrive\\Desktop\\Book1.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	int rowcount=sh.getLastRowNum();
	System.out.println("total no of testcases"+rowcount);
}
@Test
public void createData() throws EncryptedDocumentException,IOException{
String filepath="C:\\Users\\LOKESH\\OneDrive\\Desktop\\Book1.xlsx";
FileInputStream fis=new FileInputStream(filepath);
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet("Sheet1");
Row rw=sh.getRow(3);
 Cell cell=rw.createCell(2);
cell.setCellType(CellType.STRING);
FileOutputStream fos=new FileOutputStream(filepath);
cell.setCellValue("TestDemo2");
wb.write(fos);
wb.close();
}
}