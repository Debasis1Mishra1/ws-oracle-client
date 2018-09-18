package org.premierintl.mainclient;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.ObjectFactory;
import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.TiebackInput;
import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.TiebackOutput;
import com.oracle.xmlns.apps.projects.billing.workarea.invoice.invoiceservicev2.TiebackOutputResult;


public class PremierIntlUtil {
	
	private PremierIntlUtil(){
		
	}
	public static final PremierIntlUtil INSTANCE = new PremierIntlUtil();
	public List<TiebackInput> readInvoiceFromExcelFile(Workbook workbook) throws IOException {
		List<TiebackInput> tiebackInputList = new ArrayList<TiebackInput>();
	   
	    Sheet firstSheet = workbook.getSheetAt(0);
	    Iterator<Row> iterator = firstSheet.iterator();
	    Row firstRow = iterator.next();
	    DataFormatter objDefaultFormat = new DataFormatter();
	   
	    while (iterator.hasNext()) {
	        Row nextRow = iterator.next();
	        if(!checkIfRowIsEmpty(nextRow)){
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        ObjectFactory objectFactory = new ObjectFactory();
		    TiebackInput tiebackInput = objectFactory.createTiebackInput();
	 
	        while (cellIterator.hasNext()) {
	            Cell nextCell = cellIterator.next();
	           
	            int columnIndex = nextCell.getColumnIndex();
	 
	            switch (columnIndex) {
	            case 0:
	            	tiebackInput.setContractTypeName(objectFactory.createTiebackInputContractTypeName(objDefaultFormat.formatCellValue(nextCell)));
	            	System.out.println(objDefaultFormat.formatCellValue(nextCell));
	                break;
	            case 1:
	            	tiebackInput.setContractNumber(objectFactory.createTiebackInputContractNumber(objDefaultFormat.formatCellValue(nextCell)));
	            	System.out.println(objDefaultFormat.formatCellValue(nextCell));
	                break;
	            case 2:
	            	tiebackInput.setInvoiceNumber(objectFactory.createTiebackInputInvoiceNumber(Long.parseLong(objDefaultFormat.formatCellValue(nextCell))));
	            	System.out.println(objDefaultFormat.formatCellValue(nextCell));
	                break;
	            case 3:
	            	tiebackInput.setInvoiceId(objectFactory.createTiebackInputInvoiceId(Long.parseLong(objDefaultFormat.formatCellValue(nextCell))));
	            	System.out.println(objDefaultFormat.formatCellValue(nextCell));
	                break;
	            case 4:
	            	tiebackInput.setRaInvoiceNumber(objectFactory.createTiebackInputRaInvoiceNumber(objDefaultFormat.formatCellValue(nextCell)));
	            	System.out.println(objDefaultFormat.formatCellValue(nextCell));
	                break;
	            case 5:
	            	tiebackInput.setTransferStatusCode(objectFactory.createTiebackInputTransferStatusCode(objDefaultFormat.formatCellValue(nextCell)));
	            	System.out.println(objDefaultFormat.formatCellValue(nextCell));
	                break;
	            }
	 
	 
	        }
	        tiebackInputList.add(tiebackInput);
	        }
	    }
	 
	    workbook.close();
	    return tiebackInputList;
	}
	
	private boolean checkIfRowIsEmpty(Row row) {
	    if (row == null) {
	        return true;
	    }
	    if (row.getLastCellNum() <= 0) {
	        return true;
	    }
	    for (int cellNum = row.getFirstCellNum(); cellNum < row.getLastCellNum(); cellNum++) {
	        Cell cell = row.getCell(cellNum);
	        if (cell != null && cell.getCellType() != CellType.BLANK && StringUtils.isNotBlank(cell.toString())) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public void writeToExcel(TiebackOutputResult tiebackOutputResult,String filePath) throws IOException{
      
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet responseSheet = workbook.createSheet("Response");
        int rowIndex = 0;
        for(TiebackOutput tieBackOutput : tiebackOutputResult.getValue()){
            Row row = responseSheet.createRow(rowIndex++);
            int cellIndex = 0;
            //first place in row is ContractNumber
            row.createCell(cellIndex++).setCellValue(tieBackOutput.getContractNumber().getValue());

            //second place in row is ResultStatus
            row.createCell(cellIndex++).setCellValue(tieBackOutput.getResultStatus().getValue());

            //third place in row is TransferStatusCode
            row.createCell(cellIndex++).setCellValue(tieBackOutput.getTransferStatusCode().getValue());

            //fourth place in row is MessageData
            row.createCell(cellIndex++).setCellValue(tieBackOutput.getMessageData().getValue());

        }

        //write this workbook in excel file.
        try {
            FileOutputStream fos = new FileOutputStream(new File(filePath));
            workbook.write(fos);
            fos.close();
            workbook.close();
            System.out.println(filePath + " is successfully written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
