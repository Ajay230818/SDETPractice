package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Q3823productof3numbers {
	
	@Test()
	public void test1() {
		Assert.assertEquals(6, product(new int [] {1,2,3}));
	}
	
	@Test()
	public void test2() {
		Assert.assertEquals(24,product( new int [] {1,2,3,4}));
	}
	
	@Test()
	public void test3() {
		Assert.assertEquals(-6,product( new int [] {-1,-2,-3,}));
	}

	public int product(int[] num) {
		int prod=1;
		for (int i = 0; i < num.length; i++) {
			prod=prod*num[i];
		}
		return prod;
	}

}
