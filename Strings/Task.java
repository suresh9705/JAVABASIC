package com.pack1.Arrays;

import java.util.Arrays;

public class Task {
	public int[] meth1(int[] nums) {
		for(int i=0;i<nums.length/2;i++) {
			int temp=nums[i];
			nums[i]=nums[nums.length-i-1];
			nums[nums.length-i-1]=temp;
		}
		return nums;
	}public static void main(String[] args) {
		Task ts=new Task();
		int[] input= {1,52,56,8,58,45,58,5};
		int[] result=ts.meth1(input);
		System.out.println(Arrays.toString(result));
	}

}
