package com.number_programs;

public class FirstN_PerfectNumbers {

	public static void main(String[] args) {
		int count=4;
		
		if(count>=1 && count<=4) {
			int num=1;
			
			while(count>0) {
				int sum=0;
				for(int i=1;i<=num/2;i++) {
					if(num%i==0)
						sum+=i;
				}
				if(sum==num) {
					System.out.println(num);
					count--;
				}
				num++;
			}
			
		}else {
			System.out.println("please enter range between 1 to 4 bcz we just have 4 perfect numbers !!!!!!");
		}

	}

}
