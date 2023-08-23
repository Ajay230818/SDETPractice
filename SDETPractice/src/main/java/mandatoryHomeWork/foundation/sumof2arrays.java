package mandatoryHomeWork.foundation;

import java.util.Arrays;
import java.util.Iterator;

public class sumof2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4};
		int [] b= {2,3,4,5};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(i!=j) {
					sum+=b[j];
				}
			}
			sum=sum-a[i];
			a[i]=sum;
			sum=0;
		}
		System.out.println(Arrays.toString(a));
	}

}
