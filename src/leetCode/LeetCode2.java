package leetCode;

public class LeetCode2
{
	 public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) 
	 {
		 //设立哑节点dummyNode，curr用以创建链表
		 ListNode2 dummyNode = new ListNode2(0);
		 ListNode2 curr = dummyNode;
		 //i,j为两个指针
		 ListNode2 i = l1;
		 ListNode2 j = l2;
		 //add为进位
		 int add = 0;
		 while(i!=null || j!=null)
		 {
			 int x = i==null ? 0:i.val;
			 int y = j==null ? 0:j.val;
			 int sum = x + y + add;
			 add = sum/10;
			 curr.next = new ListNode2(sum%10);
			 curr = curr.next;
			 if(i != null)
			 {
				 i = i.next;
			 }
			 if(j != null)
			 {
				 j = j.next;
			 }
		 }
		 //将最后进位也加上
		 if(add > 0)
		 {
			 curr.next = new ListNode2(add);
		 }
		 return dummyNode.next;
	 }
}

//Definition for singly-linked list.
class ListNode2 
{
     int val;
     ListNode2 next;
     ListNode2(int x) 
     { 
    	val = x; 
     }
}
