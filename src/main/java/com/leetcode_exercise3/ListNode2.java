package com.leetcode_exercise3;

import java.util.ArrayList;
import java.util.List;

public class ListNode2 {
	int val;
	ListNode2 next;

	ListNode2() {

	}

	ListNode2(int val) {
		this.val = val;
	}

	ListNode2(int val, ListNode2 next) {
		this.val = val;
		this.next = next;
	}

	public static void main(String[] args) {
		ListNode2 list1 = new ListNode2(2);
		list1.next = new ListNode2(4);
		list1.next.next = new ListNode2(3);

		ListNode2 list2 = new ListNode2(5);
		list2.next = new ListNode2(6);
		list2.next.next = new ListNode2(4);

		ListNode2 result = addTwoNumbers(list1, list2);

		List<Integer> resultList = new ArrayList<>();
		while (result != null) {
			resultList.add(result.val);
			result = result.next;
		}

		// Print the result list
		System.out.println(resultList);

	}


	public static ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
		// Creating a dummy head node to simplify list construction
		ListNode2 dummyHead = new ListNode2(0);
		// Keeping track of current node as we build the result
		ListNode2 current = dummyHead;
		// Tracking any carry value from adding digits
		int carry = 0;

		// Continue while we have digits left in either list or a carry value
		while (l1 != null || l2 != null || carry > 0) {
			// Start with any carried value from previous addition
			int sum = carry;
			// Adding value from first list if it exists
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			// Adding value from second list if it exists
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			// Calculate new carry value (sum/10 gives tens digit)
			// The loop will continue until there are no more digits to add and no carry
			// value
			carry = sum / 10;
			// Creating new node with ones digit (sum%10)
			current.next = new ListNode2(sum % 10);
			// Moving to next position in result list
			current = current.next;
		}
		return dummyHead.next;
	}

}


