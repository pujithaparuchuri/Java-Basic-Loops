package com.n2s;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first number");
		int x=obj.nextInt();
		obj.nextLine();
		System.out.println("Enter second number");
		int y= obj.nextInt();
		obj.close();
		
		
			int a=x+y;
		System.out.println("Addition"+a);
		int b=x*y;
		System.out.println("Multiplication"+b);
		int c=x-y;
		System.out.println("Subtraction"+c);
		int d=x%y;
		System.out.println("Division"+d);
		
		

	}
	

}
