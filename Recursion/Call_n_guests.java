package Recursion;

public class Call_n_guests {
	
	public static int inviteGuests(int n) {
		
		//base case condition
		if(n<=1) {
			return 1;
		}
		
		// single invitation
		int way1=inviteGuests(n-1);
		
		// pair
		int way2=(n-1)*inviteGuests(n-2);
		
		return way1+way2;
	}
	
	public static void main(String[] args) {
		int n=4;
		System.out.println(inviteGuests(n));
	}

}
