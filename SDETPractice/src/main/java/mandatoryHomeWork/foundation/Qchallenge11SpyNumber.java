package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class Qchallenge11SpyNumber {
	
	
	/* PseudoCode 
	 * 1.initialize 3 variables as sum,prod and digit/
	 * 2.iterate through the while loop
	 * 3.find the product and sum
	 * 4.check whether product and sum are equal return true else false
	 * */
	
	@Test
	public void test1() {
		Assert.assertEquals(true, spynum(132));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, spynum(1124));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(false, spynum(134));
	}

	public boolean spynum(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		int prod=1;
		int digit=0;
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			prod=prod*digit;
			num=num/10;		
		}
		if(prod==sum) {
			return true;
		} else {
			return false;
		}
	}
	

}
