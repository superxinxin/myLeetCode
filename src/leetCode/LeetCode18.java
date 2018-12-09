package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode18
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {0,0,0,0};
		int target = 0;
		List<List<Integer>> res = fourSum(nums, target);
		System.out.println(res.size());
		for(List<Integer> l : res)
		{
			for(int i : l)
			{
				System.out.print(i+", ");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> fourSum(int[] nums, int target) 
	{
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(nums.length<4 || nums==null)
		{
			return list;
		}
        Arrays.sort(nums);
        for(int i=0; i<nums.length-3; i++)
        {
        	//ȥ��
        	if(i>0 && nums[i-1]==nums[i])
    		{
    			continue;
    		}
        	//���ܵ���Сֵ����target����ֱ�Ӳ��ñ���
        	if(nums[i]*4 > target)
    		{
    			break;
    		}
        	//�������ֵС��target����һ�־Ͳ��ñ���
    		if(nums[i]+3*nums[nums.length-1] < target)
    		{
    			continue;
    		}
        	for(int j=i+1; j<nums.length-2; j++)
        	{
        		int left = j+1;
        		int right = nums.length-1;
        		//ȥ��
        		if(j>i+1 && nums[j-1]==nums[j])
        		{
        			continue;
        		}
        		//ͬ�����ٱȽϴ���
        		if(nums[i]+nums[j]*3 > target)
        		{
        			break;
        		}
        		//ͬ�����ٱȽϴ���
        		if(nums[i]+nums[j]+2*nums[nums.length-1] < target)
        		{
        			continue;
        		}
        		while(left < right)
        		{
        			int sum = nums[i]+nums[j]+nums[left]+nums[right];
            		if(sum == target)
            		{
            			ArrayList<Integer> l = new ArrayList<Integer>();
            			l.add(nums[i]);
            			l.add(nums[j]);
            			l.add(nums[left]);
            			l.add(nums[right]);
            			list.add(l);
            			while(left<right && nums[left]==nums[left+1])
            			{
            				left++;
            			}
            			while(left<right && nums[right-1]==nums[right])
            			{
            				right--;
            			}
            			left++;
            			right--;
            		}
            		else if(sum < target)
            		{
            			left++;
            		}
            		else if(sum > target)
            		{
            			right--;
            		}
        		}
        		
        	}
        }
        return list;
    }
}
