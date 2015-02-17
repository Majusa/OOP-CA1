public class ObjectArrayListTester {
	
	private static ObjectArrayList list;
	
	private static final Object A = new Object();
	private static final Object B = new Object();
	private static final Object C = new Object();
	
	public static void main(String[] args) {
		list = new ObjectArrayList();
		list.add(A); // Test add(Object object)
		list.add(B);
		list.add(C);
		printList();
		list.remove(1); // Test remove(int index)
		printList();
		list.add(B);
		list.remove(A); // Test remove(Object object)
		printList();
	}
	
	private static void printList() {
		if (list.contains(A)) System.out.print("A");
		if (list.contains(B)) System.out.print("B");
		if (list.contains(C)) System.out.print("C");
		System.out.println();
	}
}