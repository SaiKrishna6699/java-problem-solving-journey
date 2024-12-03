package Ex4_AddTwoNumbers;

import java.util.ArrayList;
import java.util.Arrays;


class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class addTwoNumbers {
	
	public static ListNode addTwoNums(ListNode l1, ListNode l2) {
		
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		
		int carry = 0;
		
		while(l1 != null || l2 != null || carry !=0) {
			int sum = carry;
			
			if(l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if(l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			carry = sum/10;
			
			current.next = new ListNode(sum % 10);
			current = current.next;
		}
		
		return dummy.next;
	}
	
	public static ListNode ArrayToListNode(int[] arr) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		for(int i: arr) {
			current.next = new ListNode(i);
			current = current.next;
		}
		return dummy.next;
	}
	
	public static int[] ListNodeToArray(ListNode node) {
		ArrayList<Integer> result = new ArrayList<>();
		while(node != null) {
			result.add(node.val);
			node = node.next;
		}
		return result.stream().mapToInt(i -> i).toArray();
	}
	
	public static void main(String[] args) {
		int[] arr1 = {2,3,5};
		int[] arr2 = {4,6,9};
		
		ListNode l1 = ArrayToListNode(arr1);
		ListNode l2 = ArrayToListNode(arr2);
		ListNode twoNums = addTwoNums(l1, l2);
		
		int[] result = ListNodeToArray(twoNums);
		
		System.out.println(Arrays.toString(result));
		
	}
	
	
}
