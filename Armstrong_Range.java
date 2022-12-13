package com.surya_code.corejavapack;

import java.util.Scanner;

class Count{
	
	public static int countNum(int num) {
		
		int length = 0;
		while(num > 0) {
			
			num /= 10;
			length++;	
		}
		return length; 
	}
	public static int power(int base,int exp) {
		
		int pow = 1;
		for(int i=1; i<=exp; i++)pow *= base;
		return pow;
	}
	public static int armstrong(int num) {
		
		int a = countNum(num);
		int result;
		for(result=0; num > 0; num/=10)result += power(num % 10,a);
		return result;
	}
	public static void range(int d, int e) {
		
		for(int i=d; i<=e; i++)
			if(i == Count.armstrong(i))
				System.out.println(i);
	}
}

public class Armstrong_Range {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lower range : ");
		int l = sc.nextInt();
		System.out.print("Enter the upper range : ");
		int u = sc.nextInt();
		
		Count.range(l,u);
		
	}
}
