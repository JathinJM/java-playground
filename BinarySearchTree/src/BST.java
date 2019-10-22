public class BST {
	private Node root;

	class Node {
		private Node lc;
		private Node rc;
		private Person data;
	}

	BST() {
		root = null;
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

	public Node findNode(String key) {
		Node c = root;
		while (c != null) {
			if (key.compareTo(c.data.getName()) == 0) {
				break;
			}
			if (key.compareTo(c.data.getName()) < 0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		}
		return c;
	}

	public Node findNodeAge(Integer key) {
		Node c = root;
		while (c != null) {
			if (key.compareTo(c.data.getAge()) == 0) {
				break;

			}
			if (key.compareTo(c.data.getAge()) < 0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		}
		return c;
	}

	public void showAll(Node node) {
		Node p = node;
		if (p != null) {
			System.out.println("" + p.data);
			showAll(p.lc);
			showAll(p.rc);
		}
	}

	public boolean insertItemOnAge(Person item) {
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
			if (item.getAge().compareTo(c.data.getAge()) < 0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		}

		if (item.getAge().compareTo(p.data.getAge()) < 0) {
			p.lc = n;
		} else {
			p.rc = n;
		}

		return true;
	}

	public Node findParentNode(String key) {
		Node p = root;
		Node c = root;
		do {
			if (key.compareTo(c.data.getName()) == 0) {
				break;
			}
			p = c;
			if (key.compareTo(c.data.getName()) < 0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		} while (c != null);
		System.out.println(">>" + p.data.getName());

		if (c != null) {
			return p;
		} else {
			return null;
		}
	}

	public Person getData(Node n) {
		return n.data;
	}
}
