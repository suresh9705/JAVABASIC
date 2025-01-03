package com.pack1.Arrays;

import java.util.Arrays;

public class Task517_4 {
	public int[] rotateLeft3(int[] nums) {
		return new int[] {nums[1],nums[2],nums[0]};
	}public static void main(String[] args) {
		Task517_4 t5=new Task517_4();
		int[] input= {1,2,3};
		int[] result=t5.rotateLeft3(input);
		System.out.println(Arrays.toString(result));
	}

}
