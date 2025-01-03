package com.pack1.Arrays;

import java.util.Arrays;

public class Int_Arrays {
	int[] meth1(int[] arr1,int[] arr2) {
		int[] merge=new int[(arr1.length+arr2.length)];
		int i=0;
		for(;i<arr1.length;i++) {
			merge[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;i++,j++) {
			merge[i]=arr2[j];
		}
		return merge;
	}public static void main(String[] args) {
		Int_Arrays ia=new Int_Arrays();
		int[] input1= {10,20,30};
		int input2[]= {100,200,300};
		int[] result=ia.meth1(input1, input2);
		System.out.println(Arrays.toString(result));
	}

}
