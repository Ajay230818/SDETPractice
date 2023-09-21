package mandatoryHomeWork.foundation;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge86_SubstringsthreenumberofPairs {
	
	@Test
	public void test1() {
		Assert.assertEquals(1, threenopairs("xyzzaz"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(4, threenopairs("aababcabc"));
	}

	public  int threenopairs(String s) {
		char[] charArray = s.toCharArray();
		int count=0;
		int pointer=0;
		int subk=3;
		
		while( pointer < charArray.length-subk+1){
            if(charArray[pointer]!=charArray[pointer+1] && charArray[pointer+1]!=charArray[pointer+2]&&charArray[pointer]!=charArray[pointer+2]) {
            		count++;
            	}
            	pointer++;
            
        }
		return count;
	}

}
