package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode49
{
	public List<List<String>> groupAnagrams(String[] strs) 
	{
		if (strs.length == 0) 
		{
	        return Collections.emptyList();
	    }
	    Map<String, List<String>> ans = new HashMap<>();
	    for (String str : strs) 
	    {
	        char[] chars = str.toCharArray();
	        //对每个词排序重组成key，异位词对应同一个key
	        Arrays.sort(chars);
	        String key = String.valueOf(chars);
	        if (!ans.containsKey(key)) 
	        {
	            ans.put(key, new ArrayList<String>());
	        }
	        ans.get(key).add(str);
	    }
	    return new ArrayList(ans.values());
    }
}
