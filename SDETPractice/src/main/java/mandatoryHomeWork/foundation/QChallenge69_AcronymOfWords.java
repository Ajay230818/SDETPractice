package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractWriter;

import org.junit.Test;

import junit.framework.Assert;

public class QChallenge69_AcronymOfWords {
	
	@Test
	public void test1() {
		List<String> actwords = new ArrayList<>();
		actwords.add("alice");
		actwords.add("bob");
		actwords.add("charlie");
		Assert.assertEquals(true, acronymwords(actwords, "abc"));
	}
	
	@Test
	public void test2() {
		List<String> actwords = new ArrayList<>();
		actwords.add("an");
		actwords.add("apple");
		Assert.assertEquals(false, acronymwords(actwords, "a"));
	}
	
	@Test
	public void test3() {
		List<String> actwords = new ArrayList<>();
		actwords.add("never");
		actwords.add("gonna");
		actwords.add("give");
		actwords.add("up");
		actwords.add("on");
		actwords.add("you");
		Assert.assertEquals(true, acronymwords(actwords, "ngguoy"));
	}

	public  boolean acronymwords(List<String> words,String s) {
		String out="";
		
		for (int i = 0; i < words.size(); i++) {
			out=out+words.get(i).charAt(0);
		}
		if(s.equalsIgnoreCase(out)) {
			return true;
		}else {
			return false;
		}
	}

}
