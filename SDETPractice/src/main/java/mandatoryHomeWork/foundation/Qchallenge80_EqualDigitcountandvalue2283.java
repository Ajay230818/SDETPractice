package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge80_EqualDigitcountandvalue2283 {
	
	@Test
	public void test1() {
		Assert.assertEquals(true, digitCount("1210"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(false, digitCount("030"));
	}

	public boolean digitCount(String num) {
        int count=0;
		String tempind="";
		String tempj="";
        int flag=0;
		for (int i = 0; i < num.length(); i++) {
            count=0;
			for (int j = 0; j < num.length(); j++) {
				tempind="";
				tempind+=i;
				tempj="";
				tempj+=num.charAt(j);
				if(tempind.equalsIgnoreCase(tempj)) {
					count++;
				}
			}
			if(num.charAt(i)-'0'!=count) {
				flag=1;
			}
		}
        if(flag==1){
            return false;
        }else{
            return true;
        }
    }

}
