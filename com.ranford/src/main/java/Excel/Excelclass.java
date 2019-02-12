package Excel;

import java.io.File;


import TestBase.Base;
import jxl.Sheet;
import jxl.Workbook;


public class Excelclass extends Base {
	public static String folderpath=getConfig("folderpath");
	static Sheet sh;
	public static void excelconnection(String filename,String sheetname)
	{
		try {
			File f=new File(folderpath+filename);
			Workbook wb=Workbook.getWorkbook(f);
			sh=wb.getSheet(sheetname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	public static int rowcount()
	{
		int row=sh.getRows();
		return row;
	}
	
	public static void ccount()
	{
		int col=sh.getColumns();
		
	
	}
	public static String readdata(int col,int row)
	{
		String x=sh.getCell(col, row).getContents();
		return x;
	}

}
