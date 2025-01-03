package com.pack1.Arrays;

import java.util.Arrays;

public class ClassB {
	void meth1() {
		System.out.println("Implementing the JAva Arrays");
		int arr[];
		arr=new int[5];
		int arr2[]=new int[3];   
		int arr3[]={10,20,30,40,50};
		int arr4[]=new int[] {10,20,30,40};
		String s="java";
		System.out.println("\n arr1 length:"+arr.length);
		System.out.println("\n arr2 length:"+arr2.length);
		System.out.println("\n arr3 length:"+arr3.length);
		System.out.println("\n arr4 length:"+arr4.length);
		System.out.println("\n s length:"+s.length());
	
	
		System.out.println("Displaying the Array Contents");
		System.out.println("arr1:=>"+arr);
		System.out.println("arr2:"+arr2);
		System.out.println("arr3:"+arr3);
		System.out.println("arr4:"+arr4);
		System.out.println("\n arr1:"+Arrays.toString(arr));
		System.out.println("arr2:"+Arrays.toString(arr2));
		System.out.println("arr3:"+Arrays.toString(arr3));
		System.out.print("Arr4:"+Arrays.toString(arr4));
		System.out.println("Passing VAlues into Arrays");
		arr[0]=5;
		arr[1]=15;
		System.out.println("\nArr1 retreving:"+Arrays.toString(arr));
		System.out.println("Retreving the values from the Array");
		System.out.println(arr[3]);
		//System.out.println(arr[arr.length]);//it generates  AIOB error
		System.out.println(arr3[arr4.length-arr.length+2]);
		System.out.println(arr3[arr4.length/2]);
		System.out.println(arr4[arr2.length]);
		System.out.println(arr3[arr3.length-1]);
	}
	public static void main(String[] args) {
		new ClassB().meth1();
	}

}
