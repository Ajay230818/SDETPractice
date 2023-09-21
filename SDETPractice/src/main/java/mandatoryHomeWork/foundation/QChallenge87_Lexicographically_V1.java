package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class QChallenge87_Lexicographically_V1 {
	
	@Test
	public void test1() {
		Assert.assertEquals("efcfe", lexigraph("egcfe"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("abba", lexigraph("abcd"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("neven", lexigraph("seven"));
	}

	public  String lexigraph(String s) {
		
		char[] charArray = s.toCharArray();
		int startind=0;
		int endind=charArray.length-1;
		while(startind<endind) {
			if(charArray[startind]>charArray[endind]) {
				charArray[startind]=charArray[endind];
			}else {
				charArray[endind]=charArray[startind];
			}
			startind++;
			endind--;
		}
		
        return new String(charArray);
	}

}
