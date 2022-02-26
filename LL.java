package linkedlist;

import java.util.Scanner;

public class LL {
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}else {
				tail.next = currentNode;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> mergeTwoSortedLL(Node<Integer> head1, Node<Integer> head2){
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		Node<Integer> t1 = head1, t2 = head2;
		Node<Integer> head = null, tail = null;
		if(t1.data <= t2.data) {
			head = t1;
			tail = t1;
			t1 = t1.next;
		}else {
			head = t2;
			tail = t2;
			t2 = t2.next;
		}
		
		while(t1 != null && t2 != null) {
			if(t1.data <= t2.data) {
				tail.next = t1;
				tail = t1;
				t1 = t1.next;
			}else {
				tail.next = t2;
				tail = t2;
				t2 = t2.next;
			}
		}
		
		if(t1 != null) {
			tail.next = t1;
		}else {
			tail.next = t2;
		}
		return head;
	}
	//we need to return the mid element of the LL
	//we take two pointer slow and fast to head
	//we increment slow by one and fast by two
	public static Node<Integer> mid(Node<Integer> head){
		Node<Integer> slow = head, fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static Node<Integer> mergeSort(Node<Integer> head){
		
		if(head == null || head.next == null){
            return head;
        }
		
		Node<Integer> mid1 = mid(head);
		Node<Integer> partHead1 = head;
		Node<Integer> partHead2 = mid1.next;
		mid1.next = null;
		
		Node<Integer> head1 = mergeSort(partHead1);
		Node<Integer> head2 = mergeSort(partHead2);
		
		return mergeTwoSortedLL(head1, head2);
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = mergeSort(head);
		print(head);
//		Node<Integer> head1  = takeInput(); 
//		Node<Integer> head2  = takeInput();
//		Node<Integer> head   = mergeTwoSortedLL(head1, head2);
//		print(head);
		//Node<Integer> midData = mid(head);
		//System.out.println(midData.data);
		//print(head);
	}

}
