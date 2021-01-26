package Practice;

public class validPalindrome 
{
	public static void main(String args[])
	{
		String str="race a car";
		validString(str);
	}

	private static void validString(String str) 
	{
		String finale=str.replaceAll("[-+.^:,\\s]","").toLowerCase();
		
		StringBuilder sb=new StringBuilder();
		sb.append(finale);
		System.out.println("sb value - "+sb);
		
		StringBuilder rev=sb.reverse();
		System.out.println("rev value - "+rev);
		
		if(sb==rev)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
