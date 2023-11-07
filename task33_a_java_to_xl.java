package TASK;
import  java.io.*;  
import  org.apache.poi.hssf.usermodel.HSSFSheet;  
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import  org.apache.poi.hssf.usermodel.HSSFRow;  
public class task33_a_java_to_xl  
{  
public static void main(String[]args)   
{  
try   
	{  
	String filename = "C:\\Users\\MSI 1\\eclipse-workspace\\MCA_JAVA\\src\\java_to_exl.xlsx";  
	//creating an instance of HSSFWorkbook class  
	HSSFWorkbook workbook = new HSSFWorkbook();  
	//invoking creatSheet() method and passing the name of the sheet to be created   
	HSSFSheet sheet = workbook.createSheet("task33");   
	//creating the 0th row using the createRow() method  
	HSSFRow rowhead = sheet.createRow((short)0);  
//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
rowhead.createCell(0).setCellValue("S.No.");  
rowhead.createCell(1).setCellValue("Customer Name");  
rowhead.createCell(2).setCellValue("Account Number");  
rowhead.createCell(3).setCellValue("e-mail");  
rowhead.createCell(4).setCellValue("Balance");   
	HSSFRow row = sheet.createRow((short)1);  
//inserting data in the first row  
row.createCell(0).setCellValue("1");  
row.createCell(1).setCellValue("ravoker");  
row.createCell(2).setCellValue("9999999");  
row.createCell(3).setCellValue("RAVO@gmail.com");  
row.createCell(4).setCellValue("700000.00");    
	HSSFRow row1 = sheet.createRow((short)2);  
//inserting data in the second row  
row1.createCell(0).setCellValue("2");  
row1.createCell(1).setCellValue("SHRIDHAR");  
row1.createCell(2).setCellValue("22222222");  
row1.createCell(3).setCellValue("SHRIDHAR@gmail.com");  
row1.createCell(4).setCellValue("200000.00");  
FileOutputStream fileOut = new FileOutputStream(filename);  
workbook.write(fileOut);  
//closing 
fileOut.close();  
workbook.close();    
	System.out.println("Excel file has been generated successfully.");  
}   
catch (Exception e)   
{  
	e.printStackTrace();  
}  }  }  