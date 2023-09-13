package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge78_ShuffleString {
	
	@Test
	public void test1() {
		Assert.assertEquals("leetcode", restoreString("codeleet", new int [] {4,5,6,7,0,2,1,3}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("abc", restoreString("abc", new int [] {0,1,2}));
	}
	
	 public String restoreString(String s, int[] indices) {
	        char [] ch=new char[indices.length];
	        String out="";
	        for (int i = 0; i < indices.length; i++) {
				ch[indices[i]]=s.charAt(i);
			}
	        for (int i = 0; i < ch.length; i++) {
				out=out+ch[i];
			}
	        return out;
	    }

}
