package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Dummyclassfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s = "abcdefgh";
		String repchars="";
		List<String> lisrepcharstring=new ArrayList<String>();
		int count=0;
		Set<Character> dupele=new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(dupele.add(s.charAt(i))) {
				repchars=repchars+s.charAt(i);
			}else {
				lisrepcharstring.add(repchars);
				i=i-1;
				repchars="";
				dupele.clear();
			}
			}
	for (int i = 0; i < lisrepcharstring.size(); i++) {
		if(lisrepcharstring.get(i).length()>count) {
			count=lisrepcharstring.get(i).length();
		}
	}
	System.out.println(count);
	}*/
		
		//Class room exercise -1 Day 1DSA
		/*int[] arrNumbers = {14, 8, 5, 54, 41, 10, 1, 500};
		int temp;
		int count=0;
		 for(int a = 0; a <= arrNumbers.length - 1; a++)
	      {
	         for(int b = 0; b <= arrNumbers.length - 2; b++)
	         {
	        	 count++;
	            if(arrNumbers[b] < arrNumbers[b + 1])
	            {
	               temp = arrNumbers[b];
	               arrNumbers[b] = arrNumbers[b + 1];
	               arrNumbers[b + 1] = temp;
	            }
	         }
	      }
System.out.println(count);
		 for(int num : arrNumbers)  
	      {
	         System.out.println(num);
	      }*/
		 
		//Class room exercise -2 Day 2 DSA
		/*
		 * int[] arrNumbers = {1,2,3,4,5,6,7}; for (int i = 0; i < arrNumbers.length;
		 * i++) { System.out.println("Array is of index "+i+" value is "+arrNumbers[i]);
		 * }
		 */
		 
		 //class room exercise -3 Day 3 DSA
		 String [][] empdetails= {{"Ajay","29"},{"vijoy","31"},{"Vinoth","28"}};
		 Employeeclass ec=new Employeeclass();
		 System.out.println(ec.employeedetails(empdetails));	 
		 
		 ArrayList<Integer> al=new ArrayList<Integer>(10);
		 al.add(1);
		 al.add(2);
		 al.add(3);
		 al.add(4);
		 al.add(5);
		 al.add(6);
		 al.add(7);
		 al.add(8);
		 al.add(9);
		 al.add(10);
		 System.out.println(al);
		 al.add(11);
		 System.out.println(al);
		 int sum = 0;
		 int[] arr = {1,2,3,4,5};
		 for(int i =0 ; i <= arr.length;i++ ){
		 sum += arr[i];
		 }
		 

}
	
	
}
