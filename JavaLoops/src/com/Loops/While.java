package com.n2s;

import java.util.Scanner;

public class While {
	Scanner obj1 = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome");
		System.out.println("---------While loop--------");
		While obj = new While();
		obj.whileMethod();
		System.out.println("****************************************");
		System.out.println("----------------do While loop-----------------");
		obj.doWhileMethod();
		System.out.println("****************************************");
		System.out.println("----------------for loop-----------------");
		obj.forMethod();
	}

	public void whileMethod() {
		int i = 1;
		System.out.println("Enter First Number:");

		int a = obj1.nextInt();
		obj1.nextLine();

		
			while (i >= 1 && i <= 10) {

				int x = i * a;
				System.out.println(a + "*" + i + "=" + x);
				i++;
			}
		} 
		
	

	public void doWhileMethod() {
		int j = 1;
		System.out.println("Enter Second Number:");

		int b = obj1.nextInt();

		obj1.nextLine();

		
			do {

				int y = j * b;
				System.out.println(b + "*" + j + "=" + y);
				j++;
			} while (j >= 1 && j <= 10);
		} 
		
	

	public void forMethod() {

		System.out.println("Enter third number:");

		int c = obj1.nextInt();
		obj1.close();
		

			for (int k = 1; k<= 10; k++) {
				int z = k * c;
				System.out.println(c+"*"+k+"="+z);
			
			

			
			  } 
			  System.out.println("***********************************");
			 
		}
	}

