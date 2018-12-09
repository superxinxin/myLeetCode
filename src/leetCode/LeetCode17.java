package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode17
{
	public List<String> letterCombinations(String digits) 
	{
		List<String> res = new ArrayList<String>();
		//���ݷ���ֹ����
		if(digits.length() == 0)
		{
			return res;
		}
		String[] strs = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		//���ݣ��ββ���ȡ��ĩβ�ַ�
		List<String> list = letterCombinations(digits.substring(1, digits.length()));
		//�ַ�����ȡ�����ֶ�Ӧ���ַ�����
		char[] c = strs[digits.charAt(0)-'2'].toCharArray();
		//list����Ϊ0����ʾ��һ����ݣ�list��ʱ����ÿ���ַ���Ϊ�ַ����������б�res
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
			//list���Ȳ�Ϊ0������ǰ�ַ������б�res��ÿ���ַ���ǰ�����������ַ����ټ���res
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
