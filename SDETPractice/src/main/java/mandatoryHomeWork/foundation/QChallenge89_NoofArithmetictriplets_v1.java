package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class QChallenge89_NoofArithmetictriplets_v1 {
	
	@Test
	public void test1() {
		Assert.assertEquals(2, Arithmetictriplets(new int [] {0,1,4,6,7,10}, 3));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2, Arithmetictriplets(new int [] {4,5,6,7,8,9}, 2));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(1, Arithmetictriplets(new int [] {4,5,6,7,8}, 2));
	}

	public int Arithmetictriplets (int [] nums,int diff) {
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				for (int k = 0; k < nums.length; k++) {
					if(i<j && j<k && nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
						count++;
					}
				}
			}
		}
		return count;
	}

}
