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
		//res�����¼���������������֮�ͣ���Ϊ������˽���ĳ��Ȳ�������������֮��
		int[] res = new int[length1+length2];
		//���Ƴ˷���ʽ���㣬�ڶ�������ÿ���������γ��Ե�һ��������ÿһ�ν������λ�ӵ�res��
		for(int j=0; j<length2; j++)
		{
			//carry��¼��λ
			int carry = 0;
			for(int i=0; i<length1; i++)
			{
				//i+jλ�ϵ���ֵ = ��λ����ԭ��ֵ + ����str2[length2-1-j]*����str1[length1-1-i] + ��λcarry
				int tmp = res[i+j] + Integer.parseInt(str2[length2-1-j])*Integer.parseInt(str1[length1-1-i]) + carry;
				//Ȼ�����λ�������¸�λ���ϵ���
				res[i+j] = tmp%10;
				carry = tmp/10;
			}
			//������carry����¼���λ��ֵ
			int high = j + length1;
			while(carry > 0)
			{
				int tmp = res[high] + carry;
				res[high] = tmp%10;
				carry = carry/10;
				high++;
			}
		}
		//������res�Ӻ���ǰ��ת�������ս���ַ���
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
