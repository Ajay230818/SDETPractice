package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

public class Q18823Squaringofsortedarray {
	
	/* pseudo code 
	 * 1.iterate though the loop
	 * 2.get the value of nums[i] and sqaure it.
	 * 3.sort the array and return the o/p
	 * 
	 * Test Data :
	 * int [] nums = [-4,-1,0,3,10]
	 * int [] nums = [-7,-3,2,3,11]
	 * int [] nums = [-7,-3,-6,-8,-9]
	 * int [] nums = [5,4,6,7,8]
	 * */
	
	@Test
	public void test1() {
		int [] actual=new int [] {0,1,9,16,100};
		Assert.assertArrayEquals(actual, squaringofnumber(new int [] {-4,-1,0,3,10}));
	}
	
	@Test
	public void test2() {
		int [] actual=new int [] {4,9,9,49,121};
		Assert.assertArrayEquals(actual, squaringofnumber(new int [] {-7,-3,2,3,11}));
	}
	
	public int []  squaringofnumber(int[] num) {
		for(int i=0;i<num.length;i++){
			num[i] = num[i]*num[i];
        }
        Arrays.sort(num);
        return num;
	}	

}
