package leetCode;

public class LeetCode27
{
	public int removeElement(int[] nums, int val) 
	{
//		双指针法，与LeetCode26类似思想
//		if(nums.length==0 || nums==null)
//		{
//			return nums.length;
//		}
//		int i = 0;
//		for(int j=0; j<nums.length; j++)
//		{
//			if(nums[j] != val)
//			{
//				nums[i] = nums[j];
//				i++;
//			}
//		}
//		return i;

//		双指针法，在要删除的元素较少时更高效
		int i =0;
		int n = nums.length;
		while(i < n)
		{
			if(nums[i] == val)
			{
				nums[i] = nums[n-1];
				n--;
			}
			else
			{
				i++;
			}
		}
		return n;
    }
}
