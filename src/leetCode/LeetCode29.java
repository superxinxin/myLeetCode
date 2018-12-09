package leetCode;

public class LeetCode29
{
	public int divide(int dividend, int divisor) 
	{
		if(divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1))
		{//�����������
            return Integer.MAX_VALUE;
        }
		//������㡣�ó�������
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        long ms = (long)dividend;
        long ns = (long)divisor;
        ms = Math.abs(ms);
        ns = Math.abs(ns);
        int num = 0;
//      ˼·:�����������ڵ��ڳ���ʱ(����Ļ���Ϊ0��)������������������m��n�����ֱ��ʼ��Ϊ������1(��С�����)��
//      �����������ڵ���t�Ķ���ʱ����t��pͬʱ�������(����)����������ֵ����p��������ȥt��
//      �Ͷ��������ƣ�����29����8��8���������16С��29�����������������29������29��ȥ֮ǰ��16������ֵ����2��
//      �ڶ���ѭ��ʱ��Ϊ��ʱ��13С��8�Ķ������ʼ���1������ѭ�����������ս��Ϊ2+1=3�������Է��ϡ�
//      ����ע���жϽ�������ŵ�������ʱ�������á�
        while(ms >= ns)
        {
            long m = ns;
            long n = 1;
            while(ms >= (m << 1))
            {
                m <<= 1;
                n <<= 1;
            }
            num += n;
            ms -= m;
        }
        return num * sign;
    }
}
