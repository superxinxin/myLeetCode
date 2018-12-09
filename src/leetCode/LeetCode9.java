package leetCode;

public class LeetCode9
{
	public boolean isPalindrome(int x) 
	{
		//x<0��Ϊ0ʱ��0��β����Ȼ������
		if(x<0 || (x%10==0&&x!=0))
		{
			return false;
		}
		else
		{
			//y��¼��һ�뷴ת��Ľ����while������y==x��y>xһλ�м����
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
