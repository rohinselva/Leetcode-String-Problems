package Practice;

public class lengthLastWord 
{
	public static void main(String args[])
	{
		String str="Caren Felicia";
		findLastCount(str);
	}

	private static void findLastCount(String str) 
	{
		String[] count=str.split(" ");
		String finale=count[count.length-1];
		System.out.println("The lenght of the final word is - "+finale.length());
	}

}
