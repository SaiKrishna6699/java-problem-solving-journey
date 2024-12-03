package Ex2_SwapNumbers;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Before swap: " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap: " + a + " " + b);
	}
}
