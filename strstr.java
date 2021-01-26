package Practice;

public class strstr 
{
	public static void main(String args[])
	{
		String m="Hello";
		String n="llo";
		
		compareString(m,n);
	}

	private static void compareString(String m, String n) 
	{
		if (n.isEmpty() || m.equals(n)) 
		{
			System.out.println("-1");
		}
		        for (int i = 0; i <= m.length() - n.length(); i++) 
		        {
		            String evalString = m.substring(i, i + n.length());
		            System.out.println("EvalString value - "+evalString);
		            if (evalString.equals(n)) 
		            {
		    			System.out.println("The total same character is - "+i);
		    		}
		        } 
			}	
	}
	
