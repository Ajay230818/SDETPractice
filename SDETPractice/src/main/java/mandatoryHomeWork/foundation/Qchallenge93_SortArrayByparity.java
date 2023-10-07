package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Qchallenge93_SortArrayByparity {
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int [] {4,5,2,7}, sortarraybyparity(new int [] {4,2,5,7}));
	}
	
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int [] {2,3}, sortarraybyparity(new int [] {2,3}));
	}

	public  int[] sortarraybyparity(int [] nums) {
		int [] arr=new int[nums.length];
		int j=0;
		int k=1;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2==0) {
				arr[j]=nums[i];
				j+=2;
			}
			else {
				arr[k]=nums[i];
				k+=2;
			}
		}
		return arr;
	}

}
