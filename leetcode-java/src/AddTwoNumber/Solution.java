package AddTwoNumber;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode(0);
    	ListNode temp =  head;
    	ListNode rememberListNode = null;
    	int append = 0;
    	while (l1 != null && l2 != null) {
			int sum = l1.val + l2.val + append;
			append = (sum > 9) ?  1 : 0;
			temp.val = sum%10;
			l1 = l1.next;
			l2 = l2.next;
			temp.next = new ListNode(0);
			rememberListNode = temp;
			temp = temp.next;
		}
    	
    	ListNode tail = null;
    	
    	if (l1 == null && l2 != null) {
			tail = appendTail(l2, append);
		}
    	else if (l1 != null && l2 == null) {
			tail = appendTail(l1, append);
		}
    	else if (append == 1) {
			tail = new ListNode(1);
			tail.next = null;
		}
    	
		if (tail != null) {
			rememberListNode.next = tail;
		}
		else {
			rememberListNode.next = null;
		}
    	
    	return head;
	}
    
    public ListNode appendTail(ListNode listNode, int append){
    	int add = append;
    	ListNode head = listNode;
    	ListNode temp = head;
    	ListNode remListNode = null;
    	while (temp != null) {
    		remListNode = null;
			int sum = temp.val + add;
			add = sum > 9 ? 1 : 0;
			temp.val = sum%10;
			remListNode = temp;
			temp = temp.next;
		}
    	if (add == 1) {
    		remListNode.next = new ListNode(add);
		}
    	return head;
    }
    
    public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode head = new ListNode(9);
		head.next = new ListNode(1);
		head.next.next = new ListNode(6);
		solution.addTwoNumbers(new ListNode(0),  head);
		System.out.println("success");
	}
}