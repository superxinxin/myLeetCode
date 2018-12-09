package leetCode;

import java.util.HashSet;

public class LeetCode3
{
	public int lengthOfLongestSubstring(String s) 
	{
		//��set�ж��Ƿ����ظ��ַ�����¼����ظ�����
		HashSet<Character> set = new HashSet<Character>();
		int i = 0;
		int j = 0;
		int res = 0;
		while(i<s.length() && j<s.length())
		{
			if(!set.contains(s.charAt(j)))
			{
				set.add(s.charAt(j));
				j++;
				res = Math.max(res, set.size());
			}
			else
			{
				set.remove(s.charAt(i));
				i++;
			}
		}
		return res;
    }
}
