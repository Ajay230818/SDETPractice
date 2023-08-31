package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;



public class Class_31082023_FinalPricewithspecialdiscount {
	
	/* Test Data 
	 * int [] prices = [8,4,6,2,3]
	 * int [] prices = [1,2,3,4,5]
	 * int [] prices = [10,1,1,6]
	 * int [] prices = []
	 * */
	
	/* Pseudo code 
	 * created an empty integer array with same length that of prices array
	 * use a nested for loop to piterate through the prices with i and i+1 length
	 * check for the condition if price is greater than i+1 element return price-i+1 to the created empty array and break 
	 * else add that to the created array 
	 * since last element wont be satisfying add that element to then newly created array at index.length-1
	 * return the array
	 * */
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int [] {4,2,4,2,3}, Finalprice(new int [] {8,4,6,2,3}));
	}
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int [] {1,2,3,4,5}, Finalprice(new int [] {1,2,3,4,5}));
	}
	@Test
	public void test3() {
		Assert.assertArrayEquals(new int [] {9,0,1,6}, Finalprice(new int [] {10,1,1,6}));
	}
	
	

	public static int[] Finalprice(int [] prices) {
		int [] out=new int [prices.length];
		
		for (int i = 0; i < prices.length; i++) {
			for (int j = i+1; j < prices.length; j++) {
				if(prices[i]>=prices[j]) {
					out[i]=prices[i]-prices[j];
					break;
				}else {
					out[i]=prices[i];
				}
			}
		}
		out[prices.length-1]=prices[prices.length-1];
		return out;
	}

}
