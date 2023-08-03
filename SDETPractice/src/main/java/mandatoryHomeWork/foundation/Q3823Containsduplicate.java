package mandatoryHomeWork.foundation;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Q3823Containsduplicate {
	//Pseudo Code
	//1.iterate through the given array
	//2.create an hashset inorder to find duplicated
	//3.using if loop if we are not able to add the element to set we will return false else true.
	//4.Using set as it wont be allowing duplicates.
	
	@Test()
	public void test1() {
		Assert.assertEquals(true, duplicates(new int [] {1,2,3,1}));
	}
	
	@Test()
	public void test2() {
		Assert.assertEquals(false,duplicates( new int [] {1,2,3,4}));
	}
	
	@Test()
	public void test3() {
		Assert.assertEquals(true,duplicates( new int [] {1,1,1,3,3,4,3,2,4,2}));
	}
	
	public boolean duplicates(int [] arr) {
		Set<Integer> dupset=new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(!dupset.add(arr[i])) {
				return false;
			}
		}
		return true;
		
	}
}
