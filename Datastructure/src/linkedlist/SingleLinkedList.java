package linkedlist;

class Node{
	int data;
	Node next;
	
	public Node(int element) {
		data = element;
		next = null;
	}
}



public class SingleLinkedList {
	
	Node head;
	
	public void appendAtend(int data) {
		Node new_node = new Node(data);
		Node temp = head ;
		
		if(head == null) {
			head = new_node;
		}
		else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
		return;
	}
	
	public void appendAtBeg(int data) {
		Node new_node = new Node(data);
		Node temp = head ;
		new_node.next = temp;
		head = new_node;
		return;
	}
	
	private int size() {
		int lenght=0;
		Node temp = head;
		while(temp.next != null) {
			lenght++;
			temp = temp.next;
		}
		return lenght;
	}
	
	public void appendAftern(int data,int index) {
		if(size() >= index-1) {
			Node temp = head;
			Node new_node = new Node(data);
			while(index-1 > 0) {
				temp = temp.next;
				index--;
			}
			new_node.next = temp.next;
			temp.next = new_node;
			return;
		}
		else {
			System.out.println("Index are not Valid");
			return;
		}
	}
	
	public void appendBeforen(int data, int index) {
		if(size() >= index-1) {
			Node temp = head;
			Node new_node = new Node(data);
			while(index-2 > 0) {
				temp = temp.next;
				index--;
			}
			new_node.next = temp.next;
			temp.next = new_node;
			return;
		}
		else {
			System.out.println("Index are not Valid");
			return;
		}
		
	}
	
	public void delete(int index) {
		if(size() >= index-1) {
			Node temp = head;
			Node sectemp;
			while(index-2 > 0) {
				temp = temp.next;
				index--;
			}
			sectemp = temp.next;
			temp.next = sectemp.next;
			return;
		}
		else {
			System.out.println("Index are not Valid");
			return;
		}
		
	}
	
	public void reverse() {
		Node node = head;
		Node pre = null;
		while(node.next != null) {
			Node temp = node.next;
			node.next = pre;
			pre = node;
			node = temp;
		}
		node.next = pre;
		head = node;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +"\t");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		SingleLinkedList ls = new SingleLinkedList();
		ls.appendAtend(12);
		ls.appendAtend(13);
		ls.appendAtend(14);
		ls.appendAtend(15);
		ls.appendAtend(16);
		ls.appendAtBeg(1);
		ls.appendAftern(20, 5);
		ls.appendBeforen(20, 2);
		ls.display();
		System.out.println();
//		ls.delete(3);
		ls.display();
		System.out.println();
		ls.reverse();
		ls.display();
	}

}
