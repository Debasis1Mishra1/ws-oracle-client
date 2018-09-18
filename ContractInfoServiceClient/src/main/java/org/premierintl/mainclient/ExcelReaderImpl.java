package org.premierintl.mainclient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderImpl implements ExcelReaderI {

	public Workbook getWorkBookFromInputStream(InputStream inputStream, String extension) throws IOException {
		Workbook workbook = null;
		 
	    if (extension.equalsIgnoreCase(Constants.EXTENSION_XLSX)) {
	        workbook = new XSSFWorkbook(inputStream);
	    } else if (extension.equalsIgnoreCase(Constants.EXTENSION_XLS)) {
	        workbook = new HSSFWorkbook(inputStream);
	    } else {
	        throw new IllegalArgumentException("The specified file is not Excel file");
	    }
	    inputStream.close();
	    return workbook;
		
	}

	public InputStream getInputStreamFromPath(String filePath) throws FileNotFoundException {
		FileInputStream inputStream = new FileInputStream(new File(filePath));
		return inputStream;
	}

}
