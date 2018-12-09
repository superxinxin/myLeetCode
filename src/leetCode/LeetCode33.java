package leetCode;

public class LeetCode33
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {4,5,6,7,1,2,3};
		System.out.println(search(nums, 6));
	}
	public static int search(int[] nums, int target) 
	{
		return search2(nums, 0, nums.length-1, target);
    }
	public static int search2(int[] nums, int low, int high, int target)
	{
		if(low > high)
		{
			return -1;
		}
		int mid = (low + high)/2;
		if(nums[mid] == target)
		{
			return mid;
		}
		//此时数组右半边时有序的
		if(nums[mid] < nums[high])
		{
			//应用二分查找递归法
			if(nums[mid]<target && target<=nums[high])
			{
				return search2(nums, mid+1, high, target);
			}
			else
			{
				return search2(nums, low, mid-1, target);
			}
		}
		//此时数组右半边时有序的
		else
		{
			//应用二分查找递归法
			if(nums[low]<=target && target<nums[mid])
			{
				return search2(nums, low, mid-1, target);
			}
			else
			{
				return search2(nums, mid+1, high, target);
			}
		}
	}
}
