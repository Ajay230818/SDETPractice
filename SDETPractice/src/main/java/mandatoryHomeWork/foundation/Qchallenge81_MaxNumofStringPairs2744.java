package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge81_MaxNumofStringPairs2744 {
	
	@Test
	public void test1() {
		Assert.assertEquals(2, maximumNumberOfStringPairs(new String [] {"cd","ac","dc","ca","zz"}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, maximumNumberOfStringPairs(new String [] {"ab","ba","cc"}));
	}

	static String reevs="";
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				reevs="";
				if(reverse(words[i]).equalsIgnoreCase(words[j])) {
					count++;
				}
			}
		}
		return count;
    }
    
    public static String reverse(String s) {
		for (int i = s.length()-1; i >=0; i--) {
			reevs+=s.charAt(i);
		}
		return reevs;
	}

}
