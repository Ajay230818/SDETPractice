package mandatoryHomeWork.foundation;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class Class_24082023_EmployeesMettraget {
	
	/* Pesudo code 
	 * 1.iterate through the for loop
	 * 2.use if to check whether the worker has achieved the target which equal to or greater than target
	 * 3.using counter variable count the number of workers who met the target
	 * 4.return count
	 * */
	
	/* Test Data
	 * 1.hours = [0,1,2,3,4], target = 2 ; o/p=3
	 * 2.hours = [5,1,4,2,2], target = 6 ; o/p=0
	 * 3.hours = [],target = 2; o/p =0
	 *  */
	
	@Test
	public void test1() {
		Assert.assertEquals(3, EmployeesMettar(new int []  {0,1,2,3,4}, 2));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(0, EmployeesMettar(new int []  {5,1,4,2,2}, 6));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(0, EmployeesMettar(new int []  {}, 0));
	}

	public int EmployeesMettar(int [] hours,int target) {
		int count=0; //o(1)
		for (int i = 0; i < hours.length; i++) {  //o(N)
			if(hours[i]>=target) {
				count++;
			}
		}
		return count;
	}

}
