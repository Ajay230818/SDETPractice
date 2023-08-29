package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Class_29082023_SplitbalancedString {
	
	/* Pseudo code 
	 * 1.declare int variable of right and left to 0 and intialize a counter variable
	 * 2.iterate through the string using charAt and compare if character is equal to R or L
	 * 3.increment respective variable 
	 * 4.if R and L are equal increment count and reset variable R and L to 0
	 * 5.return count
	 * */
	
	@Test
	public void test1() {
		Assert.assertEquals(4, splitbRandL("RLRRLLRLRL"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2, splitbRandL("RLRRRLLRLL"));
	}
	@Test
	public void test3() {
		Assert.assertEquals(1, splitbRandL("LLLLRRRR"));
	}

	public static int splitbRandL(String s) {
		int count=0;
		int R=0;
		int L=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='R') {
				R++;
			}else {
				L++;
			}
			if(R==L) {
			    count++;
			    R=0;
			    L=0;
			}
		}
		return count;
	}

}
