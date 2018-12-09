package leetCode;

public class LeetCode43
{
	public static void main(String[] args)
	{
		System.out.println(multiply("123", "456"));
	}
	public static String multiply(String num1, String num2) 
	{
		if("0".equals(num1) || "0".equals(num2))
		{
			return "0";
		}
		int length1 = num1.length();
		int length2 = num2.length();
		String[] str1 = num1.split("");
		String[] str2 = num2.split("");
		//res数组记录结果，长度是两数之和，因为两数相乘结果的长度不超过两数长度之和
		int[] res = new int[length1+length2];
		//类似乘法竖式计算，第二个数的每个数字依次乘以第一个数，将每一次结果带进位加到res上
		for(int j=0; j<length2; j++)
		{
			//carry记录进位
			int carry = 0;
			for(int i=0; i<length1; i++)
			{
				//i+j位上的总值 = 该位置上原有值 + 数字str2[length2-1-j]*数字str1[length1-1-i] + 进位carry
				int tmp = res[i+j] + Integer.parseInt(str2[length2-1-j])*Integer.parseInt(str1[length1-1-i]) + carry;
				//然后算进位，保留下该位置上的数
				res[i+j] = tmp%10;
				carry = tmp/10;
			}
			//最后计算carry，记录最高位的值
			int high = j + length1;
			while(carry > 0)
			{
				int tmp = res[high] + carry;
				res[high] = tmp%10;
				carry = carry/10;
				high++;
			}
		}
		//将数组res从后往前，转换成最终结果字符串
		StringBuilder sb = new StringBuilder();
		int index = res.length-1;
		while(index>=0 && res[index]==0)
		{
			index--;
		}
		while(index >= 0)
		{
			sb.append(res[index]);
			index--;
		}
		return sb.toString();
    }
}
