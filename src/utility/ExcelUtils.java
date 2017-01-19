package utility;
            import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
    public class ExcelUtils {
                private static XSSFSheet ExcelWSheet;
                private static XSSFWorkbook ExcelWBook;
                private static XSSFCell Cell;
                private static XSSFRow Row;
           
            public static void setExcelFile(String Path,String SheetName) throws Exception {
                   try {
           
                    FileInputStream ExcelFile = new FileInputStream(Path);
           
                    ExcelWBook = new XSSFWorkbook(ExcelFile);
                    ExcelWSheet = ExcelWBook.getSheet(SheetName);
                    Log.info("Excel sheet opened");
                    } catch (Exception e){
                        throw (e);
                    }
            }
           
            public static String getCellData(int RowNum, int ColNum) throws Exception{
                   try{
                	  Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
                      String CellData = Cell.getStringCellValue();
                      System.out.println("cell data>>>>>>>>>>>>>>>>>>> "+CellData);
                      return CellData;
                      
                      }catch (Exception e){
                        return"";
                      }
            }
           
            @SuppressWarnings("static-access")
			public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception    {
                   try{
                      Row  = ExcelWSheet.getRow(RowNum);
                    Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
                    if (Cell == null) {
                        Cell = Row.createCell(ColNum);
                        Cell.setCellValue(Result);
                        } else {
                            Cell.setCellValue(Result);
                        }
          
                          FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
                          ExcelWBook.write(fileOut);
                          fileOut.flush();
                        fileOut.close();
                        }catch(Exception e){
                            throw (e);
                    }
                }
            
            
            
			public static void setCellCole(int RowNum, int ColNum) throws Exception    {
				  
				 try{
					 
					    
               	  Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
                     String CellData = Cell.getStringCellValue();
                     System.out.println("cell data>>>>>>>>>>>>>>>>>>> "+CellData);
                     CellStyle style = ExcelWBook.createCellStyle();
          		   // style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
          		    
                    // Row  = ExcelWSheet.getRow(RowNum);
                    // Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
                     
          		    int i = 1,j;
          		    
          		    if(CellData.equals("editable"))
          		    	i++;
          		     switch (i) {
          	         case 1: style.setFillPattern(CellStyle.SOLID_FOREGROUND);
          	         		Font font = ExcelWBook.createFont();
          	               font.setColor(IndexedColors.WHITE.getIndex());
          	               style.setFont(font);
          	        	 
          	           		break;
          	         case 2:  style.setFillPattern(CellStyle.SOLID_FOREGROUND);
          	         			Font font1 = ExcelWBook.createFont();
          	         			font1.setColor(IndexedColors.BLUE.getIndex());
          	         			style.setFont(font1);
          	         			break;
          	         case 3:  style.setFillPattern(CellStyle.SOLID_FOREGROUND);
          	         			Font font2 = ExcelWBook.createFont();
          	         				font2.setColor(IndexedColors.YELLOW.getIndex());
          	         					style.setFont(font2);
          	         					break;
          	         					
          	         case 4:  style.setFillPattern(CellStyle.SOLID_FOREGROUND);
	         			Font font3 = ExcelWBook.createFont();
	         				font3.setColor(IndexedColors.RED.getIndex());
	         					style.setFont(font3);
	         					break;
          		     }	
          		     
          		     Cell.setCellStyle(style);
                       FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
                       System.out.println("file path from colour "+Constant.Path_TestData);
                       
                       ExcelWBook.write(fileOut);
                       fileOut.flush();
                       fileOut.close();
                     }
		     catch (Exception e){
                 
             }
		
                 
             }
			
			
            public static void closeexcel()
            {
            	
            	 FileOutputStream fileOut;
				try {
					fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
					 ExcelWBook.write(fileOut);
	                 fileOut.flush();
	               fileOut.close();
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
					System.out.println("error catch in excel close");
				}
                
            }
            
        	public static int getRowContains(String sTestCaseName, int colNum) throws Exception{
        		int i;
        		try {
        			int rowCount = ExcelUtils.getRowUsed();
        			for ( i=0 ; i<rowCount; i++){
        				if  (ExcelUtils.getCellData(i,colNum).equalsIgnoreCase(sTestCaseName)){
        					break;
        				}
        			}
        			return i;
        				}catch (Exception e){
        			Log.error("Class ExcelUtil | Method getRowContains | Exception desc : " + e.getMessage());
        			throw(e);
        			}
        		}
        	
        	public static int getRowUsed() throws Exception {
        		try{
        			int RowCount = ExcelWSheet.getLastRowNum();
        			Log.info("Total number of Row used return as < " + RowCount + " >.");		
        			return RowCount;
        		}catch (Exception e){
        			Log.error("Class ExcelUtil | Method getRowUsed | Exception desc : "+e.getMessage());
        			System.out.println(e.getMessage());
        			throw (e);
        		}

        	}
    }