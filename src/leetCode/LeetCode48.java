package leetCode;

public class LeetCode48
{
	public void rotate(int[][] matrix) 
	{
		if(matrix.length == 1)
		{
			return;
		}
		int temp = 0;
		int target = 0;
		int length = matrix.length;
		//�����󿴳�n��Ƕ�׵��ı��Σ��ı��εı���תһ��
		for(int i=0; i<length/2; i++)
		{
			for(int j=i; j<length-i-1; j++)
			{
				//��->��
				target = matrix[j][length-1-i];
				matrix[j][length-1-i] = matrix[i][j];
				//��->��
				temp = matrix[length-1-i][length-1-j];
				matrix[length-1-i][length-1-j] = target;
				target = temp;
				//��->��
				temp = matrix[length-1-j][i];
				matrix[length-1-j][i] = target;
				target = temp;
				//��->��
				matrix[i][j] = target;
			}
		}
    }
}
