package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Q51selfDividingNumbers {
	@Test
	public void test1() {
		List<Integer> actual=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22));  
		Assert.assertEquals(actual, selfDividingNumbers(1, 22));
	}
	
	@Test
	public void test2() {
		List<Integer> actual=new ArrayList<Integer>(Arrays.asList(48,55,66,77));  
		Assert.assertEquals(actual, selfDividingNumbers(47, 85));
	}
	

	public boolean Dividenumindividual(int originalNum) {
        int num = originalNum;
        while(num>0) {
            int remainder = num % 10;
            if(remainder==0) {
                return false;
            }
            if(originalNum % remainder !=0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int leftnum, int rightnum) {
        ArrayList<Integer> lis = new ArrayList<>();
        for(int i=leftnum; i<=rightnum; i++) {
            if(Dividenumindividual(i)) {
                lis.add(i);
            }
        }
        return lis;
    }
}
