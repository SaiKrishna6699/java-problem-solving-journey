package Ex5_LongestSubString;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring {
	public static int lengthOfLongestSubString(String s) {
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		int max_length = 0;
		int start = 0;
		
		for(int end = 0; end < s.length(); end++) {
			char currentChar = s.charAt(end);
			
			if(charMap.containsKey(currentChar)&& charMap.get(currentChar) >= start) {
				start = charMap.get(currentChar) + 1;
			}
			max_length = Math.max(end - start +1, max_length);
			charMap.put(currentChar, end);
		}
		return max_length;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = lengthOfLongestSubString(s);
		
		System.out.println("Length of longest substring is "+ result);
		sc.close();
	}
}
