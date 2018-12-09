package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode40
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {2,5,2,1,2};
		List<List<Integer>> res = combinationSum2(nums, 5);
		for(List<Integer> l : res)
		{
			for(int x : l)
			{
				System.out.print(x+", ");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) 
	{
		//与leetcode39类似，不过要注意去重
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(candidates.length == 0)
		{
			return res;
		}
		Arrays.sort(candidates);
		deal(0, candidates, target, list, res);
		return res;
    }
	public static boolean deal(int index, int[] candidates, int target, ArrayList<Integer> list, List<List<Integer>> res)
	{
		if(target < 0)
		{
			return false;
		}
		else if(target == 0)
		{
			res.add(new ArrayList<Integer>(list));
			return false;
		}
		else if(target > 0)
		{
			for(int i=index; i<candidates.length; i++)
			{
				list.add(candidates[i]);
				//不同再此处是i+1，取下一个而不是重复取自身
				boolean flag = deal(i+1, candidates, target-candidates[i], list, res);
				list.remove(list.size()-1);
				//后面的数更大，就不用加了，跳出本次循环,剪枝！
				if(flag == false)
				{
					break;
				}
				//这里去重
				while(i<candidates.length-1 && candidates[i]==candidates[i+1])
				{
					i++;
				}
			}
		}
		return true;
	}
}
