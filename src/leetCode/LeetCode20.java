package leetCode;

import java.util.Stack;

public class LeetCode20
{
	public boolean isValid(String s) 
	{
		char[] cs = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<cs.length; i++)
		{
			if(stack.size() == 0)
			{
				stack.push(cs[i]);
			}
			else
			{
				char tmp = stack.peek();
				if((tmp=='('&&cs[i]==')')||(tmp=='['&&cs[i]==']')||(tmp=='{'&&cs[i]=='}'))
				{
					stack.pop();
				}
				else
				{
					stack.push(cs[i]);
				}
			}
		}
		if(stack.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
