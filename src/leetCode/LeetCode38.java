package leetCode;

public class LeetCode38
{
	public static String countAndSay(int n) 
	{
		return deal(n-1, "1");
    }
	public static String deal(int n, String str)
	{
		//递归跳出条件
		if(n == 0)
		{
			return str;
		}
		StringBuilder sb = new StringBuilder();
	    int count = 1;
	    //str长度为1的情况
	    if(str.length() == 1)
	    {
	        sb.append(count).append((str.charAt(0)));
	    }
	    else
	    {
	        for (int i = 0; i < str.length(); i++) 
	        {
	        	//如果count计数已到底，求出此时sb
	            if (i+1 == str.length())
	            {
	                sb.append(count).append(str.charAt(i));
	            }
	            else 
	            {
	            	//相连的数字相等，则计数
	                if(str.charAt(i) == str.charAt(i+1))
	                {
	                    count++;
	                }
	                //不等时往后追加字符
	                else 
	                {
	                    sb.append(count).append(str.charAt(i));
	                    count = 1;
	                }
	            }
	        }
	    }
	    //递归，n--，但sb其实是从n=1开始生成的
	    return deal(--n,sb.toString());
	}
}
