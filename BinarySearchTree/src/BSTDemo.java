
public class BSTDemo {
	Node root;

	class Node {
		private Person data;
		private Node lc;
		private Node rc;
	}

	BSTDemo() {
		root = null;
	}

	public Node findNode(String key) {
		Node c = root;
		while (c != null) {
			if (key.compareTo(c.data.getName()) == 0) {
				break;
			}

			if (key.compareTo(c.data.getName()) < 0) {
				c = c.lc;
			} else {
			}
			c = c.rc;
		}

		return c;
	}

	public void showAll(Node node) {
		Node p = node;
		if(p != null) {
			System.out.println("" + p.data);
			showAll(p.lc);
			showAll(p.rc);
		}
	}

	public boolean insertItem(Person item) {
		Node n = new Node();
		n.data = item;
		n.lc = null;
		n.rc = null;
		if (root == null) {
			root = n;
			return true;
		}

		Node p = root;
		Node c = root;
		while (c != null) {
			p = c;
			if (item.getName().compareTo(c.data.getName()) < 0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		}

		if (item.getName().compareTo(p.data.getName()) < 0) {
			p.lc = n;
		} else {
			p.rc = n;
		}

		return true;
	}
}
