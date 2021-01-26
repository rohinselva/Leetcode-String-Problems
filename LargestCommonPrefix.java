package Practice;

public class LargestCommonPrefix 
{
	public static void main(String args[])
	{
		String[] str={"flow","flower","flight"};
		longestCommonPrefix(str);
	}

	private static void longestCommonPrefix(String[] str) 
	{
		if(str.length==0) 
			System.out.println("--");
		String prefix=str[0];
		for(int i=0;i<str.length;i++)
		{
			while(str[i].indexOf(prefix)!=0)
			{
				prefix=prefix.substring(0,prefix.length()-1);
			}
		}
		if(prefix.length()==0)
		{
			System.out.println("NULL");
		}
		else
		{
			System.out.println("The prefix value is - "+prefix);
		}		
	}
}
