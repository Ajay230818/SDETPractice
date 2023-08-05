package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Q3823ReverseAstring {
	
	/*
	 * @Test() public void test1() { Assert.assertEquals ("olleh", revstring(new
	 * char [] {'h','e','l','l','o'})); }
	 */
	 

	public static void main(String  [] args) {
		// TODO Auto-generated method stub
		char [] s = {'h','e','l','l','o'};
		for (int i = 0, j = s.length - 1; i < j; ++i, --j) {
            char t = s[i];
            System.out.println(t);
            s[i] = s[j];
            s[j] = t;
            System.out.println(s[i]);
            System.out.println(s[j]);
            System.out.println(t);
		}
        // At this point, the character array 's' contains the reversed string.
		System.out.println(Arrays.toString(s));
	

}
}
