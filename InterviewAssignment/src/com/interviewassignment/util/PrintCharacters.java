package com.interviewassignment.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintCharacters {
	static Character[][] charMap;

	/**
	 * generates list of words, based on the input character
	 * @param numbers
	 * @param length
	 * @param index
	 * @param s
	 * @return
	 * @author Neetha Tipparthi
	 */

	private static ArrayList<String> printWords(int[] numbers, int length, int index, String s) {
		if (length == index) {
			return new ArrayList<>(Collections.singletonList(s));
		}

		ArrayList<String> stringList = new ArrayList<>();

		for (int i = 0; i < charMap[numbers[index]].length; i++) {
			String sCopy = String.copyValueOf(s.toCharArray());
			sCopy = sCopy.concat(charMap[numbers[index]][i].toString());
			stringList.addAll(printWords(numbers, length, index + 1, sCopy));
		}
		return stringList;
	}

	public static void printWords(int[] numbers) {
		charMap = CharacterMap.getCharForNum();
		List<String> stringList = printWords(numbers, numbers.length, 0, "");
		stringList.stream().forEach(System.out::println);
	}

}
