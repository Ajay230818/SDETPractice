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
		int max=0;
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length-1; j++) {
				for (int k = j+1; k < num.length-1; j++) {
					if(num[i]*num[j]*num[k]>max) {
						max=num[i]*num[j]*num[k];
					}
				}
			}
		}
		return max;
	}

}
