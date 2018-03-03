package com.n2s;

import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number:");
		int a=obj.nextInt();
		obj.close();
if(a%2==0) {
	System.out.println("Even");
}
else {
	System.out.println("not even");
}
	}

}
