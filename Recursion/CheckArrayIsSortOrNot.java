package Recursion;

public class CheckArrayIsSortOrNot {
	public static boolean flag=false;
	public static boolean check(int[] arr,int index) {
		if(index==arr.length-1) {
			return flag;
		}
		if(arr[index]<arr[index+1]) {
			flag=true;
			return check(arr,index+1);

		}
		else {
			flag=false;
			return flag;
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,5,4,5};
		System.out.println(check(arr,0));
	}

}
