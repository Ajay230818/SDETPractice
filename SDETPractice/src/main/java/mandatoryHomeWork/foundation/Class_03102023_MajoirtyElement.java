package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class Class_03102023_MajoirtyElement {
	
	/* Pseudo code 
	 * 1.find the length of nums
	 * 2.create a hashmap with generics as Integer and Integer
	 * 3.Using contains key store the find the integer count.
	 * 4.iterate through the map , if value is greater than n/2 return the key.
	 * */
	
	@Test
	public void test1() {
		Assert.assertEquals(3, majelement(new int [] {3,2,3}));
		Assert.assertEquals(3, majelebrutefreq(new int [] {3,2,3}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2, majelement(new int [] {2,2,1,1,1,2,2}));
		Assert.assertEquals(3, majelebrutefreq(new int [] {3,2,3}));
	}

	public int majelement(int [] nums) {
		//hashmap
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}else {
				map.put(nums[i], map.get(nums[i])+1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			 if(entry.getValue()>nums.length/2) {
				return entry.getKey();
			 }
			
		}
		return 0;

	}
	
	public int majelebrutefreq(int [] nums) {
		int [] arr=new int[10];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>nums.length/2) {
				return i;
			}
		}
		return 0;
		
		
	}

}
