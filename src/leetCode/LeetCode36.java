package leetCode;

import java.util.HashMap;

public class LeetCode36
{
	public boolean isValidSudoku(char[][] board) 
	{
		//hashmap记录每一行是否出现重复数字
        for(int i=0; i<9; i++)
        {
        	HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        	for(int j=0; j<9; j++)
        	{
        		if(board[i][j]>='0' && board[i][j]<='9')
        		{
        			if(map1.get(board[i][j]) == null)
            		{
            			map1.put(board[i][j], new Integer(1));
            		}
            		else
            		{
            			int tmp = map1.get(board[i][j]);
            			if(tmp+1 == 2)
            			{
            				return false;
            			}
            		}
        		}
        	}
        }
      //hashmap记录每一列是否出现重复数字
        for(int j=0; j<9; j++)
        {
        	HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        	for(int i=0; i<9; i++)
        	{
        		if(board[i][j]>='0' && board[i][j]<='9')
        		{
        			if(map2.get(board[i][j]) == null)
            		{
            			map2.put(board[i][j], new Integer(1));
            		}
            		else
            		{
            			int tmp = map2.get(board[i][j]);
            			if(tmp+1 == 2)
            			{
            				return false;
            			}
            		}
        		}
        	}
        }
      //hashmap记录每一个方格是否出现重复数字
        for(int i=1; i<9; i=i+3)
        {
        	for(int j=1; j<9; j=j+3)
        	{
        		HashMap<Character, Integer> map3 = new HashMap<Character, Integer>();
        		for(int m=i-1; m<=i+1; m++)
        		{
        			for(int n=j-1; n<=j+1; n++)
        			{
        				if(board[m][n]>='0' && board[m][n]<='9')
                		{
        					if(map3.get(board[m][n]) == null)
                    		{
                    			map3.put(board[m][n], new Integer(1));
                    		}
                    		else
                    		{
                    			int tmp = map3.get(board[m][n]);
                    			if(tmp+1 == 2)
                    			{
                    				return false;
                    			}
                    		}
                		}
        			}
        		}
        	}
        }
        //不是上述三种情况，则返回true
        return true;
    }
}
