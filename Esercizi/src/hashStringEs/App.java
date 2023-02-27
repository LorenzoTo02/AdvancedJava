package hashStringEs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		String s = "abcAbc";
		String s2 = "abcdbc";
		System.out.println(findDuplicate(s));
		System.out.println(findDuplicate(s2));
		
	}
	
	public static int findDuplicate(String s) {
		Set<Character> sChar = new HashSet<>();
		char[] chars = s.toLowerCase().toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(!sChar.add(chars[i])) {
				System.out.println(sChar);
				return i+1;
			}
		}
		System.out.println(sChar);
		return -1;
	}

}
