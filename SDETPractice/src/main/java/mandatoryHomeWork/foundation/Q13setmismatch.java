package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Q13setmismatch {
	
	/* PesudoCode 
	 * 1.create an empty array with same length that of nums array.
	 * 2.Add values to the created array with 1 to n
	 * 3.create a nested for loop for both the arrays
	 * 4.check for the conditions if both values are equal and index should be same 
	 * 5.return the nums index value as repeating number and created array value as missing number
	 * */
	
	@Test
	public void test1() {
		int [] actual=new int [] {2,3};
		Assert.assertArrayEquals(actual,Findmissingnumber(new int [] {1,2,2,4}));
	}
	
	@Test
	public void test2() {
		int [] actual=new int [] {1,2};
		Assert.assertArrayEquals(actual,Findmissingnumber(new int [] {1,1}));
	}
	
	@Test
	public void test3() {
		int [] actual=new int [] {6,7};
		Assert.assertArrayEquals(actual,Findmissingnumber(new int [] {1,2,3,4,5,6,6,8,9}));
	}
	
	@Test
	public void test4() {
		int [] actual=new int [] {2,1};
		Assert.assertArrayEquals(actual,Findmissingnumber(new int [] {3,2,2}));
	}

	public static int[] Findmissingnumber(int [] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		int [] dumarr=new int[nums.length];
		int n=1;
		int [] out= new int[2];
		for (int i = 0; i < dumarr.length; i++) {
			dumarr[i]=n;
			n++;
		}
		for (int i = 0; i < dumarr.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(dumarr[i]!=nums[j] && i==j) {
					out[0]=nums[j];
					out[1]=dumarr[i];
				}
			}
			
		}
		return out;
	}

}
