package leetCode;

import java.util.Arrays;

public class LeetCode16
{
	public int threeSumClosest(int[] nums, int target) 
	{
		if(nums.length<3 || nums==null)
		{
			return 0;
		}
		Arrays.sort(nums);
		int res = 0;
		int minDid = Integer.MAX_VALUE;
		for(int i=0; i<nums.length-2; i++)
		{
			int left = i+1;
			int right = nums.length-1;
			if(i>0 && nums[i-1]==nums[i])
			{
				continue;
			}
			while(left < right)
			{
				int sum = nums[i] + nums[left] + nums[right];
				if(sum < target)
				{
					int did = sum>target ? sum-target:target-sum;
					if(did < minDid)
					{
						minDid = did;
						res = sum;
					}
					left++;
				}
				else if(sum > target)
				{
					int did = sum>target ? sum-target:target-sum;
					if(did < minDid)
					{
						minDid = did;
						res = sum;
					}
					right--;
				}
				else 
				{
					return sum;
				}
			}
		}
		return res;
	}
}
