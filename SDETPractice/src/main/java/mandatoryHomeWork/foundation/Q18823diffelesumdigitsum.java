package mandatoryHomeWork.foundation;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class Q18823diffelesumdigitsum {
	
	@Test
	public void test1() {
		Assert.assertEquals(9, diffbetweenelesumdigsum(new int [] {1,15,6,3}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(0, diffbetweenelesumdigsum(new int [] {1,2,3,4}));
	}

	public  int diffbetweenelesumdigsum(int [] nums) {
		// TODO Auto-generated method stub
		int elesum=0;
		int digitsum=0;
		int digit=0;
		for (int i = 0; i < nums.length; i++) {
			elesum=elesum+nums[i];
			while(nums[i]>0) {
				digit=nums[i]%10;
				digitsum+=digit;
				nums[i]=nums[i]/10;
			}
		}
		return elesum-digitsum;
	}

}
