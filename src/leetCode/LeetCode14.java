package leetCode;

import java.util.HashSet;

public class LeetCode14
{
	public static void main(String[] args)
	{
		String[] strs = new String[] {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) 
	{
		if(strs.length == 0)
		{
			return "";
		}
        for(int i=1;i<=strs[0].length();i++)
        {
            String head = strs[0].substring(0,i);
            for(String str:strs)
            {
                if(!str.startsWith(head))
                {
                	return head.substring(0,i-1);
                }
            }
        }
        return strs[0];
		
		
		
		
//		//数组只有一个字符串的情况
//		if(strs.length == 1)
//		{
//			return strs[0];
//		}
//		//index表示字符串中当前截取单个字符的索引
//		//i表示数组中第i个字符串
//		int index = 0;
//		int i=0;
//		while(i<strs.length-1)
//		{
//			//首先判断截取位置是否超过该字符串长度
//			if(index<strs[i].length() && index<strs[i+1].length())
//			{
//				//比较第i个字符串的第index位置字符 与 第i+1个字符串的第index位置字符 是否相等
//				if(strs[i].substring(index, index+1).equals(strs[i+1].substring(index, index+1)))
//				{
//					//如果字符串已经比较到最后位置则index+1， i归零，从头开始 比较下一个位置字符
//					if(i == strs.length-2)
//					{
//						index++;
//						i = 0;
//					}
//					//否则i++，表示接着比较后两个字符串的index位置字符
//					else
//					{
//						i++;
//					}
//				}
//				else
//				{
//					break;
//				}
//			}
//			else
//			{
//				break;
//			}
//		}
//		if(index != 0)
//		{
//			return strs[0].substring(0, index);
//		}
//		else
//		{
//			return "";
//		}
	}
}
