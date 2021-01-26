package Practice;

import java.util.ArrayList;

public class stringMatchingArray 
{
	public static void main(String args[])
	{
		String[] str= {"mass","as","hero","superhero"};
		matchStringArray(str);
	}

	private static void matchStringArray(String[] str) 
	{
		ArrayList<String> list=new ArrayList<String>();
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length;j++)
			{
				if(str[i].length()>=str[j].length())
				{
					continue;
				}
				
				if(str[j].contains(str[i]))
				{
					list.add(str[i]);
					break;
				}
			}
		}
		System.out.println("The obtained list is - "+list);
	}

}
