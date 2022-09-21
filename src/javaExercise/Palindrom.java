package javaExercise;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=sc.nextInt();
		int temp=n;
		int rem;
		int rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==n)
		{
			System.out.println(" numer is Palindrom "+n);
		}
		else
		{
			System.out.println(" numer is not Palindrom ");
		}
	}

}
