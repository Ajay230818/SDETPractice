package mandatoryHomeWork.foundation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q16assigncookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] g= {10,7,8,9};
		int []s= {5,6,9,10};
		int count=0; 
		int candyiterate=0;

		Arrays.sort(g);//    7 8 9 10
		Arrays.sort(s); //   5 6 9 10

		for (int i=0; i<g.length;i++)
		{
			while(candyiterate<s.length)
			{ 
				if(s[candyiterate]>=g[i])
				{
					count++;
					candyiterate++;
					break;
				}
				candyiterate++;
			}
		}

		System.out.println(count);

	}

}
