
public class IntQueue {
	private PersonQ[] intQueue;
	private int size;
	private int total;
	private int front;
	private int rear;

	public IntQueue() {
		size = 5;
		total = 0;
		front = 0;
		rear = 0;
		intQueue = new PersonQ[5];
	}

	public boolean isFull() {
		return (total == size);
	}

	public boolean isEmpty() {
		return (total == 0);
	}

	public PersonQ[] getIntQueue() {
		return intQueue;
	}

	public boolean enQueue(PersonQ item) {
		boolean isTrue = false;
		try {
			if (isFull()) {
				isTrue = false;
			} else {
				total++;
				intQueue[rear] = item;
				rear = (rear + 1) % size;
				isTrue = true;
			}
		} catch (Exception e) {
			System.out.println("Queue is Full");
		}
		return isTrue;

	}

	public PersonQ deQueue() {
		PersonQ item = null;
		if (!isEmpty()) {
			item = intQueue[front];
			total--;
			front = (front + 1) % size;
		}
		return item;
	}

	public void showAll() {
		int f = front;
		if (total != 0) {
			for (int i = 0; i < total; i++) {
System.out.println(" "+intQueue[f] );
f++;
			}
		}
	}

}
