package com.org.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Ch03LongestSubstring {

	public static void main(String[] args) {
		String str = "abcddcba";
		StringBuffer sb = new StringBuffer();
		List<StringBuffer> linkedListSb = new LinkedList<>();
		for(int i=0;i<str.length();i++) {
				if(i!=str.length()-1) {
					if(str.charAt(i)==str.charAt(i+1)) {
						sb.append(str.charAt(i));						
						linkedListSb.add(sb);
						sb = new StringBuffer();
						}
					else {
						if(!(sb.toString().contains(String.valueOf(str.charAt(i))))) {
							sb.append(str.charAt(i));
						}
						else {
							linkedListSb.add(sb);
							sb = new StringBuffer();
							sb.append(str.charAt(i));
					}
				}		
			}
				else {
					sb.append(str.charAt(i));
					linkedListSb.add(sb);
				}
		}
		System.out.println(linkedListSb);
		int longestSubstringLength=0;
		String longestSubstring="";
		for(int i=0;i<linkedListSb.size();i++) {
			if(linkedListSb.get(i).length()>longestSubstringLength) {
				longestSubstring=linkedListSb.get(i).toString();
				longestSubstringLength=linkedListSb.get(i).length();
			}
		}
		System.out.println("Longest Substring is "+longestSubstring+ " with a length of "+longestSubstringLength);
	}
}
