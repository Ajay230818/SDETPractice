package mandatoryHomeWork.foundation;

import org.junit.Test;
import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;

import junit.framework.Assert;

public class Class_29082023_reversePrefixoftheword {
	
	/* Test Data 
	 * word = "abcdefd" and ch = "d"
	 * word = "xyxzxe" and ch = "z"
	 * word = "abcd" and ch='e'
	 * */
	
	
	/* Pesudo code 
	 * 1.create a for loop and iterate through the loop using charAT
	 * 2.check for the condition if if character present in word equal character
	 * 3.get the start and end of the character and reverse them.
	 * 4.append the remaining characters to the String
	 * */
	
	@Test
	public void test1() {
		Assert.assertEquals("dcbaefd", reversePrefix("abcdefd", 'd'));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("zxyxxe", reversePrefix("xyxzxe", 'z'));
	}
	@Test
	public void test3() {
		Assert.assertEquals("abcd", reversePrefix("abcd", 'z'));
	}
	
	

	public  String reversePrefix(String word,char ch) {
		int index = word.indexOf(ch);
		if(index!=-1) {
			StringBuilder sb = new StringBuilder(word.substring(0,index+1));
	        return sb.reverse().toString()+word.substring(index+1);
		}else {
			return word;
		}
	}	
}
