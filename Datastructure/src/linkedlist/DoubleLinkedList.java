package linkedlist;

class Double{
	int data;
	Double left;
	Double right;
	
	public Double(int dat) {
		data = dat;
		left = null;
		right = null;
		
	}
}


public class DoubleLinkedList {
	
	Double head;
	
	public void append(int data) {
		Double temp = head;
		Double new_node = new Double(data); 
		if(head == null) {
			head = new_node;
		}
		else {
			while(temp.right != null) {
				temp = temp.right;
			}
			new_node.left = temp;
			temp.right = new_node;
		}
		return;
	}
	
	public void display() {
		Double temp = head;
		if(temp == null) {
			System.out.println("No Data Available in List");
		}
		else {
			while(temp.right != null) {
				temp = temp.right;
			}
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.left;
			}
		}
		return;
	}
	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.append(17);
		dll.append(16);
		dll.append(15);
		dll.append(14);
		dll.append(13);
		dll.display();
	}

}
