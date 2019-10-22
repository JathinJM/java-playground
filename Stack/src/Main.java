import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		System.out.println("hello World");
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.forEach(data -> {
			System.out.println(data);
		});

		IntStack intStack = new IntStack();
		int[] stackDisplay;
		if (!intStack.isFull()) {
			intStack.push(10);
			intStack.push(20);
			intStack.push(30);
			intStack.push(40);
		}
		if (intStack.getStackArray().length > 0) {
			for (int data : intStack.getStackArray()) {
				if(data!=0)
				System.out.println(data);
			}
		}
		
		System.out.println(intStack.pop());
		PersonStack personStack = new PersonStack();
		Person person = new Person("kumar","12344");
		personStack.push(person);
		Person person1 = new Person("ritwik","45667");
		personStack.push(person1);
		
		if (personStack.getStackArray().length > 0) {
			for (Person data : personStack.getStackArray()) {
				if(data!=null)
				System.out.println(data);
			}
		}
		System.out.println(personStack.pop());
	}
}
