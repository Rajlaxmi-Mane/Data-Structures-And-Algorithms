package com.patterns;
//        a
//       b 1
//      c   2
//     d     3
//    e       4
//   f         5
//    g       6
//     h     7
//      i   8
//       j 9
//        k

public class NumAnAlphPiramid {
	public static void main(String[] args) {
		int num = 1;
		char ch = 'a';
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				if (j == 0) {
					System.out.print(ch);
					ch++;
				} else if (j == i * 2 - 2) {
					System.out.print(num);
					num++;
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		
		//LOWER PART 
		for (int i = 6; i>0; i--) {
			for (int j = 0; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				if (j == 0) {
					System.out.print(ch);
					ch++;
				} else if (j == i * 2 - 2) {
					System.out.print(num);
					num++;
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

}
