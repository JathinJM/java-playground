
public class Main {
public static void main(String[] args) {
		/*
		 * IntLinkedList intLinkedList = new IntLinkedList();
		 * intLinkedList.insertNode(20); intLinkedList.insertNode(10);
		 * intLinkedList.insertNode(30); intLinkedList.showList();
		 * System.out.println("========="); //intLinkedList.deleteItem(30);
		 * intLinkedList.reverseList(); System.out.println("=========");
		 * intLinkedList.showList();
		 * 
		 * System.out.println("========="); intLinkedList.sortList();
		 * intLinkedList.showList();
		 */
	Person person = new Person("kumar","12344");
	Person person1 = new Person("ritwik","45667");

	Person person2 = new Person("stephen","45667");
	
	PersonLinkedList personLinkedList  = new PersonLinkedList(person);
	personLinkedList.insertNode(person1);
	personLinkedList.insertNode(person2);
	personLinkedList.showList();
	personLinkedList.deleteItem("kumar");
	personLinkedList.showList();
}
}
