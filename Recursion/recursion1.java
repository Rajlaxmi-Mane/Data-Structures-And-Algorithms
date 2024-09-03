package Recursion;
import java.util.Scanner;

public class recursion1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		print(n);
	}
	public static void print(int n) {
		System.out.println(n);
		if(n>0) {
		print(n-1);
		}else {
			return;
		}
		System.out.println(n);
	}

}
