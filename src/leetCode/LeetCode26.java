package leetCode;

public class LeetCode26
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {0,0,1,1,2,3,3,4,5,6,6,6,7};
		System.out.println(removeDuplicates(nums));
	}
	public static int removeDuplicates(int[] nums) 
	{
		//˫ָ�뷨
		if(nums==null)
		{
			return 0;
		}
		if(nums.length==0 || nums.length==1)
		{
			return nums.length;
		}
		int i = 0;
		for(int j=1; j<nums.length; j++)
		{
			if(nums[i] != nums[j])
			{
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
    }
}
