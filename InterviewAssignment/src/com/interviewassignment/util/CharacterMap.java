package com.interviewassignment.util;

public class CharacterMap {
	static Character[][] charMap;

	/**
	 * Assigns characters based on the key value pressed
	 * @return
	 * @author Neetha Tipparthi
	 */
	static Character[][] getCharForNum() {
		charMap = new Character[][] { { '\0' }, { '\0' }, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' },
				{ 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' },
				{ 'w', 'x', 'y', 'z' } };
		return charMap;
	}

}
