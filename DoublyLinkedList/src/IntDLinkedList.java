public class IntDLinkedList {
	private Node head;

	public class Node {
		private int value;
		private Node prev;
		private Node next;
	}

	public IntDLinkedList(int item) {
		head = new Node();
		head.value = item;
		head.prev = null;
		head.next = null;
	}

	public boolean insertNode(int item) {
		Node n = new Node();
		n.value = item;
		n.prev = null; 	
		head.prev = n;
		n.next = head;
		head = n;
		return true;
	}

	public boolean deleteItem(int item) {
		if (head.next.value == item) {
			head.next = head.next.next;
			return true;
		} else {
			Node x;
			Node y;
			x = head;
			y = head.next;
			while (true) {
				if (y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.next;
				}
			}
			if (y != null) {
				x.next = y.next;
				return true;
			} else {
				return true;
			}
		}

	}



	public void showList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.value);
			n = n.next;
		}

	}
}
