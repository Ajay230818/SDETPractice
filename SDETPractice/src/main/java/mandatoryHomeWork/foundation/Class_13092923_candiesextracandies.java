package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class_13092923_candiesextracandies {
	
		//Pseudo code:
		//1.create an empty Boolean list  , int maxcandy
		//2.declare 2 for loop , iterate through 1 st for loop and find which is max candy and iterate through the 2 loop and check below condition
		//3.get the candies[i] and add the extracandies to it
		//4.check if candies[i]+extracandies is greater than or equal to maxcandy.
		//5.if its greater return true to the Boolean list else return false
		//6.return the Boolean list .

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] candies = {12,1,12};
		int extraCandies=10;
		List<Boolean> kwithcan=new ArrayList<Boolean>();
		int maxcandy = 0;
		for(int i = 0; i < candies.length; i++) {
            if(candies[i] > maxcandy)
            	maxcandy = candies[i];
        }
		for (int i = 0; i < candies.length; i++) {
			if(candies[i]+extraCandies>=maxcandy) {
				kwithcan.add(i, true);
			}else {
				kwithcan.add(i, false);
			}
		}
		System.out.println(kwithcan);
	}

}
