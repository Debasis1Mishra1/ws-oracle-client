package org.premierintl.mainclient;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Workbook;

public interface ExcelReaderI {
	
	Workbook getWorkBookFromInputStream(InputStream inputStream, String extension) throws IOException;
	InputStream getInputStreamFromPath(String filePath) throws FileNotFoundException;
	
}
