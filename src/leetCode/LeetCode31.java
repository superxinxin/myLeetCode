package leetCode;

public class LeetCode31
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {5,4,7,5,3,2};
		nextPermutation(nums);
		for(int a : nums)
		{
			System.out.print(a+", ");
		}
	}
	public static void nextPermutation(int[] nums) 
	{
		//从后往前找到从后往前递增的递增组的断层，i指向递增组首个
				int i = nums.length-1;
				while(i>0 && nums[i-1]>=nums[i])
				{
					i--;
				}
				//i==0时表示整个数组顺序看是递减的，此时直接整个翻转
				if(i == 0)
				{
					for(int m=0; m<nums.length/2; m++)
					{
						int temp = nums[m];
						nums[m] = nums[nums.length-1-m];
						nums[nums.length-1-m] = temp;
					}
					return;
				}
				//再从i开始往后找到刚好比nums[i-1]大的数，j指向它
				int j = i;
				while(j<nums.length && nums[i-1]<nums[j])
				{
					j++;
				}
				//i，j指向的数互换，i及i之后的数翻转成递增组
				int tmp = nums[i-1];
				nums[i-1] = nums[j-1];
				nums[j-1] = tmp;
				for(int x=0; x<(nums.length-i)/2; x++)
				{
					int tmp2 = nums[x+i];
					nums[x+i] = nums[nums.length-1-x];
					nums[nums.length-1-x] = tmp2;
				}
    }
}
