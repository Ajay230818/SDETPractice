package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge95_minimumrecolours {
	
	@Test
	public void test1() {
		Assert.assertEquals(3, BWcolors("WBBWWBBWBW", 7));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(0, BWcolors("WBWBBBW", 2));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(2, BWcolors("WBWBBBW", 6));
	}

	public int BWcolors(String blocks,int k) {
		char[] bca = blocks.toCharArray();
		int startind=0;
		int endind=0;
		int min=Integer.MAX_VALUE;;
		int count=0;
		
		while(startind<bca.length-k+1) {
			if(endind-startind<k) {	
			if(bca[endind]=='W' ) {
				count++;
			}
			endind++;
			}else {
				if(count<min) {
					min=count;
				}
				count=0;
				startind++;
				endind=startind;
			}
			
		}
		return min;
	}

}
