package mandatoryHomeWork.foundation;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;



public class Qchallenge75_NumberOflinestoWriteString {
	
	@Test
	public void test1() {
		int [] actual=new int [2];
		actual[0]=3;
		actual[1]=60;
		Assert.assertArrayEquals(actual, numberOfLines(new int [] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	public void test2() {
		int [] actual=new int [2];
		actual[0]=2;
		actual[1]=4;
		Assert.assertArrayEquals(actual, numberOfLines(new int [] {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa"));
	}

	public static int[] numberOfLines(int[] widths, String s) {
		int count=0;
		int pixels=100;
		char [] ch= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int [] out=new int[2];
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for (int i = 0; i < widths.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				map.put(ch[i], widths[i]);
			}
		}
		
		for (int i = 0; i < s.length(); i++) {
				pixels-=map.get(s.charAt(i));
				if(pixels==0) {
					count++;
					pixels=100;
				}else if(pixels<0) {
					count++;
					i--;
					pixels=100;
				}
		}
		if(100-pixels>0 && 100-pixels<100) {
			count++;
		}
		out[0]=count;
		if(pixels<100) {
		out[1] = 100 - pixels;}
		else {
			out[1]=100;
		}
		return out;
    }
	}
