package leetCode;

import java.util.HashMap;

public class LeetCode13
{
	public static void main(String[] args)
	{
		System.out.println(romanToInt("MCMXCIV"));
	}
	public static int romanToInt(String s) 	
	{
		int res = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('M', 1000);
		map.put('D', 500);
		map.put('C', 100);
		map.put('L', 50);
		map.put('X', 10);
		map.put('V', 5);
		map.put('I', 1);
		for(int i=0; i<s.length(); i++)
		{
			int value = map.get(s.charAt(i));
			if(i==s.length()-1 || map.get(s.charAt(i))>=map.get(s.charAt(i+1)))
			{
				res += value;
			}
			else
			{
				res -= value;
			}
		}
		return res;
    }
}
