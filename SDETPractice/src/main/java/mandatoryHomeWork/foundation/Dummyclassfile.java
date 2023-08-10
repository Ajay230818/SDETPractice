package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Dummyclassfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefgh";
		String repchars="";
		List<String> lisrepcharstring=new ArrayList<String>();
		int count=0;
		Set<Character> dupele=new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(dupele.add(s.charAt(i))) {
				repchars=repchars+s.charAt(i);
			}else {
				lisrepcharstring.add(repchars);
				i=i-1;
				repchars="";
				dupele.clear();
			}
			}
	for (int i = 0; i < lisrepcharstring.size(); i++) {
		if(lisrepcharstring.get(i).length()>count) {
			count=lisrepcharstring.get(i).length();
		}
	}
	System.out.println(count);
	}

}
