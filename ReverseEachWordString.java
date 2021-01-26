package Practice;

import java.util.Scanner;

public class ReverseEachWordString 
{
	public static void main(String args[])
	{
		System.out.println("Enter the String");
		Scanner scan=new Scanner(System.in);
	    String s=scan.next(); 
	    
	    //String s="Java is programmable";
	    
		 String[] words = s.split(" ");
	        
	        StringBuilder reversed = new StringBuilder();
	        for(String word : words)
	        {
	            for(int i=word.length()-1;i>=0;i--)
	            {
	                reversed.append(word.charAt(i));
	            }
	            reversed.append(" ");
	        }
	        //delete the last space
	        reversed.deleteCharAt(reversed.length()-1);
	        System.out.println("The reversed string is "+reversed.toString());
	}


}
