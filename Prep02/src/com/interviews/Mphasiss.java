package com.interviews;

import java.util.HashMap;
import java.util.Map;

public class Mphasiss { // LongestSubstringStream

	public static void main(String[] args) {
		String s = "abcdakrishnakishore";
		String result = "";
		Map<Character, Integer> visted = new HashMap<Character, Integer>();
		for (int i = 0, j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if (visted.containsKey(c)) {
				i = Math.max(visted.get(c) + 1, i);
			}
			if (result.length() < j - i + 1) {
				result = s.substring(i, j + 1);
			}
			visted.put(c, j);
		}
		System.out.println("Length of longest substring with out repetion: "+result);
	}

}
