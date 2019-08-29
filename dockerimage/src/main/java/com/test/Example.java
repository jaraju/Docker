package com.test;

import java.util.HashMap;
import java.util.Map;

public class Example {
	public static void main(String[] args) {
	String input="rajuansarijus";
		int len = input.length();
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(int i =0;i<len;i++) {
			Character c = input.charAt(i);
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else{
				charMap.put(c,1);
			}
		}
		charMap.forEach((k,v)->{
			if(v>1)System.out.print(k +" ");
		});
	}
}