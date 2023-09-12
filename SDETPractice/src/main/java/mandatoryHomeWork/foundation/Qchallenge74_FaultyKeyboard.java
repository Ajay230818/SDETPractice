package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge74_FaultyKeyboard {
	static String out="";
	
	@Test
	public void test1() {
		Assert.assertEquals("rtsng", finalString("string"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("ponter", finalString("poiinter"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("htrapv", finalString("parthiv"));
	}
	
    public String finalString(String s) {
		String rev="";
		for (int i = 0; i < s.length(); i++) {
			if(!(s.charAt(i)=='i')) {
				rev=rev+s.charAt(i);	
			}
			if(s.charAt(i)=='i') {
				reversestring(rev);
				rev="";
				rev=out;
		}
    }
		return rev;
		}
    public static String reversestring(String ds) {
		out="";
		for (int i = ds.length()-1; i >=0; i--) {
			out+=ds.charAt(i);
		}
		return out;
	}
}
