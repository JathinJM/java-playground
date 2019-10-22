
public class PersonLinkedList {
	private Node head;

	public class Node {
		private Person value;
		private Node link;
	}

	public PersonLinkedList(Person person) {
		head = new Node();
		head.value = person;
		head.link = null;
	}

	public boolean insertNode(Person item) {
		Node n = new Node();
		/*
		 * n.link = head; n.value = item; head = n;
		 */
		Node newNode;
		newNode = head;
		while (newNode.link != null) {
			newNode = newNode.link;
		}
		n.value = item;
		n.link = null;
		newNode.link = n;
		return true;
	}

	public boolean deleteItem(String item) {
		if (item.equals(head.value.getName())) {
			head = head.link;
			return true;
		} else {
			Node x;
			Node y;
			x = head;
			y = head.link;
			while (y != null && !(y.value.getName().equals(item))) {
					x = y;
					y = y.link;
			}
			if (y != null) {
				x.link = y.link;
				return true;
			} else {
				return true;
			}
		}

	}

	public boolean reverseList() {
		Node node = head.link;
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.link;
			current.link = prev;
			prev = current;
			current = next;
		}
		head.link = prev;
		return true;
	}

	/*
	 * public void sortList() { int c = 0; Node a = head.link; Node b = head.link;
	 * while (a.link != null) { while (b.link != null) { if(b.value < b.link.value)
	 * { c = b.value; b.value = b.link.value; b.link.value = c; } b = b.link; } a=
	 * a.link; } }
	 */

	public void showList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.value);
			n = n.link;
		}

	}
}
