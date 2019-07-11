package Queue;

public class QueueUsingSingleLinkedList {
	
	class Queue{
		int data;
		Queue right;
		public Queue(int data) {
			this.data = data;
			right = null;
		}
	}
	
	Queue head;
	Queue rear;
	public void Enqueue(int data) {
		Queue new_qu = new Queue(data);
		if(head == null) {
			head = new_qu;
			rear = new_qu;
		}
		else {
			rear.right = new_qu;
			rear = new_qu;
		}
		return;
	}
	
	public void Dequeue() {
		Queue temp = head;
		if(head == null) {
			System.out.println("Queue are Empty.");
		}
		else {
			head = temp.right;
		}
		return;
	}
	
	public void display() {
		Queue temp = head;
		while(temp != null) {
			System.out.print(temp.data +"\t");
			temp = temp.right;
		}
	}
	public static void main(String[] args) {
		QueueUsingSingleLinkedList qu = new QueueUsingSingleLinkedList();
		qu.Enqueue(12);
		qu.Enqueue(13);
		qu.Enqueue(14);
		qu.Enqueue(15);
		qu.display();
		qu.Dequeue();
		qu.display();

	}

}
