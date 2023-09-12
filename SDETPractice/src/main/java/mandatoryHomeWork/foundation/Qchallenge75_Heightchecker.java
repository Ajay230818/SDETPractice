package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge75_Heightchecker {
	
	
	@Test
	public void test1() {
		Assert.assertEquals(3, heightcheck(new int [] {1,1,4,2,1,3}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(5, heightcheck(new int [] {5,1,2,3,4}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(0, heightcheck(new int [] {1,2,3,4,5}));
	}
	
	public static int heightcheck(int [] heights) {
		int[] expected=heights.clone();
		Arrays.sort(expected);
		int count=0;
		for (int i = 0; i < heights.length; i++) {
			for (int j = 0; j < expected.length; j++) {
				if(heights[i]!=expected[i] && i==j){
					count++;
				}
			}
		}
		return count;
	}

}
