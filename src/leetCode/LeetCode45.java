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
//		动态规划，gg，超出时间限制
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
		
		//贪心算法
		//cur记录能跳到的最远位置
		int cur = 0;
		//last记录上次能跳到的最远位置
		int last = 0;
		//step记录跳跃步数
		int step = 0;
		for(int i=0; i<nums.length; i++)
		{
			//上次能跳到的最远位置 跳不到i处时，更新last，步数step+1
			if(last < i)
			{
				last = cur;
				step++;
			}
			//cur记录此时能跳到的最远位置
			cur = Math.max(cur, nums[i]+i);
		}
		return cur < nums.length - 1 ? -1 : step;
	}
}
