package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Class_14092023_compareThetriplets {
	
	@Test
	public void test1() {
		List<Integer> expected=new ArrayList<Integer>(2);
		expected.add(0);
		expected.add(3);
		Assert.assertEquals(expected, compartriplet(new int [] {2,3,4}, new int [] {5,6,7}));
	}
	
	@Test
	public void test2() {
		List<Integer> expected=new ArrayList<Integer>(2);
		expected.add(1);
		expected.add(1);
		Assert.assertEquals(expected, compartriplet(new int [] {1, 2, 3}, new int [] {3, 2, 1}));
	}
	
	@Test
	public void test3() {
		List<Integer> expected=new ArrayList<Integer>(2);
		expected.add(1);
		expected.add(1);
		Assert.assertEquals(expected, compartriplet(new int [] {5,6,7}, new int [] {3,6,10}));
	}
	

	public List<Integer>  compartriplet(int [] a,int [] b) {
		// Compare the Triplets

		/* TestData 
		 * a = [1, 2, 3] , b = [3, 2, 1] o/p [1,1]
		 * a = [5,6,7] , b = [3,6,10] o/p [1,1]
		 * a = [5,6,7] , b = [2,3,4] 0/p [3,0]
		 * a = [2,3,4] , b = [5,6,7] 0/p [0,3]
		 * */
		int counta=0;
		int countb=0;
		List<Integer> out=new ArrayList<Integer>(2);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(i==j && a[i]>b[j]) {
					counta++;
				}else if(i==j && a[i]<b[j]) {
					countb++;
				}
			}
		}
		out.add(counta);
		out.add(countb);
		return out;
	}

}
