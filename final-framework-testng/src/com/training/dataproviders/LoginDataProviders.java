package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<LoginBean> list = new ELearningDAO().getLogins(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(LoginBean temp : list){
			Object[]  obj = new Object[2]; 
			obj[0] = temp.getUserName(); 
			obj[1] = temp.getPassword(); 
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
	String fileName ="C:/Users/Naveen/Desktop/Testing.xls"; 
	int sheetno = 0;
	return new ApachePOIExcelRead().getExcelContent(fileName, sheetno); 
		
	}
	
	@DataProvider(name = "excel-inputsRTTC_82")
	public Object[][] getExcelDataRTTC_82()	{  
	String fileName ="C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\onlinePractise\\ExcelData\\TestCaseData.xlsx";
	int sheetno = 0;
	return new ApachePOIExcelRead().getExcelContent(fileName, sheetno);
	
	}
	
	@DataProvider(name = "excel-inputsRTTC_83")
	public Object[][] getExcelDataRTTC_83(){
		
		String fileName ="C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\onlinePractise\\ExcelData\\TestCaseData.xlsx";
	int sheetno = 1;
	return new ApachePOIExcelRead().getExcelContent(fileName, sheetno); 
		
	}
	
	@DataProvider(name = "excel-inputsRTTC_85")
	public Object[][] getExcelDataRTTC_85(){
	String fileName ="C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\onlinePractise\\ExcelData\\TestCaseData.xlsx";
	int sheetno = 2;
	return new ApachePOIExcelRead().getExcelContent(fileName, sheetno); 
		
	}
		
	}
	

