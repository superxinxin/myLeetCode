package leetCode;

public class LeetCode5
{
	//中心扩展法，每个字符及字符间的空格都可以作为中心往左右扩展
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
        	//len1以i为中心，len2以i后的空格为中心
        	int len1 = deal(s, i, i);
        	int len2 = deal(s, i, i+1);
        	int len = Math.max(len1, len2);
        	if(len > end-start)
        	{
        		//start，end 记录首末位置
        		start = i-(len-1)/2;
        		end = i+len/2;
        	}
        }
        return s.substring(start, end+1);
    }
	//deal方法负责左右扩展，返回最大长度
	public int deal(String s, int l, int r)
	{
		while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
		{
			l--;
			r++;
		}
		//这里其实是r-1-(l+1)+1
		return r-l-1;
	}
}
