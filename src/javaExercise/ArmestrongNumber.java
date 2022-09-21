package javaExercise;

import java.util.Scanner;

public class ArmestrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		//System.out.println("Enter Number = "+n);
		int t1 = n;
		int length = 0;
		int t2 = n;
		int remender;
		int arm = 0;
		while (t1 != 0) {
			t1 = t1 / 10;
			length = length + 1;
		}
		System.out.println("length of n =" + length);
		while (t2 != 0) {
			remender = t2 % 10;
			int mul = 1;
			for (int i = 1; i <= length; i++) {
				mul = mul * remender;
			}
			arm = arm + mul;
			t2 = t2 / 10;
		}
		if (arm == n) {
			System.out.println(n + " is armstrong number");
		} else {
			System.out.println(n + " is not armstrong number");
		}
	}

}
