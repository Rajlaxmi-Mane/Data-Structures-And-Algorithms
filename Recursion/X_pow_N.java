package Recursion;

public class X_pow_N {
	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}else {
			return x*power(x,n-1); 
		}
	}
	
	public static void main(String[] args) {
		int x=2,n=4;
		System.out.println(power(x,n));
		
	}

}
