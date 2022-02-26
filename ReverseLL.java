package linkedlistAssign;

import java.util.Scanner;
//we are iterate to the int we need, we reverse that LL, using reverse method, we use DoubleNode, we need head and tail from ReverseLL
//to connect to next kth LL

class DoubleNode {
	Node<Integer> head;
	Node<Integer> tail;
}

public class ReverseLL{
	
	public static Node<Integer> KReverse(Node<Integer> head, int k){
		if(head == null) {
			return head;
		}
		if(head.next == null) {
			return head;
		}
		if(k == 0) {
			return head;
		}
		
		int count = 1;
		Node<Integer> h1 = head, h2, t1 = head;
		while(count < k && t1.next != null) {
			t1 = t1.next;
			count++;
		}
		h2 = t1.next;
		t1.next = null;
		
		DoubleNode ans = reverse(h1);
		Node<Integer> secondHead = KReverse(h2, k);
		ans.tail.next = secondHead;
		return ans.head;
	}
	
	public static DoubleNode reverse(Node<Integer> head) {
		DoubleNode ans;
		if(head == null || head.next == null) {
			ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		
		DoubleNode smallHead = reverse(head.next);
		smallHead.tail.next = head;
		head.next = null;
		ans = new DoubleNode();
		ans.head = smallHead.head;
		ans.tail = head;
		return ans;
	}
	
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
			}
			data = s.nextInt();
		}
		return head;
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
	    head = KReverse(head, 4);
	    print(head);
//		print(ans.head);
	}

}

