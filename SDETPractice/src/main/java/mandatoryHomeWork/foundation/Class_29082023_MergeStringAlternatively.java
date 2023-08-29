package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Class_29082023_MergeStringAlternatively {
	
	@Test
	public void test1() {
		Assert.assertEquals("apbqcr", MergeStringAlternate("abc", "pqr"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("apbqrs", MergeStringAlternate("ab", "pqrs"));
	}
	@Test
	public void test3() {
		Assert.assertEquals("apbqcd", MergeStringAlternate("abcd", "pq"));
	}

	public  String MergeStringAlternate(String word1,String word2) {
		String mergedString="";
		String out="";
		int word1len=word1.length();
		int word2len=word2.length();
		if(word1len>word2len) {
			mergedString=word1.substring(0, word2len+1)+word2.substring(0,word2len);
			System.out.println(mergedString);
		}
		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				if(i==j) {
					out+=word1.charAt(i);
					out+=word2.charAt(i);
				}
			}
		}
		if(word1.length()>word2.length()) {
			int indexOf = word2.length();
			out=out+word1.substring(indexOf);
			return out;
		}else if(word1.length()<word2.length()) {
			int indexOf = word1.length();
			out=out+word2.substring(indexOf);
			return out;
		}else {
			return out;
		}
	}

}
