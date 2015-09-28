package AddTwoNumber;

public class SolutionIterator {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode returnNode = addTwoNumbers_sub(l1, l2, 0);
		return returnNode;
	}
    public ListNode addTwoNumbers_sub(ListNode l1, ListNode l2, int append) {
    	
    	ListNode head = new ListNode(0);
    	ListNode tmp = head;
    	
    	if (l1 == null && l2 == null) {
    		if (append == 1) {
				return new ListNode(1);
			}
			return null;
		}

    	if (l1 == null && l2 != null) {
			return appendTail(l2, append);
		}

    	if (l1 != null && l2 == null) {
			return appendTail(l1, append);
		}
    	
    	int sum = l1.val + l2.val + append;
    	append = sum > 9 ? 1 : 0;
    	tmp.val = sum%10;
    	
    	l1 = l1.next;
    	l2 = l2.next;
    	
    	tmp.next = addTwoNumbers_sub(l1, l2, append);
    	
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
		SolutionIterator solution = new SolutionIterator();
		ListNode head = new ListNode(9);
		head.next = new ListNode(8);
		
		ListNode head1 = new ListNode(1);

		solution.addTwoNumbers(head1,  head);
		System.out.println("success");
	}
}