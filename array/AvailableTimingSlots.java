package com.array;

import java.util.Arrays;

public class AvailableTimingSlots {
	
	public static void main(String[] args) {
		
		int start[]= {0 ,6, 8, 12,20};
		int end[]=   {4 ,8, 10,16,24};
		
		int[] x=new int[3];
		int[] y=new int[3];

		int si=0;
		int ei=0;

		for(int i=0;i<start.length-1;i++) {
			if(end[i]!=start[i+1]) {
				x[si++]=end[i];
				y[ei++]=start[i+1];
			}
		}
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
			
	}

}
