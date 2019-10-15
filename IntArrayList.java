

public class IntArrayList {

	public static void main(String[] args) {
	ArrayIntList list = new ArrayIntList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	list.add(9);
	list.add(10);
	System.out.println(list.subList(2, 7));
	System.out.println(list);
	int[] list2 = {1, 2, 3, 4 ,5 ,6 ,7 ,8 ,9, 10};
	System.out.println(list.equals(list2));
	System.out.println(list.contains(1));
	System.out.println(list.contains(11));
	list.addAll(list2);
	System.out.println(list);
	list.addAll(3, list2);
	System.out.println(list);
	}
	
}
