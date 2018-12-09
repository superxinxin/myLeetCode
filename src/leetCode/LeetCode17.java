package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode17
{
	public List<String> letterCombinations(String digits) 
	{
		List<String> res = new ArrayList<String>();
		//回溯法终止条件
		if(digits.length() == 0)
		{
			return res;
		}
		String[] strs = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		//回溯，形参不断取最末尾字符
		List<String> list = letterCombinations(digits.substring(1, digits.length()));
		//字符数组取出数字对应的字符数组
		char[] c = strs[digits.charAt(0)-'2'].toCharArray();
		//list长度为0，表示第一层回溯，list空时，将每个字符作为字符串放入结果列表res
		if(list.size() == 0)
		{
			for(char tmp : c)
			{
				StringBuilder sb = new StringBuilder();
				sb.append(tmp);
				res.add(sb.toString());
			}
		}
		else
		{
			//list长度不为0，将当前字符加在列表res中每个字符串前重新生成新字符串再加入res
			for(char tmp1: c)
			{
				for(String tmp2 : list)
				{
					StringBuilder sb = new StringBuilder();
					sb.append(tmp1);
					sb.append(tmp2);
					res.add(sb.toString());
				}
			}
		}
		return res;
    }
}
