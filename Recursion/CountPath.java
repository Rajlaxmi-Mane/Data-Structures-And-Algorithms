package Recursion;

public class CountPath {

	public static int findPath(int i, int j, int n, int m) {

		if (i == n || j == m) {
			return 0;
		}

		if (i == n - 1 && j == m - 1) {
			return 1;
		}

		// move downwards
		int downPaths = findPath(i + 1, j, n, m);

		// move right

		int rightPaths = findPath(i, j + 1, n, m);

		return downPaths + rightPaths;
	}

	public static void main(String[] args) {
		int n = 3, m = 2;
		System.out.println(findPath(0, 0, n, m));

	}
}
