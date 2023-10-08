package mandatoryHomeWork.foundation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class QChallenge90_ContainingAllthreecharactersinsubstring {
	
	@Test
	public void test1() {
		Assert.assertEquals(10, mapcontains3substring("abcabc"));
		Assert.assertEquals(10, setcontains3substring("abcabc"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(3, mapcontains3substring("aaacb"));
		Assert.assertEquals(3, setcontains3substring("aaacb"));
	}
    
	@Test
	public void test3() {
		Assert.assertEquals(1, mapcontains3substring("abc"));
		Assert.assertEquals(1, setcontains3substring("abc"));
	}
	
	public static int mapcontains3substring(String s) {
		int k=3;
		int count=0;
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		map.put('a', 0);
		map.put('b', 0);
		map.put('c', 0);
		
		String ip="";
		
		int startpointer=0;
		int endpointer=3;
		
		while(startpointer<s.length()-k+1) {
			while(endpointer<s.length()+1) {
			ip=s.substring(startpointer, endpointer);
			System.out.println(ip);
			for (int i = 0; i < ip.length(); i++) {
				map.put(ip.charAt(i), map.get(ip.charAt(i))+1);
			}
			if(map.get('a')>0 && map.get('b')>0 && map.get('c')>0 )
				count++;
			for (int i = 0; i < ip.length(); i++) {
				map.put(ip.charAt(i), 0);
			}
			endpointer++;
			}
			startpointer++;
			endpointer=startpointer+3;
		}
		return count;
	}
	
	public static int setcontains3substring(String s) {
		int k=3;
		String ip="";
		int count=0;
		
		HashSet<Character> set=new HashSet<Character>();
		
		int startpointer=0;
		int endpointer=3;
		
		while(startpointer<s.length()-k+1) {
			while(endpointer<s.length()+1) {
			ip=s.substring(startpointer, endpointer);
			System.out.println(ip);
			for (int i = 0; i < ip.length(); i++) {
				set.add(ip.charAt(i));
			}
			if(set.size()==3)
				count++;
			set.clear();
			endpointer++;
			}
			startpointer++;
			endpointer=startpointer+3;
		}
		return count;
	}
}
