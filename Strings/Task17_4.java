package com.pack1.Arrays;

public class Task17_4 {

	public boolean firstLast(int[] nums) {
		if(nums[0]==6||nums[nums.length-1]==6) {
			return true;
		}
		return false;
	}public static void main(String[] args) {
		Task17_4 t17=new Task17_4();
		int[] input= {6,5,8,25,589,4458,6};
		boolean result=t17.firstLast(input);
		System.out.println(result);
	}
}
