package leetCode;

public class LeetCode50
{
	public double myPow(double x, int n) 
	{
		if(n == 0)
		{
			return 1;
		}
		if(n == 1)
		{
			return x;
		}
		int m = n/2;
		if(n < 0)
		{
			m = 0-m;
			x = 1/x;
		}
		double res = myPow(x, m);
		return n%2==0 ? res*res:x*res*res;
    }
}
