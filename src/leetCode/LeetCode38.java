package leetCode;

public class LeetCode38
{
	public static String countAndSay(int n) 
	{
		return deal(n-1, "1");
    }
	public static String deal(int n, String str)
	{
		//�ݹ���������
		if(n == 0)
		{
			return str;
		}
		StringBuilder sb = new StringBuilder();
	    int count = 1;
	    //str����Ϊ1�����
	    if(str.length() == 1)
	    {
	        sb.append(count).append((str.charAt(0)));
	    }
	    else
	    {
	        for (int i = 0; i < str.length(); i++) 
	        {
	        	//���count�����ѵ��ף������ʱsb
	            if (i+1 == str.length())
	            {
	                sb.append(count).append(str.charAt(i));
	            }
	            else 
	            {
	            	//������������ȣ������
	                if(str.charAt(i) == str.charAt(i+1))
	                {
	                    count++;
	                }
	                //����ʱ����׷���ַ�
	                else 
	                {
	                    sb.append(count).append(str.charAt(i));
	                    count = 1;
	                }
	            }
	        }
	    }
	    //�ݹ飬n--����sb��ʵ�Ǵ�n=1��ʼ���ɵ�
	    return deal(--n,sb.toString());
	}
}
