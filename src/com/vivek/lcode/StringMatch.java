package com.vivek.lcode;

class StringMatch {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "lla";

		System.out.println(new StringMatch().strStr(s1, s2));
	}

	public int strStr(String haystack, String needle) {
		if (needle.isEmpty())
			return 0;

		char[] input = haystack.toCharArray();
		char[] search = needle.toCharArray();
		int index = -1;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == search[0]) {
				int k = i;
				boolean match = true;
				for (int j = 0; j < search.length; j++) {
					if (k<input.length && search[j] == input[k]) {
						k++;
					} else {
						match = false;
						break;
					}
				}
				
				if (match) {
					index = i;
					break;
				}
			}
		}

		return index;

	}
}