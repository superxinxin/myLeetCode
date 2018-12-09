package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode41
{
	public int firstMissingPositive(int[] nums) 
	{
		if(nums.length == 0)
		{
			return 1;
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = Integer.MIN_VALUE;
		//һ�α���������HashMap��max��¼���ֵ
		for(int i=0; i<nums.length; i++)
		{
			if(max < nums[i])
			{
				max = nums[i];
			}
			if(map.get(nums[i]) == null)
			{
				map.put(nums[i], 1);
			}
		}
		//һ�β��ң��ҵ��ϵ�
		for(int i=1; i<max; i++)
		{
			if(map.get(i) == null)
			{
				return i;
			}
		}
		return max+1;
    }
}
