package com.pack1.Arrays;
import java.util.Arrays;
//import java.util.Scanner;

public class Practice {
	static int sum;
	void meth1() {
int[] arr= {10,20,30,40};
for(int i=0;i<arr.length;i++) {
	sum+=arr[i];
}
System.out.println("Sum:"+sum);
System.out.println(Arrays.toString(arr));
System.out.println("average:"+sum/arr.length);
}
	public static void main(String[] args) {
		new Practice().meth1();
	}
}