package com.number_programs;

//adding the squre of each digit and again for result do same if the res is one then the 
//no is happy number

public class HappyNumber {

	public static void main(String[] args) {
		int num = 82; // 82 // 13

		if (isHappy(num))
			System.out.println(num + " is a happy number");
		else
			System.out.println(num + " is not a happy number");
	}

	// isHappy() function will check the no is happy or not

	public static boolean isHappy(int num) {
		int res = num;

		while (res != 1 && res != 4) {
			res = sumOfSquare(res);
		}

		return res == 1;
	}

	// sumOfSquare () function will return the sum of square of each digit
	public static int sumOfSquare(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum += (rem * rem);
			num /= 10;

		}
		return sum;
	}

	// RECURSIVE METHOD TO CHECK THE NUMBER IS HAPPY OR NOT

	public static int happy(int res) {
		if (res == 1 || res == 4)
			return res;
		int num = res;
		int sum = 0;
		while (num != 0) {
			int rem=num%10;
			sum+=rem*rem;
			num/=10;
		}
		return happy(sum);

	}

}
