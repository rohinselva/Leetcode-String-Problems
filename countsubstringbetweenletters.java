package Practice;

public class countsubstringbetweenletters 
{
	public static void main(String args[])
	{
		String str="abbccca";
		countTheString(str);
	}

	private static void countTheString(String str)
	{
		int count=0;
		int ans=-1;
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count=j-i-1;
				}
			}
			if(ans<count)
			{
				ans=count;
			}
		}
		System.out.println("The count is - "+ans);
	}

}
