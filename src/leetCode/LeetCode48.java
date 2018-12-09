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
		//将矩阵看成n个嵌套的四边形，四边形的边旋转一下
		for(int i=0; i<length/2; i++)
		{
			for(int j=i; j<length-i-1; j++)
			{
				//上->右
				target = matrix[j][length-1-i];
				matrix[j][length-1-i] = matrix[i][j];
				//右->下
				temp = matrix[length-1-i][length-1-j];
				matrix[length-1-i][length-1-j] = target;
				target = temp;
				//下->左
				temp = matrix[length-1-j][i];
				matrix[length-1-j][i] = target;
				target = temp;
				//左->上
				matrix[i][j] = target;
			}
		}
    }
}
