package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class QChallenge71truncating {
	
	/* TestData
	 * s = "Hello how are you Contestant", k = 4
	 * s = "What is the solution to this problem", k = 4
	 * s = "chopper is not a tanuki", k = 5
	 * s = "chopper", k = 1
	 * */
	
	/* Pseudo Code 
	 * 1.split the sentence using space as seperator
	 * 2.iterate through the splited array with k times
	 * 3.add that to an empty string
	 * 4.return the string
	 * */
	
	@Test
	public void test1() {
		Assert.assertEquals("Hello how are you", truncsent("Hello how are you Contestant", 4));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("What is the solution", truncsent("What is the solution to this problem", 4));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("chopper is not a tanuki", truncsent("chopper is not a tanuki", 5));
	}

	public static String truncsent(String s,int k) {
		
		String[] split = s.split(" ");
		String out="";
		for (int i = 0; i < split.length; i++) {
			if(i<k) {
			out+=split[i]+" ";	
			}
		}
		return out.trim();
	}

}
