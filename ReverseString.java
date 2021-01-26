package Practice;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String args[])
	{
		System.out.println("Enter the String");
		Scanner scan=new Scanner(System.in);
	    String str=scan.next();
	    
	    char[] ch = str.toCharArray();
		
		if(ch==null)
		{
			return;
		}
		
		int i=0;
		int j=ch.length-1;
		
		while(i<j)
		{
			char c=ch[i];
			ch[i++]=ch[j];
			ch[j--]=c;
		}
		System.out.print(ch);
	}

}
