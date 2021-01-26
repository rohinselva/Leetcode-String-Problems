package Practice;

public class stringHalves 
{
	public static void main(String args[])
	{
		String s="book";
		stringHalves(s);
	}

	private static void stringHalves(String s) 
	{
		String first = s.substring(0, s.length()/2);
        String second = s.substring(s.length()/2);
        int firstVowels = 0;
        int secondVowels = 0;
        for(int i=0; i<s.length()/2; i++) 
        {
            if("AEIOUaeiou".indexOf(first.charAt(i)) >= 0) 
            {
                firstVowels++;
            }
            if("AEIOUaeiou".indexOf(second.charAt(i)) >= 0) 
            {
                secondVowels++;
            }
        }
		if(firstVowels==secondVowels)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");

		}
	}

}
