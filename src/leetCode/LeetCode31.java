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
		//�Ӻ���ǰ�ҵ��Ӻ���ǰ�����ĵ�����Ķϲ㣬iָ��������׸�
				int i = nums.length-1;
				while(i>0 && nums[i-1]>=nums[i])
				{
					i--;
				}
				//i==0ʱ��ʾ��������˳���ǵݼ��ģ���ʱֱ��������ת
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
				//�ٴ�i��ʼ�����ҵ��պñ�nums[i-1]�������jָ����
				int j = i;
				while(j<nums.length && nums[i-1]<nums[j])
				{
					j++;
				}
				//i��jָ�����������i��i֮�������ת�ɵ�����
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
