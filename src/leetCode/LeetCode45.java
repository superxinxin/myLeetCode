package leetCode;

public class LeetCode45
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {2,3,1,1,4};
		System.out.println(jump(nums));
	}
	public static int jump(int[] nums) 
	{
//		��̬�滮��gg������ʱ������
//		int[] dp = new int[nums.length];
//		for(int i=0; i<dp.length; i++)
//		{
//			dp[i] = Integer.MAX_VALUE;
//		}
//		dp[0] = 0;
//		for(int i=0; i<nums.length; i++)
//		{
//			int tmp = Math.min(i+nums[i]+1, nums.length);
//			for(int j=i+1; j<tmp; j++)
//			{
//				dp[j] = Math.min(dp[j], dp[i]+1);
//			}
//		}
//		return dp[nums.length-1];
		
		//̰���㷨
		//cur��¼����������Զλ��
		int cur = 0;
		//last��¼�ϴ�����������Զλ��
		int last = 0;
		//step��¼��Ծ����
		int step = 0;
		for(int i=0; i<nums.length; i++)
		{
			//�ϴ�����������Զλ�� ������i��ʱ������last������step+1
			if(last < i)
			{
				last = cur;
				step++;
			}
			//cur��¼��ʱ����������Զλ��
			cur = Math.max(cur, nums[i]+i);
		}
		return cur < nums.length - 1 ? -1 : step;
	}
}
