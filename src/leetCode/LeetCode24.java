package leetCode;

public class LeetCode24
{
	public static void main(String[] args)
	{
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		ListNode head = swapPairs(l1);
		while(head != null)
		{
			System.out.print(head.val+", ");
			head = head.next;
		}
	}
	public static ListNode swapPairs(ListNode head) 
	{
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		if(dummy.next==null || dummy.next.next==null)
		{
			return dummy.next;
		}
		ListNode left = dummy;
		ListNode mid = left.next;
		ListNode right = mid.next;
		while(mid!=null && mid.next!=null)
		{
			//链表改变节点顺序
			mid.next = right.next;
			right.next = mid;
			left.next = right;
			left = mid;
			mid = left.next;
			if(mid != null)
			{
				right = mid.next;
			}
		}
		return dummy.next;
    }
}
