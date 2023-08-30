package mandatoryHomeWork.foundation;

import static org.junit.Assert.assertArrayEquals;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class MyQuestion_29082023_SplitStringBySeperator {
	
	@Test
	public void test1() {
		List<String> actual=new ArrayList<String>();
		actual.add("one");
		actual.add("two");
		actual.add("three");
		actual.add("four");
		actual.add("five");
		actual.add("six");
		
		List<String> words=new ArrayList<String>();
		words.add("one.two.three");
		words.add("four.five");
		words.add("six");
		Assert.assertEquals(actual, splitstngseprator(words, '.'));
	}
	
	@Test
	public void test2() {
		List<String> actual=new ArrayList<String>();
		actual.add("easy");
		actual.add("problem");
		List<String> words=new ArrayList<String>();
		words.add("$easy$");
		words.add("$problem$");
		Assert.assertEquals(actual, splitstngseprator(words, '$'));
	}
	
	

	public static List<String> splitstngseprator(List<String> words,char separator) {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<>();
		String[] wrds;
		String s=Character.toString(separator);
		String sep="\\"+s;
		for (int i = 0; i < words.size(); i++) { 
			
			wrds = words.get(i).split(sep);
			for (int j = 0; j < wrds.length; j++) {
				if(!wrds[j].isEmpty())
				result.add(wrds[j]);
			}
		}
		return result;
	}

}
