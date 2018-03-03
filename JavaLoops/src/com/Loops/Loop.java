package com.n2s;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your age:");
		int a=obj.nextInt();
		obj.close();
		if(a>=18) {
			System.out.println("you are eligible to vote");
		}
		else {
		
		
			System.out.println("not eligible");
		}

	}

}
