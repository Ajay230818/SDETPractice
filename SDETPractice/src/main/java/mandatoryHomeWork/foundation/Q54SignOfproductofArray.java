package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Q54SignOfproductofArray {
	
	@Test()
	public void test1() {
		Assert.assertEquals(1, product(new int [] {-1,-2,-3,-4,3,2,1}));
	}
	
	@Test()
	public void test2() {
		Assert.assertEquals(0,product( new int [] {1,5,0,2,-3}));
	}
	
	@Test()
	public void test3() {
		Assert.assertEquals(-1,product( new int [] {-1,1,-1,1,-1}));
	}
	
	public int product(int [] nums) {
		// TODO Auto-generated method stub
		int prod=1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0) {
				prod=prod*1;
			}else if(nums[i]<0) {
				prod=prod*-1;
			}else if(nums[i]==0) {
				prod=prod*0;
			}
		}
		return prod;
	}

}
