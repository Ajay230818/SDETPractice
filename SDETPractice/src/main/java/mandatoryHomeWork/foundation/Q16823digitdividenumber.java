package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class Q16823digitdividenumber {
	/*
	 * Understanding the problem done Test data , input num=7,num=123,num=1248
	 * Pseudo code: 
	 * 1.iterate through the num using while loop 
	 * 2.declare a variable,digit,count
	 * 3.if num%digit==0 increment the count 
	 * 4.return count
	 */

	@Test
	public void test1() {
		Assert.assertEquals(1, digitdividenumber(7));
	}

	@Test
	public void test2() {
		Assert.assertEquals(2, digitdividenumber(121));
	}

	@Test
	public void test3() {
		Assert.assertEquals(4, digitdividenumber(1248));
	}

	public int digitdividenumber(int num) {
		int count = 0;
		int digit = 0;
		int n = num;
		while (num > 0) {
				digit = num % 10;
				if (n % digit == 0) {
					count++;
				}
				num = num / 10;
			}
		return count;
	}
}
