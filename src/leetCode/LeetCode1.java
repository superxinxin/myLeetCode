package leetCode;

import java.util.HashMap;

public class LeetCode1
{
	public int[] twoSum(int[] nums, int target) 
	{
		//HashMap��keyֵ��¼���֣�value��¼���ֶ�Ӧ������
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] a = new int[2];
		//�ڷŽ�map��ͬʱ����ǰ������������Ľ�����в��ң��ҵ����˳�
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
