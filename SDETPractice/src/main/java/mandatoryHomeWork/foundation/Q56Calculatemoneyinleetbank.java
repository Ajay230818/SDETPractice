package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class Q56Calculatemoneyinleetbank {
	
	/* Pesudo code 
	 * 1.input is number of days and output is amount fo that days
	 * 2.starting monday hercy starts to invest 1 dollar on monday and increment it by 1 on other day 
	 * 3.when its more than 7 days and he reaches monday again he add 1 more dollar to the previous dollar
	 * 4.iterate through the loop
	 * 5.if days are greater than 7 days add on more dollar on the 8 th day so basically 8/16/24 and so on
	 * 6.else add one dollar each day 
	 * 7.return the total amount
	 * */
	
	@Test
	public void test1() {
		Assert.assertEquals(10, moneyinbank(4));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(37, moneyinbank(10));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(96, moneyinbank(20));
	}
	
	public int  moneyinbank(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		int out=1;
		int count=2;
		for (int i = 1; i <=n; i++) {
			sum+=out;
			out++;
			if(i%7==0) {
				out=count;
				count++;
			}
		}
		return sum;
	}

}
