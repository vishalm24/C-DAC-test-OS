package com.demo.main;

import java.util.Arrays;

public class demo {

	public static void main(String[] args) {
		
		int[] arr = {15,12,84,65,75,14};

		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
			else if(arr[i] < min)
				min = arr[i];
		}
		int diff=max-min;
		System.out.println("Largest value of from array: "+max);
		System.out.println("Largest value of from array: "+min);
		System.out.println("Difference between max and min value from array : "+diff);
	}
}
	
	
	