package leetCode;

public class LeetCode12
{
	//ͨ�ýⷨ
	public String intToRoman(int num) 
	{
		StringBuilder sb = new StringBuilder();
		char[] roman = new char[] {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
		int[] value = new int[] {1000, 500, 100, 50, 10, 5, 1};
		//���������x<4, x==4, x>4&&x<9, x==9
		for(int i=0; i<7; i=i+2)
		{
			//ȡ��Ӧ��һλ�ϵ�����x
			int x = num / value[i];
			//x<4�����ظ��Ӷ�Ӧ������ĸ
			if(x < 4)
			{
				for(int j=0; j<x; j++)
				{
					sb.append(roman[i]);
				}
			}
			//x==4�����Ӷ�Ӧ��һλ������ĸ��ǰһλ����ʾ5��1
			else if(x == 4)
			{
				sb.append(roman[i]).append(roman[i-1]);
			}
			//x>4 && x<9��������ǰһλ��Ӧ��5���ظ���ʣ��������ĸ
			else if(x>4 && x<9)
			{
				sb.append(roman[i-1]);
				for(int j=6; j<=x; j++)
				{
					sb.append(roman[i]);
				}
			}
			//x==9�����Ӷ�Ӧ��һλ������ĸ��ǰһλ����ʾ10��1
			else if(x == 9)
			{
				sb.append(roman[i]).append(roman[i-2]);
			}
			//���ȡ��������ѭ������
			num = num%value[i];
		}
		return sb.toString();
	}
}
