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
		//��leetcode39���ƣ�����Ҫע��ȥ��
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
				//��ͬ�ٴ˴���i+1��ȡ��һ���������ظ�ȡ����
				boolean flag = deal(i+1, candidates, target-candidates[i], list, res);
				list.remove(list.size()-1);
				//����������󣬾Ͳ��ü��ˣ���������ѭ��,��֦��
				if(flag == false)
				{
					break;
				}
				//����ȥ��
				while(i<candidates.length-1 && candidates[i]==candidates[i+1])
				{
					i++;
				}
			}
		}
		return true;
	}
}
