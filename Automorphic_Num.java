package com.surya_code.corejavapack;
import java.util.Scanner;

public class Automorphic_Num {
	
	static int power(int base,int exp) {
		int pow = 1;
		for(int i = 1; i <= exp; i++) {
			pow *= base;
		}
		return pow;
	}
	static int length(int num) {
		int count = 0;
		while(num >0) {
			count ++;
			num /= 10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			for(;;) {
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			if(num < 0)System.out.println("Please dont give negetive number ");
			else {
				int powResult = power(num,2);
				int len = length(num);
				int result = powResult % power(10,len);
				if(num == result)System.out.println("Automorphic number");
				else System.out.println("Not an Automorphic number");
				System.out.println("If you want to execute Y/N");
				char ch = sc.next().charAt(0);
				if(ch == 'y' || ch == 'y')continue;
				else {
					System.out.println("Thank you....!");
					break;
				}
			}
		}
	}
}
