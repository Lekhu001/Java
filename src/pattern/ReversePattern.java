package pattern;

public class ReversePattern {

	public static void main(String[] args) {
		
			int x,y,row=6 ;
			for(x=1;x<=row;x++)
			{
				for(y=2*(row-x);y>0;y--)
				{
					System.out.print(" ");
				}
				for(y=0;y<x;y++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			//System.out.println();
		}
	
	}


