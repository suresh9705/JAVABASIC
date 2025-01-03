package com.pack1.Arrays;

import java.util.Arrays;

public class Task16_4 {
	String[] meth1(int[] arr,boolean[] flag) {
		System.out.println("meth1() called");
		System.out.println("arr;"+Arrays.toString(arr));
		System.out.println("flag:"+Arrays.toString(flag));
		//String[] days= {"sunday","Monday","Tuesday","Fridy","saturday"};
		//return days;
		//return {"sunday","Monday","Tuesday","Fridy","saturday"};//C.E.
		return new String[] {"Sunday","Monday","Tuesday","Wednessday","Thursday","Friday","Saturday"};
	}
	public static void main(String[] args) {
		Task16_4 t16=new Task16_4();
		//int[] input= {10,20,30};
		//boolean[] input2={false,true,false};
		//t16.meth1(input, input2);
		//t16.meth1(new int[] {10,20,30}, new boolean[] {true,false,true});
	//	String[] result=t16.meth1(input, input2);
		//System.out.println("result:"+Arrays.toString(result));
		System.out.println("result:"+Arrays.toString(t16.meth1(new int[] {10,20,30,40}, new boolean[] {true,false,true})));
		
	}

}
