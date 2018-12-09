package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode47
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {3,3,0,3};
		List<List<Integer>> res = permuteUnique(nums);
		for(List<Integer> l : res)
		{
			for(Integer i : l)
			{
				System.out.print(i+", ");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> permuteUnique(int[] nums) 
	{
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        deal(0, nums.length, nums, res);
        return res;
    }
	public static void deal(int curlen, int length, int[] nums, List<List<Integer>> res)
	{
		//与leetcode46类似思想，注意去重即可，这里换了种写法试试
		if(curlen >= length)
		{
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			for(int i : nums)
			{
				tmp.add(i);
			}
			res.add(tmp);
			return;
		}
		for(int i=curlen; i<length; i++)
		{
			//这里去重，在i位置之后的数如果有与i位置相等的，跳出本次循环
			boolean flag = false;
			for(int j=i+1; j<length; j++)
			{
				if(nums[i] == nums[j])
				{
					flag = true;
				}
			}
			if(flag == true)
			{
				continue;
			}
			swap(nums, i, curlen);
			deal(curlen+1, length, nums, res);
			swap(nums, i, curlen);
		}
	}
	public static void swap(int[] nums, int x, int y)
	{
		int tmp = nums[x];
		nums[x] = nums[y];
		nums[y] = tmp;
	}
}
