package mandatoryHomeWork.foundation;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashSet;

import org.junit.Test;

import junit.framework.Assert;

public class Class_07092023_CheckIfPangram {
	
	/*
	 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
	 */	
	
	/* TestData 
	 *sentence = "thequickbrownfoxjumpsoverthelazydog" true 
	 *sentence = "leetcode" false
	 *sentene = "ajith" false
	 *sentence= "ajay" false
	 * */
	
	/* Pseudo code 
	 * create an set 
	 * iterate through the for loop
	 * Add character to the created set
	 * if the character is repeating return false else its true
	 * */
	
    @Test
    public void test1() {
    	Assert.assertEquals(true, checkpanagram("thequickbrownfoxjumpsoverthelazydog"));
    }
    
    @Test
    public void test2() {
    	Assert.assertEquals(false, checkpanagram("leetcode"));
    }
    
    @Test
    public void test3() {
    	Assert.assertEquals(false, checkpanagram("ajay"));
    }

	public static boolean checkpanagram(String sentence) {
		HashSet<Character> set=new HashSet<Character>();
		for (int i = 0; i < sentence.length(); i++) {
			set.add(sentence.charAt(i));
		}
		if(set.size()==26) {
			return true;
		}else {
			return false;
		}
	}

}
