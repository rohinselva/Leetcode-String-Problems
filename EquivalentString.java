package Practice;

public class EquivalentString 
{
	public static void main(String args[])
	{
		String[] s1={"ab","c"};
		String[] s2= {"ac","bc"};
		equivalentString(s1,s2);
	}

	private static void equivalentString(String[] s1, String[] s2) 
	{
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		for(String s:s1)
		{
			sb1.append(s);
		}
		for (String s : s2) 
        {
            sb2.append(s);
        }
        if(sb1.toString().equals(sb2.toString()))
        {
        	System.out.println("TRUE");
        }
        else
        {
        	System.out.println("FALSE");
        }
	}
}
