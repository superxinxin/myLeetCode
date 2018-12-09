package leetCode;

public class LeetCode34
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {1};
		int[] res = searchRange(nums, 1);
		for(int i : res)
		{
			System.out.print(i+", ");
		}
	}
	public static int[] searchRange(int[] nums, int target) 
	{
		//二分查找非递归法，index记录结果索引
				int low = 0;
				int high = nums.length-1;
				int index = -1;
				while(low <= high)
				{
					int mid = (low+high)/2;
					if(target == nums[mid])
					{
						index = mid;
						break;
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
				//在目标索引处查询前后是否有相同元素，记录前后位置
				if(index == -1)
				{
					return new int[] {-1,-1};
				}
				else
				{
					int i = index;
					int j = index;
					while(i>=0 && nums[i]==target)
					{
						i--;
					}
					while(j<nums.length && nums[j]==target)
					{
						j++;
					}
					return new int[] {i+1, j-1};
				}
    }
}
