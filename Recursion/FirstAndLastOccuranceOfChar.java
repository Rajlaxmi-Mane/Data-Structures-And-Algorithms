package Recursion;

public class FirstAndLastOccuranceOfChar {
	public static int first = -1;
	public static int last = -1;

	// function to find first and last ocurance
	public static void findOccurances(String str, int index, char el) {

		// base case condition
		if (index == str.length()) {
			System.out.println("first occurance is at index : " + first);

			System.out.println("last occurance is at index : " + last);
			return;
		}
		char currentChar = str.charAt(index);
		if (currentChar == el) {
			if (first == -1) {
				first = index;
			} else {
				last = index;
			}
		}
		
		// recursive call statement
		findOccurances(str, index + 1, el);
	}

	public static void main(String[] args) {
		String str = "gahaadad";
		char key = 'a';
		findOccurances(str, 0, key);

	}

}
