package linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class LinkedListUse {
	//Method returning head
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		return n1;
	}
	
	//We are updating head, first head refer to n1, next we update it to temp.next, head refer to n2
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			}
		System.out.println();
	}
	
	//Printing recursively
	public static void printR(Node<Integer> head) {
		if(head == null) {
			return ;
		}
		System.out.print(head.data + " ");
		printR(head.next);
	}
	
	//Reverse Linked List
	public static Node<Integer> ReverseLL(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> smallHead = ReverseLL(head.next);
		Node<Integer> tail = head.next;
		tail.next = head;
		head.next = null;
		return smallHead;
//		while(tail.next != null) {
//			tail = tail.next;
//		}
//		tail.next = head;
//		head.next = null;
//		return smallHead;
	}
	
	public static void increment(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}
	
	//we take count from -1 as we are taking index starts from 0
	public static void printIthNode(Node<Integer> head, int i) {
		Node<Integer> temp = head;
		int count = -1;
		while(temp!=null) {
			count++;
			if(count == i) {
				System.out.println(temp.data);
			}
			temp = temp.next;
		}
	}
	
	public static int length(Node<Integer> head) {
		Node<Integer> temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	//we take input unless we enter -1;
	//we take head reference and assign null
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
				tail.next = currentNode; //we are adding current Node, to tail.next
 				tail = tail.next;        //we are updating tail...
//				Node<Integer> tail = head;
//				while(tail.next!=null) {
//					tail = tail.next;
//				}
//				//Now tail is refer to last node
//				//Connect current node after last node
//				tail.next = currentNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> Insert(Node<Integer> head, int elem, int pos) {
		Node<Integer> nodeToBeInserted = new Node<Integer>(elem);
		//We are returning the head;
		//while we are adding ele before the head...
		if(pos == 0) {
			nodeToBeInserted.next = head;
			return nodeToBeInserted;
		}else {
			int count = 0;
			Node<Integer> prev = head;
			//while loop stops when count equals to pos-1,
		    // we are taking prev!=null, becoz we are avoiding to add ele at invalid index.
			while(count < pos-1 && prev!=null) {
				count++;
				prev = prev.next;
			}
			//if prev is not equal to null we add, 
			if(prev != null) {
				nodeToBeInserted.next = prev.next;
				prev.next = nodeToBeInserted;
			}
		}
		return head;
	}
	
	//Insert Ele recursively
	public static Node<Integer> InsertR(Node<Integer> head, int ele, int pos){
		if(head == null && pos > 0) {
			return null;
		}
		
		if(pos == 0) {
			Node<Integer> nodeToBeInserted = new Node<>(ele);
			nodeToBeInserted.next = head; 
			return nodeToBeInserted;
		}else {
			Node<Integer> smallhead = InsertR(head.next, ele, pos-1);
			head.next = smallhead; //This statement is very Imp
			return head;
		}
	}
	
	public static Node<Integer> Delete(Node<Integer> head, int pos){
		//if our head is null return null
		if(head == null) {
			return null;
		}
		
		Node<Integer> prev = head;
		//we need to check our next ele should not be null
		//if we are deleting head node...
		if(pos == 0 && prev.next != null) {
			head = prev.next;
			return head;
		}else {
			int count = 0;
			while(count < pos-1 && prev.next != null) {
				count++;
				prev = prev.next;
			}
			if(prev.next!=null) {
				prev.next = prev.next.next;
			}
			//if our next ele is null return head;
			if(prev.next == null) {
				return head;
			}
		}
		return head;
	}
	
	public static Node<Integer> DeleteR(Node<Integer> head, int pos){
		if(head == null) {
			return null;
		}
		if(pos == 0) {
			return head.next;
		}else {
			Node<Integer> smallHead = DeleteR(head.next, pos-1);
			head.next = smallHead;
			return head;
		}
	}
	//1st Assignment question
	public static int findNode(Node<Integer> head, int n) {
		Node<Integer> temp = head;
		int count = -1;
		while(temp!=null) {
			count++;
			if(temp.data == n) {
				return count;
			}
			temp = temp.next;
		}
		return -1;
	}
	
	//2nd Assignment question
	public static Node<Integer> appendLastNtoFirst(Node<Integer> head, int n){
		 if(n == 0) {
			 return head;                //we calcuate total length, we take new count as total length - n;
		 }								 //we traverse through new count, newcount.next is newHead, tail become newcount
		 								 //and we make tail.next none, we traverse from newHead, at last we link our old head...
		 Node<Integer> temp = head;
		 int count = 0;
		 while(temp!=null) {
			 count++;
			 temp = temp.next;
		 }
		 //to handle invalid n, if we have 3 ele in LL but n is given 4, it is invalid we return head...
		 if(count < n){
			 return head;
	     }
		 
		 int newCount = count - n;
		 count = 0;
		 Node<Integer> temp1 = head;
		 while(count < newCount - 1) {
			 temp1 = temp1.next;
			 count++;
		 }
		 Node<Integer> newHead = temp1.next;
		 Node<Integer> tail    = temp1;
		 Node<Integer> temp3 = newHead;
		 while(temp3.next != null) {
			 temp3 = temp3.next;
		 }
		 temp3.next = head;
		 tail.next = null;
		 
		 return newHead;
	}
	
	//3rd Assignment question
	public static Node<Integer> removeDuplicates(Node<Integer> head){
		if(head == null) {
			return null;
		}
		Node<Integer> t1 = head;
		while(t1.next != null) {
			if(t1.next.data.equals(t1.data)) {
				t1.next = t1.next.next;
			}else {
				t1 = t1.next;
			}
		}
		return head;
	}
	
	//4th Assignment question
	public static void printReverse(Node<Integer> head) {
		//Your code goes here
       if(head==null)
            return;
        printReverse(head.next);
        System.out.print(head.data+" ");
	}
	
	//5th Assignment question
	public static boolean isPalindrome(Node<Integer> head) {
		Node<Integer> temp = head;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(temp != null) {
			arr.add(temp.data);
			temp = temp.next;
		}
		int start = 0, end = arr.size() - 1;
		while(start < end) {
			if(arr.get(start) != arr.get(end)) {
				return false;
			}else {
				start++;
				end--;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();//createLinkedList();
		head = ReverseLL(head);
//		head = Delete(head, 2);
//		head = Insert(head, 20, 2);
		printR(head);
//		System.out.println(isPalindrome(head));
//		head = removeDuplicates(head);
//		print(head);
//		head = appendLastNtoFirst(head, 3);
//		print(head);
		//System.out.println(findNode(head, 3));
		//print(head);
		//head = Insert(head, 0, 0);
		//print(head);
		//head = Delete(head, 5);
		//print(head);
	}

}
