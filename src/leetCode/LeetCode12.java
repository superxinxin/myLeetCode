package leetCode;

public class LeetCode12
{
	//通用解法
	public String intToRoman(int num) 
	{
		StringBuilder sb = new StringBuilder();
		char[] roman = new char[] {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
		int[] value = new int[] {1000, 500, 100, 50, 10, 5, 1};
		//四种情况，x<4, x==4, x>4&&x<9, x==9
		for(int i=0; i<7; i=i+2)
		{
			//取对应那一位上的数字x
			int x = num / value[i];
			//x<4：即重复加对应罗马字母
			if(x < 4)
			{
				for(int j=0; j<x; j++)
				{
					sb.append(roman[i]);
				}
			}
			//x==4：即加对应高一位罗马字母和前一位，表示5减1
			else if(x == 4)
			{
				sb.append(roman[i]).append(roman[i-1]);
			}
			//x>4 && x<9：即加完前一位对应的5后，重复加剩下罗马字母
			else if(x>4 && x<9)
			{
				sb.append(roman[i-1]);
				for(int j=6; j<=x; j++)
				{
					sb.append(roman[i]);
				}
			}
			//x==9：即加对应高一位罗马字母和前一位，表示10减1
			else if(x == 9)
			{
				sb.append(roman[i]).append(roman[i-2]);
			}
			//最后取余数，再循环计算
			num = num%value[i];
		}
		return sb.toString();
	}
}
