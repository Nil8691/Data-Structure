package Queue;

public class QueueUsingArray {

	int arr[] = new int[10];
	int front = -1, rear = -1;
	
	private void enqueue(int data) {
		if(rear == 9 ) {
			System.out.println("Queue is full");
			return;
		}
		rear++;
		arr[rear] = data;
		if(front < 0) {
			front++;
		}
	}
	
	private void dequeue() {
		
		if(front < 0) {
			System.out.println("Queue are Empty");
			return;
		}
		for(int i = front;i < rear;i++) {
			arr[i] = arr[i+1];
		}
		rear--;
		if(rear < 0) {
			front--;
		}
	}
	
	private void display() {
		if(front < 0) {
			System.out.println("Queue are Empty");
			return;
		}
		for(int i = front; i<= rear ; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		QueueUsingArray qa = new QueueUsingArray();
		qa.enqueue(12);
		qa.enqueue(13);
		qa.enqueue(14);
		qa.enqueue(15);
		qa.enqueue(16);
		qa.dequeue();
		qa.display();
	}

}
