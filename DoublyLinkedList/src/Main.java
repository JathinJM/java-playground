
public class Main {
public static void main(String[] args) {
	IntDLinkedList intDLinkedList = new IntDLinkedList(10);
	intDLinkedList.insertNode(20);
	intDLinkedList.insertNode(30);
	intDLinkedList.showList();
	intDLinkedList.deleteItem(20);
	intDLinkedList.showList();
}
}
