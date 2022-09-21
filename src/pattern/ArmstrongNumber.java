package pattern;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123;
		int t1 = n;
		int t2 = n;
		int length = 0;
		int rem;
		//int mul = 1;
		int arm = 0;
		while (t1 != 0) {
			
			length = length + 1;
			t1 = t1/10;
		}
		while (t2 != 0) {
			rem = t2%10;
			int mul = 1;
			for (int i = 1; i <= length; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2 / 10;
		}
		if (arm==n)
		{
			System.out.println("Armstong Number");
		} 
		else {
			System.out.println(" no Armstong Number");
		}
	}
}
