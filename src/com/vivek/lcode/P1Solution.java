package com.vivek.lcode;

public class P1Solution {
	
	
	public static void main(String[] args) {
		
		
		P1Solution p1s=new P1Solution();
		
		P1ListNode list1=new P1ListNode(1);
		list1.next=new P1ListNode(2);
		list1.next.next=new P1ListNode(4);
		
		P1ListNode list2=new P1ListNode(1);
		list2.next=new P1ListNode(3);
		list2.next.next=new P1ListNode(4);
		
		P1ListNode list22=p1s.mergeTwoLists(list1, list2);
		
		while(list22!=null) {
			System.out.print(list22.val+" ");
			list22=list22.next;
		}
		
		
	}

	public P1ListNode mergeTwoLists(P1ListNode list1, P1ListNode list2) {
		P1ListNode list3 = null;

		if (list1 == null && list2 == null)
			return null;

		if (list1 == null)
			return list2;

		if (list2 == null)
			return list1;

		P1ListNode list4 = null;

		if (list1.val <= list2.val) {
			list4 = new P1ListNode(list1.val);
			list1 = list1.next;
		} else {
			list4 = new P1ListNode(list2.val);
			list2 = list2.next;
		}
		list3 = list4;

		while (list1 != null || list2 != null) {

			if (list1 != null && list2 != null) {

				if (list1.val <= list2.val) {
					list4.next = new P1ListNode(list1.val);
					list1 = list1.next;
				} else {
					list4.next = new P1ListNode(list2.val);
					list2 = list2.next;
				}

			} else if (list1 == null) {
				list4.next = new P1ListNode(list2.val);
				list2 = list2.next;
			} else  {
				list4.next = new P1ListNode(list1.val);
				list1 = list1.next;
			}

			list4 = list4.next;
		}

		return list3;
	}
}
