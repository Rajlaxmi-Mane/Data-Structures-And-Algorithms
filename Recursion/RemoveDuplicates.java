package Recursion;

public class RemoveDuplicates {
	public static boolean map[] = new boolean[26];

	public static void removeDuplicates(String str, int index, String newString) {

		// base case condition
		if (index == str.length() - 1) {
			System.out.println(newString);
			return;
		}

		char currentChar = str.charAt(index);

		// checking character is already present or not
		if (map[currentChar - 'a'] == true) {
			removeDuplicates(str, index + 1, newString);
		} else {
			// if character is not present then add to new string
			newString += currentChar;
			map[currentChar - 'a'] = true;
			removeDuplicates(str, index + 1, newString);
		}

	}

	public static void main(String[] args) {
		String str = "aabbccddee";
		removeDuplicates(str, 0, "");
	}

}
