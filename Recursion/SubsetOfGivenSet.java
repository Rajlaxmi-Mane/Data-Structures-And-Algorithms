package Recursion;

import java.util.ArrayList;

public class SubsetOfGivenSet {
	
	public static void printSubset(ArrayList<Integer> subset) {
		for(int i=0;i<subset.size();i++) {
			System.out.print(subset.get(i));
		}
		System.out.println();
	}

		public static void findSubset(int n, ArrayList subset) {
			if (n == 0) {
				printSubset(subset);
				return;
			}

			// elements want to add

			subset.add(n);
			findSubset(n - 1, subset);

			// dont want to add
			subset.remove(subset.size() - 1);
			findSubset(n - 1, subset);
		}

		public static void main(String[] args) {

			int n = 3;
			ArrayList<Integer> subset = new ArrayList();
			findSubset(n, subset);

		}

	}

