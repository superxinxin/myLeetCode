package leetCode;

import java.util.HashSet;

public class LeetCode14
{
	public static void main(String[] args)
	{
		String[] strs = new String[] {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) 
	{
		if(strs.length == 0)
		{
			return "";
		}
        for(int i=1;i<=strs[0].length();i++)
        {
            String head = strs[0].substring(0,i);
            for(String str:strs)
            {
                if(!str.startsWith(head))
                {
                	return head.substring(0,i-1);
                }
            }
        }
        return strs[0];
		
		
		
		
//		//����ֻ��һ���ַ��������
//		if(strs.length == 1)
//		{
//			return strs[0];
//		}
//		//index��ʾ�ַ����е�ǰ��ȡ�����ַ�������
//		//i��ʾ�����е�i���ַ���
//		int index = 0;
//		int i=0;
//		while(i<strs.length-1)
//		{
//			//�����жϽ�ȡλ���Ƿ񳬹����ַ�������
//			if(index<strs[i].length() && index<strs[i+1].length())
//			{
//				//�Ƚϵ�i���ַ����ĵ�indexλ���ַ� �� ��i+1���ַ����ĵ�indexλ���ַ� �Ƿ����
//				if(strs[i].substring(index, index+1).equals(strs[i+1].substring(index, index+1)))
//				{
//					//����ַ����Ѿ��Ƚϵ����λ����index+1�� i���㣬��ͷ��ʼ �Ƚ���һ��λ���ַ�
//					if(i == strs.length-2)
//					{
//						index++;
//						i = 0;
//					}
//					//����i++����ʾ���űȽϺ������ַ�����indexλ���ַ�
//					else
//					{
//						i++;
//					}
//				}
//				else
//				{
//					break;
//				}
//			}
//			else
//			{
//				break;
//			}
//		}
//		if(index != 0)
//		{
//			return strs[0].substring(0, index);
//		}
//		else
//		{
//			return "";
//		}
	}
}
