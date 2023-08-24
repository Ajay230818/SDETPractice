package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Q14ArrayPartitioning {
	
	/* pesudo Code 
	 * 1.Sort the given array 
	 * 2.so the pairs will be followed as length of index / 2
	 * 3.1 st number in the pair is considered as min number
	 * 4.initialize sum variable
	 * 5.iterate through the sorted array
	 * 6.take the 1 st value of pair that is odd indexes and add them to sum variable
	 * 7.return sum 
	 * */
	
	@Test
	public void test1() {
		Assert.assertEquals(4, Arraypartition(new int [] {1,4,3,2}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(9, Arraypartition(new int [] {6,2,6,5,1,2}));
	}

	public  int Arraypartition(int [] nums) {
		int sum=0;
		Arrays.sort(nums);
		//System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			if(i%2==0) {
			sum+=nums[i];
			}
		}
		return sum;
	}

}
