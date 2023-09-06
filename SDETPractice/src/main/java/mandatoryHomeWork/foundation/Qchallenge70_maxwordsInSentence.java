package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge70_maxwordsInSentence {
	
	
	@Test
	public void test1() {
		Assert.assertEquals(6, maxwords(new String [] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(3, maxwords(new String [] {"please wait", "continue to fight", "continue to win"}));
	}

	public int maxwords (String[] sentences) {
		// TODO Auto-generated method stub
		/* Pesudo code 
		 * 1.given the sentence in form of arrays of strings
		 * 2.iterate through each element in the array
		 * 3.for an element try to split using space and try to find out the count of element
		 * 4.return to a count variable
		 * 5.Do step 3 again
		 * 6.if count variable is greater than before replace it else leave it
		 * 7.return count 
		 * */
		int words=0;
		for (int i = 0; i < sentences.length; i++) {
			int wordscount = wordscount(sentences[i]);
			if(words<wordscount) {
				words=wordscount;
			}	
		}
		return words;
		
	}
	private static int wordscount(String sentence) {
		int counter=0;
		String[] split = sentence.split(" ");
		for (int i = 0; i < split.length; i++) {
			counter++;
		}
		return counter;
	}

}
