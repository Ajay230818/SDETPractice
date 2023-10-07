package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge91_ArrayConcatenation {
	
	@Test
	public void test1() {
		Assert.assertEquals(596, Arrayconcat(new int [] {7,52,2,4}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(673, Arrayconcat(new int [] {5,14,13,8,12}));
	}

	public  long Arrayconcat(int [] nums) {
		int startpointer=0;
		int endpointer=nums.length-1;
		String num= "";
		long out=0;
		
		while(startpointer<endpointer) {
			num=""+nums[startpointer]+nums[endpointer];
			out+=Integer.parseInt(num);
			startpointer++;
			endpointer--;
			System.out.println(nums[startpointer]+"  "+nums[endpointer]);
		}
		System.out.println(nums.length);
		if(nums.length%2!=0) {
		out+=nums[nums.length/2];
		}
		return out;
	}

}
