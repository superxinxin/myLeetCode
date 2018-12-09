package leetCode;

public class LeetCode42
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(nums));
	}
	public static int trap(int[] height) 
	{
		if(height.length == 0)
		{
			return 0;
		}
		//记录数组中最大的数值及其索引
		int indexOfMax = -1;
		int max = 0;
		int sum = 0;
		//leftMax记录在整个数组中最大数值的左半边区间，遍历过程中的实时最大值，rightMax同理
		int leftMax = height[0];
		int rightMax = height[height.length-1];
		for(int i=0; i<height.length; i++)
		{
			if(max < height[i])
			{
				indexOfMax = i;
				max = height[i];
			}
		}
		//左半区间
		for(int i=0; i<indexOfMax; i++)
		{
			//更新leftMax，此时没有积水
			if(leftMax < height[i])
			{
				leftMax = height[i];
			}
			//若height[i]比leftMax小，则积水是leftMax-height[i]
			else
			{
				sum += leftMax-height[i];
			}
		}
		//右半区间同理
		for(int i=height.length-1; i>indexOfMax; i--)
		{
			if(rightMax < height[i])
			{
				rightMax = height[i];
			}
			else
			{
				sum += rightMax-height[i];
			}
		}
		return sum;
    }
}
