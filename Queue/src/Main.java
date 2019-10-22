import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		IntQueue intQueue = new IntQueue();
		System.out.println("Please enter a number to push to Queue:\n");
		 int [] enQueue = new int[5]; 
		 int [] deQueue = new int[4]; 
		 PersonQ personQ = new PersonQ("Kumar","12345");

		 PersonQ personQ1 = new PersonQ("Hegde","12346");
		 intQueue.enQueue(personQ);
		 intQueue.enQueue(personQ1);
		/*
		 * for(int i: enQueue) {
		 * 
		 * @SuppressWarnings("resource") Scanner sc = new Scanner(System.in);
		 * intQueue.enQueue(sc.nextInt()); }
		 */
		
		/*
		 * intQueue.enQueue(12); intQueue.enQueue(14); intQueue.enQueue(16);
		 * 
		 * intQueue.enQueue(18); intQueue.enQueue(20);
		 */
		 

		/*
		 * for (int data : intQueue.getIntQueue()) { // System.out.println(data); }
		 * System.out.println("=====================\n");
		 */
		/*
		 * for (int data : deQueue) { // System.out.println(intQueue.deQueue()); }
		 * 
		 * intQueue.enQueue(90);
		 */

		System.out.println("=====================\n");
		/*
		 * for (int data : intQueue.getIntQueue()) { // System.out.println(data); }
		 */
		
		intQueue.showAll();
		int [] arrMax = new int[107374182];
		/* Object[] array = new Object[Integer.MAX_VALUE - 8]; */
		//System.out.println(arrMax.length);
	}
}
