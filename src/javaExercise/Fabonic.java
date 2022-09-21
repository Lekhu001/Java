package javaExercise;

import java.util.Scanner;

public class Fabonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number = ");
		int number = sc.nextInt();
		int a = 0, b = 1;
		int c, i,d;
		int sum=0;
		for (i = 1; i <= number; i++) {
			c = a + b;
			System.out.print(c);
			sum=sum+c;
			
			a = b;
			b = c;
		}
		System.out.println();
		System.out.println("Total sum of febonic Series = "+sum);
		
		
	}

}
