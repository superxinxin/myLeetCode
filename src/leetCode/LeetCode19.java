package leetCode;

public class LeetCode19
{
	public ListNode19 removeNthFromEnd(ListNode19 head, int n) 
	{
//		遍历两次解法
//		ListNode19 dummy = new ListNode19(0);
//		dummy.next = head;
//		ListNode19 curr = head;
//		int sum = 0;
//		while(curr !=null)
//		{
//			sum++;
//			curr = curr.next;
//		}
//		curr = dummy;
//		while(sum-n > 0)
//		{
//			curr = curr.next;
//			sum--;
//		}
//		curr.next = curr.next.next;
//		return dummy.next;
		
		ListNode19 dummy = new ListNode19(0);
		dummy.next = head;
		ListNode19 i = dummy;
		ListNode19 j = dummy;
		while(n >= 0)
		{
			j = j.next;
			n--;
		}
		while(j.next != null)
		{
			j = j.next;
			i = i.next;
		}
		i.next = i.next.next;
		return dummy.next;
    }
}
class ListNode19 
{
	int val;
	ListNode19 next;
    ListNode19(int x) 
    { 
    	val = x; 
    }
 }