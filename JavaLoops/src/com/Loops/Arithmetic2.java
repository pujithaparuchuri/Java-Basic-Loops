package com.n2s;

import java.util.Scanner;

public class Arithmetic2 {

	public static void main(String[] args) {
		System.out.println("Enter value A:");
		Scanner obj = new Scanner(System.in);
		float a=obj.nextFloat();
		System.out.println("the value of A before adding:"+a);
		obj.nextLine();
		System.out.println("Enter value B:");
		float b=obj.nextFloat();
		obj.close();
		float c=a+b;
		System.out.println("The value of A after adding is:"+c);
		

	}

}
