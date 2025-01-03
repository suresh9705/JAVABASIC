package com.pack1.Arrays;

public class Task217_4 {
	public boolean samefirstLas(int[] nums) {
		if(nums.length>=1) {
			if(nums[0]==nums[nums.length-1]) {
				return true;}
		}
		return false;
	}public static void main(String[] args) {
		Task217_4 t2=new Task217_4();
		int[] nums= {10,20,30,520,480,10};
		boolean result=t2.samefirstLas(nums);
		System.out.println(result);
	}
}
