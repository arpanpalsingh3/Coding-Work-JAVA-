
import java.util.ArrayList;


public class ArrayIntList {
	
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

	// fields
	int[] list;
	int size;

	// constructor
	public ArrayIntList() {
		list = new int[1000];
		size = 0;
	}

	public void add(int value) {

		list[size] = value;

		size++;
	

	}
	public void addAll(int[] a) {
		for(int i = 0; i < a.length; i++) {
			list[size] = a[i];
			size ++;
			
			
		}
	}
	public void addAll(int b ,int[] a) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i = b; i < size; i++) {
			arrayList.add(list[i]); 
		}
		for(int i = 0; i < a.length; i++) {
			list[b] = a[i];
			b++;
			size++;
		}
		for(int i = 0; i < arrayList.size(); i++) {
			list[size -arrayList.size() + i] = arrayList.get(i);
		}
	}

	public void remove(int index) {

		for (int i = index; i < size; i++) {
			list[i] = list[i + 1];
		}
		if (index < size) {
			size--;
		}
	}

	public String toString() {
		String result = "[";
		for (int i = 0; i < size; i++) {
			result += list[i];
			if (i != size - 1) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}
	public ArrayList<Integer> subList(int from, int to) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i = from-1; i < to-1; i++) {
			arrayList.add(list[i]);
		}
		return arrayList;
	}
	public boolean equals(int[] a) {
		boolean status = false;
		if (size == a.length) {
			for (int i = size-1; i != 0; i--) {
				if (list[i] == a[i]) {
					status = true;
				}else {
					return false;
				}
			}
		}
		return status;
	}
	public boolean contains(int a) {
		for (int i = 0; i < size-1; i++) {
			if (list[i] == a) 
				return true;
			
		}return false;
	}


}
