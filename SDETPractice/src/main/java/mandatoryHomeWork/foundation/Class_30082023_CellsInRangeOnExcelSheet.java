package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Class_30082023_CellsInRangeOnExcelSheet {
	
	@Test
	public void test1() {
		List<String> actual=new ArrayList<String>();
		actual.add("K1");
		actual.add("K2");
		actual.add("L1");
		actual.add("L2");
		Assert.assertEquals(actual, cellsinrangesheet("K1:L2"));
	}
	
	@Test
	public void test2() {
		List<String> actual=new ArrayList<String>();
		actual.add("A1");
		actual.add("B1");
		actual.add("C1");
		actual.add("D1");
		actual.add("E1");
		actual.add("F1");
		Assert.assertEquals(actual, cellsinrangesheet("A1:F1"));
	}

	public  List<String> cellsinrangesheet(String s) {
		// TODO Auto-generated method stub
		
		/* Pseudo Code 
		 * 1.Split the given string using the delimiter ':'
		 * 2.use substring and get the index position of rows
		 * 3.use substring to find the ndex position of column valuess
		 * 4.iterate through the loop from r1 to r2
		 * 5.iterate through the loop from c1 to c2 
		 * 6.Add the value to the List
		 * 7.return the list
		 * */
		String[] split = s.split(":");
		String row1=split[0].substring(0,1);
		String row2=split[1].substring(0,1);
		String col1=split[0].substring(1,2);
		String col2=split[1].substring(1,2);
		char r1 = row1.charAt(0);
		char r2 = row2.charAt(0);
		int c1=Integer.parseInt(col1);  
		int c2=Integer.parseInt(col2); 
		
		String sheetname="";
		
		List<String> excelsheetnames=new ArrayList<String>();
		for (char i = r1; i <= r2; i++) {
			for (int j = c1; j <= c2; j++) {
				sheetname+=i;
				sheetname+=j;
				excelsheetnames.add(sheetname);
				sheetname="";
			}
		}
		return excelsheetnames;
	}

}
