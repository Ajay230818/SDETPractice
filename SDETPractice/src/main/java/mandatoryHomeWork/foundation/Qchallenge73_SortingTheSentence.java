package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge73_SortingTheSentence {
	
	@Test
	public void test1() {
		Assert.assertEquals("This is a sentence", sortsentence("is2 sentence4 This1 a3"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("Me Myself and I", sortsentence("Myself2 Me1 I4 and3"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("parthiv ajay V T", sortsentence("ajay2 parthiv1 T4 V3"));
	}
	
	

	public static String sortsentence(String s) {
		String[] split = s.split(" ");
		String j="";
		String out="";
		for (int i = 0; i < split.length; i++) {
			for (int k = 0; k < split.length; k++) {
				j+=i+1;
				if(split[k].contains(j)) {
					out+=split[k].substring(0,split[k].length()-1)+" ";
				}
				j="";
			}
			
		}
		return out.trim();
	}

}
