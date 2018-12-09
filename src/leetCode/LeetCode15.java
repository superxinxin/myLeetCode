package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> res = threeSum(nums);
		for(List<Integer> l : res)
		{
			for(Integer i : l)
			{
				System.out.print(i + ", ");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> threeSum(int[] nums) 
	{
        List<List<Integer>> res = new  ArrayList<List<Integer>>();
        if(nums==null || nums.length<3)
        {
        	return res;
        }
        //首先对数组排序
        Arrays.sort(nums);
        //对每个i，设置两个指针
        for(int i=0; i<nums.length-2; i++)
        {
        	int left = i+1;
        	int right = nums.length-1;
        	//i变为下一个时，需要去重
        	if(i>0 && nums[i]==nums[i-1])
        	{
        		continue;
        	}
        	while(left < right)
        	{
        		int sum = nums[i] + nums[left] + nums[right];
        		if(sum == 0)
        		{
        			res.add(Arrays.asList(new Integer[]{nums[i], nums[left], nums[right]}));
        			//left变化时注意去重
        			while(left<right && nums[left]==nums[left+1])
            		{
            			left++;
            		}
        			//right变化时注意去重
            		while(left<right && nums[right]==nums[right-1])
            		{
            			right--;
            		}
            		left++;
            		right--;
        		}
        		else if(sum > 0)
            	{
            		right--;
            	}
            	else
            	{
            		left++;
            	}
        	}
        }
        return res;
    }
	
}