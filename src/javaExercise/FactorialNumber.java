package javaExercise;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number = ");
int n=sc.nextInt();
int fact=1;
		
		for(int i=n;n>0;n--)	
			{
		fact=fact*n;
	        }
	System.out.print("Print the factorial "+fact);
	}
	}

	
