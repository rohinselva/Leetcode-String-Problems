package Practice;

public class BalancedString 
{
	public static void main(String args[])
	{
		String s="LLLLRRRR";
		balancedStringSplit(s);
	}

	private static void balancedStringSplit(String s) 
	{
		int balanced = 0, output = 0;
        for(char c: s.toCharArray()) 
        {
            if (c == 'R') balanced++;
            else if (c == 'L') balanced--;
            if (balanced == 0) output++;
        }
        System.out.println("Output is - "+output);
	}

}
