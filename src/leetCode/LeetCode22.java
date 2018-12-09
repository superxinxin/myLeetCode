package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode22
{
	public static void main(String[] args)
	{
		List<String> list = generateParenthesis(3);
		for(String s : list)
		{
			System.out.println(s);
		}
	}
	public static List<String> generateParenthesis(int n) 
	{
		ArrayList<String> list = new ArrayList<String>();
		deal(0, 0, n, "", list);
		return list;
		
    }
	public static void deal(int x, int y, int n, String str, ArrayList<String> list)
	{
		if(str.length() == 2*n)
		{
			list.add(str);
			return;
		}
		if(x < n)
		{
			deal(x+1, y, n, str+"(", list);
		}
		if(y < x)
		{
			deal(x, y+1, n, str+")", list);
		}
	}
}
