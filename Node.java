package linkedlist;

public class Node<T> {
	T data;
	Node<T> next; //we are using generic to store elements dynamic, and Node<t> -> becoz our ele should be of same type so add t to Node
	
	Node(T data){
		this.data = data;
	}
}

