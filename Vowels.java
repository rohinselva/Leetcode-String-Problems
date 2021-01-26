package Practice;

import java.util.Scanner;

public class Vowels 
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=scan.nextLine();
		String str2=str1.replaceAll("[aieouAEIOU]", "");
		
		System.out.println("Updated String - "+str2);
		
	}

}
