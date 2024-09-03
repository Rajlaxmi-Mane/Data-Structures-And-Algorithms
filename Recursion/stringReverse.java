package Recursion;

public class stringReverse {
	public static void rev(String s,int n) {
		if(n<0) {
			return;
		}
		System.out.print(s.charAt(n));
		rev(s,n-1);
	}
	
	public static void main(String[] args) {
		String s="ilihtiam";
		rev(s,s.length()-1);
		
	}

}
