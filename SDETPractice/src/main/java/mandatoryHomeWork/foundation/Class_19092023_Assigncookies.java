package mandatoryHomeWork.foundation;

import java.util.Arrays;

public class Class_19092023_Assigncookies {
	public static void main(String [] args) {
		int [] g= {4,5};
		int [] s= {1,2,3,4,5};
		int count=0;
		
		Arrays.sort(g);
		Arrays.sort(s);
		
		int startpointerg=0;
		int startpointers=0;
		
		while(startpointerg<g.length && startpointers<s.length) {
			
			while(startpointers<s.length && s[startpointers]<g[startpointerg])
				startpointers++;
			
			if(startpointers>=s.length)
				break;
			
			count++;
			startpointerg++;
			startpointers++;
			
		}
		System.out.println(count);
	}
}
