package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class QChallenge103_sumofuniquelems {
	
	@Test
	public void test1() {
		Assert.assertEquals(3, sumofuniqele(new int [] {1,3,2,3}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(0, sumofuniqele(new int [] {1,1,1,1}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(15, sumofuniqele(new int [] {1,2,3,4,5}));
	}

	public  int sumofuniqele(int [] nums) {
		int sum=0;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i]))
				map.put(nums[i], map.get(nums[i])+1);
			else 
				map.put(nums[i], 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getValue());
			if(entry.getValue()==1)
				sum+=entry.getKey();
		}
		return sum;
	}

}
