package com.n2s;

import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
		String a;
		System.out.println("What is the coreect way to declare an integer value in java");
		System.out.println("a.int1x=10;");
		System.out.println("b.int x=10;");
		System.out.println("c.float x=10.0f;");
		System.out.println("d.string x=10;");
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your choice:");
		 a=obj.nextLine();
		obj.close();
switch (a) {
	case "a": 
		System.out.println("false");
		break;
	case "b":
		System.out.println("true");
		break;
	case "c":
		System.out.println("false");
		break;
	case "d":
		System.out.println("false");
		break;
default:
	System.out.println("false");
	}
	}
}

