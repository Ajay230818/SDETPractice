package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Qchallenge97_AnangramsInString {
	
	@Test
	public void test1() {
		List<Integer> out = new ArrayList<Integer>();
		out.add(0);
		out.add(6);
		Assert.assertEquals(out, findAnagrams("cbaebabacd","abc"));
	}
	
	@Test
	public void test2() {
		List<Integer> out = new ArrayList<Integer>();
		out.add(0);
		out.add(1);
		out.add(2);
		Assert.assertEquals(out, findAnagrams("abab", "ab"));
	}
	
	@Test
	public void test3() {
		List<Integer> out = new ArrayList<Integer>();
		out.add(0);
		out.add(2);
		Assert.assertEquals(out, findAnagrams("abab", "a"));
	}

	public List<Integer> findAnagrams(String s, String p) {
		char[] pchar = p.toCharArray();
		Arrays.sort(pchar);
		String pchr = String.valueOf(pchar);
		int startpointer = 0, endpointter = 0, k = p.length();
		List<Integer> out = new ArrayList<Integer>();
		String schr = "";

		while (startpointer < s.length() - k + 1) {
			schr += s.substring(startpointer, endpointter + k);
			char[] schar = schr.toCharArray();
			Arrays.sort(schar);
			String stchr = String.valueOf(schar);
			if (pchr.equalsIgnoreCase(stchr)) {
				out.add(startpointer);
			}
			startpointer++;
			endpointter = startpointer;
			schr = "";
		}
		return out;
	}

}
