package leetCode;

public class LeetCode35
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {1,3,5,6};
		System.out.println(searchInsert(nums, 2));
	}
	public static int searchInsert(int[] nums, int target) 
	{
		//nums数组中没有target的两种情况单独讨论
		if(target < nums[0])
		{
			return 0;
		}
		if(target > nums[nums.length-1])
		{
			return nums.length;
		}
		//非递归法二分查找，找到mid
		int low = 0;
		int high = nums.length-1;
		int mid = 0;
		while(low <= high)
		{
			mid = (low+high)/2;
			if(nums[mid] == target)
			{
				return mid;
			}
			if(target < nums[mid])
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		//结果索引就在mid或mid+1位置上
		if(nums[mid] > target)
		{
			return mid;
		}
		else
		{
			return mid+1;
		}
    }
}
