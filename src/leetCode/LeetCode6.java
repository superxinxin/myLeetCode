package leetCode;

import java.util.ArrayList;

public class LeetCode6
{
	public String convert(String s, int numRows) 
	{
		if(numRows == 1)
		{
			return s;
		}
		//list里有Math.min(numRows, s.length())行，对每行append字符
		ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
		for(int i=0; i<Math.min(numRows, s.length()); i++)
		{
			list.add(new StringBuilder());
		}
		//goingDown记录往上或往下，curRow记录当前行
		boolean goingDown = false;
		int curRow = 0;
		//根据goingDown和curRow两个变量将字符append到list中对应行的StringBuilder
		for(char c : s.toCharArray())
		{
			list.get(curRow).append(c);
			//临界条件改变goingDown，所以goingDown初始为false
			if(curRow==0 || curRow==numRows-1)
			{
				goingDown = !goingDown;
			}
			//curRow根据goingDown更新
			curRow += goingDown==true ? 1:-1;
		}
		StringBuilder res = new StringBuilder();
		for(StringBuilder sb : list)
		{
			res.append(sb);
		}
		return res.toString();
    }
}
