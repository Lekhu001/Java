package pattern;

public class Fabonicseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1,c;
		for(int i=0;i<=10;i++)
		{
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}

	}

}
