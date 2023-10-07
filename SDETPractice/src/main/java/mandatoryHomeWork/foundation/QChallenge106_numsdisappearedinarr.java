package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class QChallenge106_numsdisappearedinarr {
	
	@Test
	public void test1() {
		List<Integer> expected=new ArrayList<Integer>();
		expected.add(5);
		expected.add(6);
		Assert.assertEquals(expected,numdisappiarr(new int [] {4,3,2,7,8,2,3,1}) );
	}
	
	@Test
	public void test2() {
		List<Integer> expected=new ArrayList<Integer>();
		expected.add(2);
		Assert.assertEquals(expected,numdisappiarr(new int [] {1,1}) );
	}
	
	@Test
	public void test3() {
		List<Integer> expected=new ArrayList<Integer>();
		Assert.assertEquals(expected,numdisappiarr(new int [] {}) );
	}

	public static List<Integer> numdisappiarr(int [] nums) {
		int[] arr = new int[nums.length];
		List<Integer> out = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			arr[nums[i] - 1]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] ==0) {
				out.add(i+1);
			}
		}
		return out;
	}

}
