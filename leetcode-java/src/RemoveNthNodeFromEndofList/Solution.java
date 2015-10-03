package RemoveNthNodeFromEndofList;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode p1 = null;
    	ListNode p2 = head;
    	int len = n+1;
    	int tmp = 0 ;
    	while (p2 != null) {
			p2 = p2.next;
			if (tmp < len) {
				tmp++;
			}
			if (tmp == len) {
				if (p1 == null) {
					p1 = head;
				}
				else {
					p1 = p1.next;
				}
			}
		}
    	if (tmp < n) {
			return null;
		}
    	if (tmp == n) {
    		ListNode returNode = head.next;
    		head.next = null;
			return returNode;
		}
		ListNode tmpListNode = p1.next;
		p1.next = tmpListNode.next;
		tmpListNode.next = null;
		return head;
    }
    
    public static void main(String[] args) {
    	ListNode listNode = new ListNode(1);
    	ListNode listNode1 = new ListNode(2);
    	listNode.next = listNode1;
    	Solution solution = new Solution();
		System.out.println(solution.removeNthFromEnd(listNode, 1));
	}
}