package mandatoryHomeWork.foundation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q16assigncookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] g= {10,7,8,9};
		int []s= {5,6,7,8};
		Arrays.sort(g);
		Arrays.sort(s);
		int count=0;
		/*
		 * HashSet<Integer> dup=new HashSet<Integer>(); for (int i = 0; i <= g.length-1;
		 * i++) { for (int j = 0; j <= s.length-1; j++) { if((s[j]>=g[i]) && s[i]!=s[j]
		 * ) { count++; } } } System.out.println(count);
		 */
		System.out.println(Arrays.toString(g));
		System.out.println(Arrays.toString(s));

	}

}
