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
		//����б�res
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		//res��ÿ���б�list
		ArrayList<Integer> list = new ArrayList<Integer>();
		//�ȶ������������ۿ��������
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
		//�ݹ鷵����������ʱ��ǰ������������Ѿ�����Ŀ��ֵ
		if(target < 0)
		{
			return false;
		}
		//�ݹ鷵����������ʱ��ǰ���������������Ŀ��ֵ���½�list������res
		if(target == 0)
		{
			res.add(new ArrayList<Integer>(list));
			return false;
		}
		//�ݹ鷵����������ʱ��ǰ�����������С��Ŀ��ֵ
		else if(target > 0)
		{
			for(int i = index; i<candidates.length; i++)
			{
				//�Ƚ�Ԫ�ؼ���list���ٵݹ飬�ظ����룬ֱ��target<0,�ٴ�list��remove��
				list.add(candidates[i]);
				boolean flag = deal(i, candidates, target-candidates[i], list, res);
				list.remove(list.size()-1);
				//����������󣬾Ͳ��ü��ˣ���������ѭ��
				if(flag == false)
				{
					break;
				}
				//ȥ��
				while(i<candidates.length-1 && candidates[i]==candidates[i+1])
				{
					i++;
				}
			}
		}
		return true;
	}
}
