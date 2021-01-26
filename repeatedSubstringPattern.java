package Practice;

public class repeatedSubstringPattern 
{
	public static void main(String args[])
	{
		String str="abcabcabcabc";
		
		subStringPaterrn(str);
	}

	private static void subStringPaterrn(String str) 
	{
		int len=str.length();
		
		for(int i=len/2;i>=1;i--)
		{
			if(len%i==0)
            {
			int num_repeats=len/i;
			String substring =str.substring(0,i);
			StringBuilder sb=new StringBuilder();
			
			for(int j=0;j<num_repeats;j++)
			{
				sb.append(substring);
			}

			if(sb.toString().equals(str))
			{
				System.out.println("TRUE");
			}
		}
		}
	}
}
