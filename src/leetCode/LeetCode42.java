package leetCode;

public class LeetCode42
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(nums));
	}
	public static int trap(int[] height) 
	{
		if(height.length == 0)
		{
			return 0;
		}
		//��¼������������ֵ��������
		int indexOfMax = -1;
		int max = 0;
		int sum = 0;
		//leftMax��¼�����������������ֵ���������䣬���������е�ʵʱ���ֵ��rightMaxͬ��
		int leftMax = height[0];
		int rightMax = height[height.length-1];
		for(int i=0; i<height.length; i++)
		{
			if(max < height[i])
			{
				indexOfMax = i;
				max = height[i];
			}
		}
		//�������
		for(int i=0; i<indexOfMax; i++)
		{
			//����leftMax����ʱû�л�ˮ
			if(leftMax < height[i])
			{
				leftMax = height[i];
			}
			//��height[i]��leftMaxС�����ˮ��leftMax-height[i]
			else
			{
				sum += leftMax-height[i];
			}
		}
		//�Ұ�����ͬ��
		for(int i=height.length-1; i>indexOfMax; i--)
		{
			if(rightMax < height[i])
			{
				rightMax = height[i];
			}
			else
			{
				sum += rightMax-height[i];
			}
		}
		return sum;
    }
}
