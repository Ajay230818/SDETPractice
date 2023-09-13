package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge79_reversewordsinstring557 {
	
	@Test
	public void test1() {
		Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords("Let's take LeetCode contest"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("doG gniD", reverseWords("God Ding"));
	}

	  public String reverseWords(String s) {
			String [] words=s.split(" ");
			String out="";
			for (int i = 0; i < words.length; i++) {
				StringBuilder rev = new StringBuilder(words[i]);
				StringBuilder reverse = rev.reverse();	
				out+=reverse+" ";
			}
			return out.trim();
		}

}
