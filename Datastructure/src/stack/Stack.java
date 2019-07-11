package stack;

public class Stack {
	
	int stack[] = new int[10];
	int top = -1;
	
	public boolean isfull() {
		if(top == 4)
			return true;
		else
			return false;
	}
	
	public boolean isempty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public void push(int data) {
		if(isfull()) {
			System.out.println("Stack is full");
		}
		else {
			top++;
			stack[top] = data;
		}
	}
	
	public void pop() {
		if(isempty()) {
			System.out.println("Stack is Empty you can't do that.");
		}
		else {
			top--;
		}
	}
	
	public void display() {
		if(isempty()) {
			System.out.println("Stack is empty");
		}
		else {
			for(int n : stack) {
				System.out.println(n + "\t");
			}
		}
	}
	public static void main(String[] args) {
		Stack st = new Stack();
		st.pop();
		st.push(12);
		st.push(13);
		st.push(14);
		st.push(15);
		st.push(16);
		st.display();
	}

}
