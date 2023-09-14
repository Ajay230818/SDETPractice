package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Class_14092023_sumofsquareofspecialElemnt {
	
	@Test
	public void test1() {
		Assert.assertEquals(21, sofsqrs(new int [] {1,2,3,4}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(63, sofsqrs(new int [] {2,7,1,19,18,3}));
	}

	public  int sofsqrs(int [] nums) {
		int n=nums.length;
		int sq=1;
		int sumofsquares=0;
		for (int i = 0; i < nums.length; i++) {
			if(n%(i+1)==0) {
				sq=nums[i]*nums[i];
				sumofsquares+=sq;
			}
		}
		return sumofsquares;
	}

}
