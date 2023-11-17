package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Write anything:");
		String userString = in.nextLine();
		
		in.close();
		
		Map<Character, Integer> charMap = new HashMap<>();
		char[] chars = userString.toCharArray();
		
		for (char c : chars) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		
		for (char key : charMap.keySet()) {
			System.out.println("Character '" + key + "' is present " + charMap.get(key) + " times");
		}
	}
}
