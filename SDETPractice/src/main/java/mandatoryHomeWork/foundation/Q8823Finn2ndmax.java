package mandatoryHomeWork.foundation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Q8823Finn2ndmax {
	
	@Test()
	public void Test1() {
		Assert.assertEquals(8, secondmaxinteger(new int [] {9,8,1,3,5,4,6}));
	}
	
	@Test
	public void Test2() {
		Assert.assertEquals(99, secondmaxinteger(new int [] {1,2,7,4,5,100,97,34,99}));
	}
	
	@Test
	public void Test3() {
		Assert.assertEquals(23, secondmaxinteger(new int [] {1,5,8,12,23,10,28}));
	}

	public int secondmaxinteger(int [] Array) {
		// TODO Auto-generated method stub
		Arrays.sort(Array);
		return Array[Array.length-2];
		//try using below logic
		/*
		 * int max1=0; int max2=0;
		 */
		/*
		 * for (int i = 0; i < Array.length; i++) {
		 * 
		 * }
		 */
		
		//use index();
	}

}
