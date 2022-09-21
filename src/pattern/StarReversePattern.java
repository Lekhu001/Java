package pattern;

public class StarReversePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,row=5;
		for(x=row;x>0;x--)
		{
			for(y=x;y>0;y--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
