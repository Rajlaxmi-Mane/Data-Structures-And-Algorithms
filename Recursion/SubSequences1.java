package Recursion;

public class SubSequences1 {

	public static void subsequences(String str, int index, String newStr) {
		// base case condition
		if (index == str.length()) {
			System.out.println(newStr);
			return;
		}
		char currentChar = str.charAt(index);

		// to be selected
		subsequences(str, index + 1, newStr + currentChar);

		// to be not selected
		subsequences(str, index + 1, newStr);

	}

	public static void main(String[] args) {
		String str = "abc";
		subsequences(str, 0, "");
	}

}
