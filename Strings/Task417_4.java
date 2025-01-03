package com.pack1.Arrays;

public class Task417_4 {
	public boolean commonEnd(int[] a,int[] b) {
		if(a[0]==b[0]||a[a.length-1]==b[b.length-1])
			return true;
		return false;
	}public static void main(String[] args) {
		Task417_4 t4=new Task417_4();
		int[] iinput1= {1,2,3};
		int[] input2= {7,6};
		boolean result=t4.commonEnd(iinput1, input2);
		System.out.println(result);
	}

}
