package com.pack1.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_yt {
	Scanner sc=new Scanner(System.in);
	void meth1() {
		System.out.println("Enter the ArraySize");
		int arrSize=sc.nextInt();
		int arr[]=new int[arrSize];
		System.out.println("enter the array values");
		for(int i=0;i<arrSize;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("out pur:"+sum);
		System.out.println(Arrays.toString(arr));
		
	
	}
	public static void main(String[] args) {
		new Task_yt().meth1();
	}
}
