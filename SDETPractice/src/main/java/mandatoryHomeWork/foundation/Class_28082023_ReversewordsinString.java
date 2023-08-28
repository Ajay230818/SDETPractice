package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Class_28082023_ReversewordsinString {
	
	/*
	 * TestData Positive - "Let's take LeetCode contest" Positive -
	 * "# 3/438 B John's Street"
	 */

	/*
	 * Pseudo Code 
	 * 1. Declare an new empty string 
	 * 2. Iterate through the string
	 * using an forloop starting from length of string 
	 * 3. reverse the word using string builder and add it to o/p
	 * 4. return the newly created string by triming it
	 */
	
	@Test
	public void test1() {
		Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", reversetheword("Let's take LeetCode contest"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("doG gniD", reversetheword("God Ding"));
	}

	public  String reversetheword(String s) {
		
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
