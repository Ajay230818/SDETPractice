package mandatoryHomeWork.foundation;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge104_Countnoofconsistenstring {
	
	@Test
	public void test1() {
		Assert.assertEquals(7,countnoofconsistentstring("abc", new String [] {"a","b","c","ab","ac","bc","abc"}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2,countnoofconsistentstring("ab", new String [] {"ad","bd","aaab","baa","badab"}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(4,countnoofconsistentstring("cad", new String [] {"cc","acd","b","ba","bac","bad","ac","d"}));
	}

	public  int countnoofconsistentstring(String allowed,String [] words) {
		int charc=0;
		int count=0;
		
		HashSet<Character> set=new HashSet<Character>();
		
		for (int i = 0; i < allowed.length(); i++) {
			set.add(allowed.charAt(i));
		}
		
		for (int i = 0; i < words.length; i++) {
			charc=0;
			for (int j = 0; j < words[i].length(); j++) {
				if(set.add(words[i].charAt(j))) {
					set.remove(words[i].charAt(j));
					break;
				}else {
					charc++;
				}
			}
			if(charc==words[i].length()) {
				count++;
			}
		}
		return count;
	}

}
