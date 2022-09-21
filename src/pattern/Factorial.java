package pattern;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, fact = 1;
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		for (i = n; n > 0; n--) 
		{
			fact = fact*n;
		}
		System.out.print("Factorial of number " + fact);
	}

}
