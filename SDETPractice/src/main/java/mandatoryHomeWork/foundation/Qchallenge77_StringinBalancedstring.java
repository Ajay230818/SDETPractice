package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge77_StringinBalancedstring {
	
	@Test
	public void test1() {
		Assert.assertEquals(4, stringbalanceRL("RLRRLLRLRL"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2, stringbalanceRL("RLRRRLLRLL"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(1, stringbalanceRL("LLLLRRRR"));
	}

	public static int stringbalanceRL(String s) {
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
