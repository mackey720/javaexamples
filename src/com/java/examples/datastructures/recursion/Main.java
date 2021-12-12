package com.java.examples.datastructures.recursion;

public class Main {
	
	public static void main (String[] args) {
		
		Main main = new Main();
//		var rec = main.factorial(4);
//		System.out.println(rec);
//		
		
		//var fib = main.fibonacci(4);
		//var result = main.sumOfDigits(54);
		//var result = main.power(-2, 2);
		var result = main.decimalToBinary(-13);
		System.out.println(result);
		
	}
	
	public int factorial(int n) {
		if (n < 1) {
			return -1; 
		}
		if(n ==0 || n==1) {
			return 1; 
		}
		return n *factorial(n-1);
	}
	
	public int fibonacci(int n) {
		
		if (n < 1) {
			return -1; 
		}
		if(n==0 || n ==1) {
			return n; 
		}
		System.out.println(fibonacci(n-1) + fibonacci(n-2));
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public int sumOfDigits(int n) { //sum of the digits in a number
		if(n<0 || n==0) {
			return 0; 
		}
		return n%10 + sumOfDigits(n/10);
	}
	
	public int power(int base, int exp ) { //calculate power of a number using recursion
		if (exp == 0) {
			return 1;
		}else if(exp < 0) {
			return -1; 
		}
		return base * power(base, exp-1);
	}
	
	public int gcd(int a , int b) {//greatest common divisor (GCD) of two positive numbers using recursion
		if (b == 0 ) { //Elidean Algorithm
			return a;
		} else if (a <0 || b<0) {
			return -1;
		}
		return gcd(b , a%b);
	}
	
	public int decimalToBinary(int n) { //convert a number from decimal to binary using recursion
		if (n == 0 ) {
			return 0; 
		}
		return n%2  + 10*decimalToBinary(n/2);
	}

}
