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
		//list����Math.min(numRows, s.length())�У���ÿ��append�ַ�
		ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
		for(int i=0; i<Math.min(numRows, s.length()); i++)
		{
			list.add(new StringBuilder());
		}
		//goingDown��¼���ϻ����£�curRow��¼��ǰ��
		boolean goingDown = false;
		int curRow = 0;
		//����goingDown��curRow�����������ַ�append��list�ж�Ӧ�е�StringBuilder
		for(char c : s.toCharArray())
		{
			list.get(curRow).append(c);
			//�ٽ������ı�goingDown������goingDown��ʼΪfalse
			if(curRow==0 || curRow==numRows-1)
			{
				goingDown = !goingDown;
			}
			//curRow����goingDown����
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
