package Practice;

public class startsWithString 
{
	public static void main(String args[])
	{
		String sentence="i love eating burger";
		String searchWord = "burg";
		startsWith(sentence,searchWord);
	}
	private static void startsWith(String s, String searchWord)
	{
		String[] tok = s.split(" ");
		int indx = 1;
		for(String sen:tok )
		{
			if(sen.startsWith(searchWord))
			{
				System.out.println("Index value - "+indx);
			}
			indx++;
		}
		System.out.println("-1");
	}
}
