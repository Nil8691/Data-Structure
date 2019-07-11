package Queue;

public class CQueueUsingArray {
	
	int arr[] = new int[10];
	int front = -1, rear = -1;
	
	private void enqueue(int data) {
		if((rear+1)%10 == front) {
			System.out.println("Queue is full");
			return;
		}
		else {
			rear = (rear + 1)%10;
			arr[rear] = data;
			if(front < 0) {
				front++;
			}
			return ;
		}
	}
	
	private void dequeue() {
		
		if(front < 0) {
			System.out.println("Queue are Empty");
			return;
		}
		front = (front+1)%10; 
	}
	
	private void display() {
		if(front < 0) {
			System.out.println("Queue are Empty");
			return;
		}
		int j = front;
		for(int i = 0; i<= 9 ; i++) {
			System.out.print(arr[j%10]+"\t");
			j++;
		}
	}
	public static void main(String[] args) {
		
		CQueueUsingArray cq = new CQueueUsingArray();
		cq.enqueue(12);
		cq.enqueue(13);
		cq.enqueue(14);
		cq.enqueue(15);
		cq.enqueue(16);
		cq.enqueue(17);
		cq.enqueue(18);
		cq.enqueue(19);
		cq.enqueue(20);
		cq.enqueue(21);
		cq.display();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.enqueue(22);
		cq.enqueue(23);
		cq.enqueue(24);
		cq.enqueue(25);
		cq.enqueue(26);
		System.out.println();
		cq.display();
	}

}
