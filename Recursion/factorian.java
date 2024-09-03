package Recursion;
import java.util.Scanner;

public class factorian {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=s.nextInt();
		int fact=fact(num);
		System.out.println(fact);
	}
	public static int fact(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return num*fact(num-1);
		}
	}

}
