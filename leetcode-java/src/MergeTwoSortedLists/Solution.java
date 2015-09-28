package MergeTwoSortedLists;

import java.awt.Checkbox;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Solution {
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
			return null;
		}
        if (l1 == null && l2 != null) {
			return l2;
		}
        if (l1 != null && l2 == null) {
			return l1;
		}
        ListNode headListNode;
        if (getHead(l1, l2)) {
			headListNode = l1;
		}
        else {
			headListNode = l2;
		}
        ListNode tmpListNode;
        if (checkList(l1, l2)) {
			if (l1.val > l2.val) {
				l2.next = mergeTwoLists(l2.next, l1);
			}
			else if (l1.val == l2.val) {
				tmpListNode = l1.next;
				l1.next = l2;
				l2.next = mergeTwoLists(l2.next, tmpListNode);
			}
			else {
				l1.next = mergeTwoLists(l1.next, l2);
			}
		}
        
        return headListNode;
    }
    
    public boolean checkList(ListNode l1, ListNode l2){
    	if (l1.next.val > l1.val || l2.next.val > l2.val) {
			return true;
		}
    	return false;
    }
    
    public boolean getHead(ListNode l1, ListNode l2){
    	if (l1.val > l2.val) {
			return true;
		}
    	return false;
    }
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
		System.out.println("success");
	}
}