package mandatoryHomeWork.foundation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Q16assigncookies {
	
	@Test
	public void test1() {
		Assert.assertEquals(2, childertocookies(new int [] {1,2,3}, new int [] {1,1,3}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, childertocookies(new int [] {1,2,3}, new int [] {2}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(3, childertocookies(new int [] {10,8,6,7}, new int [] {5,6,7,8}));
	}

	public int childertocookies(int []g,int  []s) {
		// TODO Auto-generated method stub
		int count=0; 
		int candyiterate=0;

		Arrays.sort(g);//    7 8 9 10
		Arrays.sort(s); //   5 6 9 10

		for (int i=0; i<g.length;i++)
		{
			while(candyiterate<s.length)
			{ 
				if(s[candyiterate]>=g[i])
				{
					count++;
					candyiterate++;
					break;
				}
				candyiterate++;
			}
		}

		return count;

	}

}
