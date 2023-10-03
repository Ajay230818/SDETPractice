package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge102_checkifsentenceispangram {
	
	@Test
	public void test1() {
		Assert.assertEquals(true, freqpanagram("thequickbrownfoxjumpsoverthelazydog"));
		Assert.assertEquals(true, setpanagram("thequickbrownfoxjumpsoverthelazydog"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, freqpanagram("leetcode"));
		Assert.assertEquals(false, setpanagram("leetcode"));
	}

	public boolean freqpanagram(String sentence) {
		int[] arr=new int[26];
		for (int i = 0; i < sentence.length(); i++) {
			arr[sentence.charAt(i)-'a']++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean setpanagram(String sentence) {
		HashSet<Character> set=new HashSet<Character>();
		for (int i = 0; i < sentence.length(); i++) {
			set.add(sentence.charAt(i));
		}
		return set.size()==26;
	}

}
