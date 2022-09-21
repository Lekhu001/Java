package pattern;

public class PalindromNumber 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	int number=120;
	int temp=number;
	int rev=0,reminder;
	while(temp!=0)
	{
		reminder=temp%10;
		rev=rev*10+reminder;
		temp=temp/10;
	}
	if(number==rev)
	{
		System.out.println(number+" is palindrom Number");
	}
	else
	{
		System.out.println(number+" is not palindrom Number");
	}
	}
	
}
