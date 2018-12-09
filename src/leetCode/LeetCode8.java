package leetCode;

public class LeetCode8
{
	public static void main(String[] args)
	{
		System.out.println(myAtoi(" -91"));
	}
	public static int myAtoi(String str) 
	{
		boolean b = true;
		StringBuilder sb = new StringBuilder();
		str = str.trim();
		if(str!=null && str.length()!=0 && !"+".equals(str) && !"-".equals(str))
		{
			if(str.charAt(0)=='+')
			{
				b = true;
				str = str.substring(1, str.length());
			}
			else if(str.charAt(0)=='-')
			{
				b = false;
				str = str.substring(1, str.length());
			}
		}
		if(str==null || str.length()==0)
		{
			return 0;
		}
		else if(!(str.charAt(0)>='0'&&str.charAt(0)<='9'))
		{
			return 0;
		}
		else
		{
			if(b == true)
			{
				int index = 0;
				while(index<str.length() && (str.charAt(index)>='0'&&str.charAt(index)<='9'))
				{
					sb.append(str.charAt(index));
					if(Long.parseLong(sb.toString())>Integer.MAX_VALUE)
					{
						return Integer.MAX_VALUE;
					}
					index++;
				}
			}
			else
			{
				int index = 0;
				while(index<str.length() && (str.charAt(index)>='0'&&str.charAt(index)<='9'))
				{
					sb.append(str.charAt(index));
					if(0-Long.parseLong(sb.toString())<Integer.MIN_VALUE)
					{
						return Integer.MIN_VALUE;
					}
					index++;
				}
			}
		}
		if(b == true)
		{
			return Integer.parseInt(sb.toString());
		}
		else
		{
			return 0-Integer.parseInt(sb.toString());
		}
    }
}
