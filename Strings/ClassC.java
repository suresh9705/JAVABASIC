package com.pack1.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ClassC {
	Scanner sc=new Scanner(System.in);
	void ticketBokking(String  ticket) {
		System.out.println("Enter the Movie Name");
		String movie=sc.nextLine();
		System.out.println("How many tickets u need for"+movie);
		int tickets=sc.nextInt();
		String[] names=new String[tickets];
		System.out.println("enter"+names.length+"names");
		for(int i=0;i<names.length;i++) {
			names[i]=sc.next();
		}
		System.out.println("\n"+names.length+"tickets were booked for"+Arrays.toString(names));
		System.out.println("\n Which row you need?");
		System.out.println("Select row b/w Ato Z");
		String row=sc.next();
		int count=1;
		System.out.println("\n Your tickets are Conformed below is your Seat Number");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+"-"+row+" "+ count++);
		}
	}
	void meth2() {
		System.out.println("meeth2() called");
		System.out.println("How many Numbers you want tickets");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+"numbers");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("numbers entered by the you:"+Arrays.toString(arr));
		int count=0;
		for(int x:arr) {
			if(x%2==0) {
				System.out.println(x);
				count++;
			}
		}
		System.out.println("There are "+count+"even numbers in the given Array");
	}
	public static void main(String[] args) {
		ClassC coj=new ClassC();
	//	coj.ticketBokking("rao");
		coj.meth2();
	}

}
