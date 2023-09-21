package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Qchallenge85_SortArrayByparity {
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int [] {2,4,1,3}, sortbyparity(new int [] {3,1,2,4}));
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int [] {0}, sortbyparity(new int [] {0}));
	}

	public int[] sortbyparity(int [] nums) {
	       int startind=0;
			int lastind=nums.length-1;
			int [] out=new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				if(nums[i]%2==0) {
					out[startind]=nums[i];
					startind++;
				}
				else {
					out[lastind]=nums[i];
					lastind--;
				}
			}
			return out;	
	}

}
