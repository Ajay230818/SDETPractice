package mandatoryHomeWork.foundation;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class Q18823numofgoodpair {

			/* pesudo code 
			 * 1.use 2 for loops to iterate through the array
			 * 2.2 nd loop increment the j value as i+1
			 * 3.compare the values of i and j if i is equal to j then increment the count
			 * 4.return the count
			 * 5.initialize count=0 in begining.
			 * */

	@Test
	public void test1() {
		Assert.assertEquals(4, numgoodpairs(new int [] {1,2,3,1,1,3}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(6, numgoodpairs(new int [] {1,1,1,1}));	
	}
	@Test
	public void test3() {
		Assert.assertEquals(0, numgoodpairs(new int [] {1,2,3}));	
	}
	
	public  int numgoodpairs(int [] nums) {
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					count=count+1;
				}
			}
		}
		return count;
	}

}
