package leetCode;

public class LeetCode9
{
	public boolean isPalindrome(int x) 
	{
		//x<0或不为0时以0结尾，显然不可以
		if(x<0 || (x%10==0&&x!=0))
		{
			return false;
		}
		else
		{
			//y记录后一半反转后的结果，while结束后y==x或y>x一位中间的数
			int y = 0;
			while(x > y)
			{
				y = y*10 + x%10;
				x = x/10;
			}
			return x==y || x==y/10;
		}
    }
}
