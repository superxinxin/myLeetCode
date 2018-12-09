package leetCode;

public class LeetCode11
{
	public static void main(String[] args)
	{
		int[] nums = new int[]{14,0,12,3,8,3,13,5,14,8};
		System.out.println(maxArea(nums));
	}
	public static int maxArea(int[] height) 
	{
		int max = 0;
		int i = 0;
		int j = height.length-1;
		while(i < j)
		{
			int tmp = (j-i)*Math.min(height[i], height[j]);
			if(max < tmp)
			{
				max = tmp;
			}
			if(height[i] > height[j])
			{
				j--;
			}
			else if (height[i] <= height[j])
			{
				i++;
			}
		}
		return max;
    }
}
