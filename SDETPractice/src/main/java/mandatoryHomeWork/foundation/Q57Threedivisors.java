package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Q57Threedivisors {
	
	@Test
	public void test1() {
		Assert.assertEquals(false, threedivisors(2));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, threedivisors(4));
	}

	public boolean threedivisors(int n) {

		int count=1;
		for (int i = 1; i <=n&&count<4; i++) {
			if(n%i==0 && i%2==0) {
				count++;
			}
		}
		if(count>=3) {
			return true;
		}else {
			return false;
		}
	}

}
