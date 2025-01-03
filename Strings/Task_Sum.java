package com.pack1.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Task_Sum {
	static int sum;
	void meth1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ArraySize");
		int arrSize=sc.nextInt();
		int[] arr=new int[arrSize];
        System.out.println("Enter the Array Numbers");
        for(int i=0;i<arrSize;i++) {
        	arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
        	sum+=arr[i];
        }
        System.out.println("Sum:"+sum);
        System.out.println(Arrays.toString(arr));
		sc.close();
	}
	public static void main(String[] args) {
		System.out.println("Start");
		new Task_Sum().meth1();
	}

}
