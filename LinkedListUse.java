package linkedlistAssign;

import java.util.Scanner;

public class LinkedListUse {
	
	//1st Assignment problem
	public static int FindNode(Node<Integer> head, int n) {
		return helper(head, n, 0);
	}
	
	public static int helper(Node<Integer> head, int n, int pos) {
		if(head == null) {
			return -1;
		}
		
		if(head.data == n) {
			return pos;
		}
		
		int ans = helper(head.next, n, pos + 1);
		return ans;
	}
	
	//2nd Assignment Problem
	public static Node<Integer> evenAfterOdd(Node<Integer> head){
		//we need to place all odd first in a given manner and all even second
		//we create two LL, we take oddH, oddT, evenH, evenT initialise with null
		//we loop the LL,if we found odd, we check whether oddH is Null or not, if yes we create node, we assign oddT to oddH;
		//else, we link odd.next with temp, we increment temp..
		//we loop the LL,if we found even, we check whether evenH is Null or not, if yes we create node, we assign evenT to evenH;
		//else, we link even.next with temp, we increment temp.
		//we link both Linked List according conditions
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> oddH = null, oddT = null, evenH = null, evenT = null, temp = head;
		while(temp != null) {
			if(temp.data%2 != 0) { //if we found odd num we create a node of oddH and we refer oddT to oddH
				if(oddH == null) {
					oddH = new Node<Integer>(temp.data);
					oddT = oddH;
				}else {
					oddT.next = temp;
					oddT = oddT.next;
				}
			}else {
				if(evenH == null) {
					evenH = new Node<Integer>(temp.data);
					evenT = evenH;
				}else {
					evenT.next = temp;
					evenT = evenT.next;
				}
			}
			temp = temp.next;
		}
		
		if(oddH == null) {
			return evenH;
		}else if(evenT == null) {
			head = oddH;
		}else if(oddH != null && evenH != null) {
			oddT.next = evenH;
			head = oddH;
			evenT.next = null;
		}
		return head;
	}
	
	//3rd Assignment Problem
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N){
		if(head == null) {
			return head;
		}
		if(M==0) {
            return null;
		}
        if(N==0) {
            return head;
        }
        Node<Integer> curNode = head, t1;
        int count;
        while(curNode != null) {
        	count = 1;
        	while(count < M && curNode!=null) {
        		curNode = curNode.next;
        		count++;
        	}
        	if(curNode == null) {
        		return head;
        	}
        	t1 = curNode.next;
        	count = 1;
        	while(count <= N && t1 != null) {
        		t1 = t1.next;
        		count++;
        	}
        	curNode.next = t1;
        	curNode = t1;
        }
        return head;
	}
	
	//4th Assignment Problem
	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j){
		if(head == null || head.next == null){
            return head;
        }
        
        // if(i == 0 || j == 0){
        //     return head;
        // }
        Node<Integer> prev1 = null, prev2 = null, cur1 = null, cur2 = null, temp = null, next1 = null,next2 = null;
        prev1 = head;
        int m = 0, n = 0;
        if(i == 0){
            prev1 = null;
            cur1 = head;
            
        }else{
        	while(m < i-1 && prev1 != null){
            	prev1 = prev1.next;
            	m++;
        	}
        	cur1 = prev1.next;
        }
        next1 = cur1.next;
        
        prev2 = head;
        if(j == 0){
            
            prev2 = null;
            cur2 = head;
            
        }else{
            
            while(n < j-1 && prev2 != null){
                prev2 = prev2.next;
                n++;
        	}
        	cur2 = prev2.next;
            
        }
        next2 = cur2.next;
        
        if(i == 0){
            prev2.next = cur1;
            cur1.next = next2;
            cur2.next=next1;
            head = cur2;
            return head;
        }
        
        if(j == 0){
            
            prev1.next = cur2;
             cur1.next = next2;
            cur2.next= next1;
            head = cur1;
            return head;
            
        }
        if(i < j){
        	prev1.next = cur2;
        	prev2.next = cur1;
        	temp = cur2.next;
        	cur2.next = cur1.next;
        	cur1.next = temp;
        }else{
            prev2.next = cur1;
        	prev1.next = cur2;
        	temp = cur1.next;
        	cur1.next = next2;
        	cur2.next = next1;
        }
        return head;
	}
	
	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<>(data); 
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
		head = swapNodes(head, 0, 6);
		print(head);
//		head = skipMdeleteN(head, 2, 2);
//		Node<Integer> oddH = evenAfterOdd(head);
//		print(oddH);
		//System.out.println(FindNode(head, 3));
		//print(head);
	}

}
