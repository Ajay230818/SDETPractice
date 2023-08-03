package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Q2323Addingnumber {
	int num=1234;
	int sum=0;
	
	@Test
	public void test1() {
		Assert.assertEquals(1, addDigits(1234));
	}
	
	public int addDigits(int num) {
        while(num>9)num=check(num);
        return num;
    }

    public int check(int num){
        int n=0;
        while(num!=0){
            n+=num%10;
            num/=10;
        }
        return n;
    }

}
