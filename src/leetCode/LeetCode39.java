package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode39
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {2,2,4};
		List<List<Integer>> res = combinationSum(nums, 6);
		for(List<Integer> l : res)
		{
			for(int x : l)
			{
				System.out.print(x+", ");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> combinationSum(int[] candidates, int target) 
	{
		//结果列表res
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		//res中每个列表list
		ArrayList<Integer> list = new ArrayList<Integer>();
		//先对数组排序，讨论空数组情况
		Arrays.sort(candidates);
		if(candidates.length == 0)
		{
			return res;
		}
		deal(0, candidates, target, list, res);
		return res;
    }
	public static boolean deal(int index, int[] candidates, int target, ArrayList<Integer> list, List<List<Integer>> res)
	{
		//递归返回条件，此时，前面加起来的数已经大于目标值
		if(target < 0)
		{
			return false;
		}
		//递归返回条件，此时，前面加起来的数等于目标值，新建list，放入res
		if(target == 0)
		{
			res.add(new ArrayList<Integer>(list));
			return false;
		}
		//递归返回条件，此时，前面加起来的数小于目标值
		else if(target > 0)
		{
			for(int i = index; i<candidates.length; i++)
			{
				//先将元素加入list，再递归，重复加入，直至target<0,再从list中remove出
				list.add(candidates[i]);
				boolean flag = deal(i, candidates, target-candidates[i], list, res);
				list.remove(list.size()-1);
				//后面的数更大，就不用加了，跳出本次循环
				if(flag == false)
				{
					break;
				}
				//去重
				while(i<candidates.length-1 && candidates[i]==candidates[i+1])
				{
					i++;
				}
			}
		}
		return true;
	}
}
