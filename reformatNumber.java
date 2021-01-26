package Practice;

public class reformatNumber 
{
	public static void main(String args[])
	{
		String number="--17-5 229 35-39475 ";
		reformatNumber(number);
	}

	private static void reformatNumber(String number) 
	{
		String update=number.replaceAll("[ -]", "");
		System.out.println("Updated Number - "+update);
		int len=update.length();
		StringBuilder sb=new StringBuilder();
		
		while(len!=0)
		{
			if(len==4)
			{
				sb.append(update.substring(0, 2)).append("-").append(update.substring(2));
				break;
			}
			else if (len >= 3) 
			{
                sb.append(update.substring(0,3));
                update = update.substring(3);
                len -= 3;
                if (len != 0) sb.append("-");
            } 
			else 
            {
			    // n == 2
                sb.append(update);
                break;
            }
        }
              System.out.println("String is - "+sb.toString());
		}
}
