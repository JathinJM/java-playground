
public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("deepak", 24);
		Person p2 = new Person("alive", 55);
		Person p3 = new Person("uraga", 23);
		Person p4 = new Person("adam", 34);
		Person p5 = new Person("adam1", 34);
		Person p6 = new Person("john", 18);
		BST bst = new BST();

		bst.insertItem(p1);
		bst.insertItem(p2);
		bst.insertItem(p3);
		bst.insertItem(p4);
		bst.insertItem(p5);
		bst.insertItem(p6);
		System.out.println("============");
		/*
		 * bst.insertItemOnAge(p1); bst.insertItemOnAge(p2); bst.insertItemOnAge(p3);
		 * bst.insertItemOnAge(p4); bst.insertItemOnAge(p5);
		 */

	    bst.showAll(bst.findNode("deepak"));
		Person p = bst.getData(bst.findParentNode("alive"));
		System.out.println(p.toString());
		
	}
}
