package leetcode_exercise4;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);

		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);

		ListNode result = mergeTwoLists(list1, list2);

		List<Integer> resultList = new ArrayList<>();
		while (result != null) {
			resultList.add(result.val);
			result = result.next;
		}
		System.out.println(resultList);
	}

	// merging two sorted linked lists into one sorted linked list
	private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		// creating a dummy node to serve as the start of the merged list
		ListNode mergedList = new ListNode();

		// using a temporary pointer to build the new list
		ListNode temp = mergedList;

		// iterating until one of the lists becomes null
		while (list1 != null && list2 != null) {

			// comparing the current value of list1 and list2
			if (list1.val <= list2.val) {

				// adding the value from list1 to the merged list
				temp.next = new ListNode(list1.val);

				// moving to the next node in list1
				list1 = list1.next;

			} else {

				// adding the value from list2 to the merged list
				temp.next = new ListNode(list2.val);

				// moving to the next node in list2
				list2 = list2.next;
			}

			// moving the temporary pointer to the next node
			temp = temp.next;
		}

		// adding the remaining nodes from list1 to the merged list
		while (list1 != null) {
			temp.next = new ListNode(list1.val);
			list1 = list1.next;
			temp = temp.next;
		}

		// adding the remaining nodes from list2 to the merged list
		while (list2 != null) {
			temp.next = new ListNode(list2.val);
			list2 = list2.next;
			temp = temp.next;
		}

		// returning the merged list, skipping the dummy node
		return mergedList.next;
	}

}
