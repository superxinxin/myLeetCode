package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode46
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {1,2,3};
		List<List<Integer>> res = permute(nums);
		for(List<Integer> l : res)
		{
			for(Integer i : l)
			{
				System.out.print(i+", ");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> permute(int[] nums) 
	{
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		deal(0, nums.length-1, nums, res);
		return res;
    }
	public static void deal(int start, int end, int[] nums, List<List<Integer>> res)
	{
		if(start == end)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int i=0; i<nums.length; i++)
			{
				temp.add(nums[i]);
			}
			res.add(temp);
			return;
		}
		for(int i=start; i<=end; i++)
		{
			swap(nums, start, i);
			deal(start+1, end, nums, res);
			swap(nums, start, i);
		}
	}
	public static void swap(int[] nums, int x, int y)
	{
		int tmp = nums[x];
		nums[x] = nums[y];
		nums[y] = tmp;
	}
}