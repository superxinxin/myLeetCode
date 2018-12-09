package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode23
{
	public ListNode mergeKLists(ListNode[] lists) 
	{
        ListNode dummy = new ListNode(0);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(ListNode l : lists)
        {
        	while(l != null)
        	{
        		list.add(l.val);
        		l = l.next;
        	}
        }
        Object[] nums = list.toArray();
        Arrays.sort(nums);
        ListNode curr = dummy;
        for(int i=0; i<nums.length; i++)
        {
        	ListNode tmp = new ListNode((Integer)nums[i]);
        	curr.next = tmp;
        	curr = curr.next;
        }
        return dummy.next;
    }
}
