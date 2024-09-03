package Recursion;

public class towerOfHanoi {
	
	public static void towerOfHanoi(int n,String s, String h, String d) {
		if(n==1) {
			System.out.println("move disk "+n+" from "+s+" to "+d);
			return;
		}
		 
		towerOfHanoi(n-1,s,d,h);
		System.out.println("move disk"+n+" from "+s+" to "+d);
		towerOfHanoi(n-1,h,s,d);
	}
	
	public static void main(String[] args) {
		int n=3;
		towerOfHanoi(n,"source","helper","destination");
		
	}

}