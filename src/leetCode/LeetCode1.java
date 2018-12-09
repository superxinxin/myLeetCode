package leetCode;

import java.util.HashMap;

public class LeetCode1
{
	public int[] twoSum(int[] nums, int target) 
	{
		//HashMap的key值记录数字，value记录数字对应的索引
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] a = new int[2];
		//在放进map的同时，对前面的满足条件的结果进行查找，找到即退出
		for(int i=0; i<nums.length; i++)
		{
			if(map.containsKey(target-nums[i]))
			{
				a = new int[] {map.get(target-nums[i]), i};
				return a;
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
    }
}
