package Practice;

public class ReverseNumber 
{
	public static void main(String args[]) 
	{
		int num=153;
		int sum=0;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		System.out.println("The reverse number is - "+sum);
		
	}

}
