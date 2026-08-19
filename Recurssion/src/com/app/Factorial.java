package com.app;

import java.security.DomainCombiner;
import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		
		if(n==0||n==1) {
			return 1; //base condition-stop the recursion
		}
		return n*factorial(n-1); // recursive call
		
		
	}
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int n = sc.nextInt();
	 int result = factorial(n);  // Upadate parameter stored in int datatype in result variable
	 System.out.println("Factorial="+result);
	 sc.close();
	 
	}

}
