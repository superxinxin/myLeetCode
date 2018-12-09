package leetCode;

public class LeetCode5
{
	//������չ����ÿ���ַ����ַ���Ŀո񶼿�����Ϊ������������չ
	public String longestPalindrome(String s) 
	{
        if(s.length()==0 || s==null)
        {
        	return "";
        }
        int start = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++)
        {
        	//len1��iΪ���ģ�len2��i��Ŀո�Ϊ����
        	int len1 = deal(s, i, i);
        	int len2 = deal(s, i, i+1);
        	int len = Math.max(len1, len2);
        	if(len > end-start)
        	{
        		//start��end ��¼��ĩλ��
        		start = i-(len-1)/2;
        		end = i+len/2;
        	}
        }
        return s.substring(start, end+1);
    }
	//deal��������������չ��������󳤶�
	public int deal(String s, int l, int r)
	{
		while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
		{
			l--;
			r++;
		}
		//������ʵ��r-1-(l+1)+1
		return r-l-1;
	}
}
