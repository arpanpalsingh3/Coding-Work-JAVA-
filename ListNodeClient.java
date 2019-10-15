
public class ListNodeClient {
public static void main(String[] args){
	LinkedIntList list=new LinkedIntList();
	//list.addSorted(4);
	list.add(5);
	list.add(6);
	list.add(45);
	list.add(8,2);
	list.add(8);
	//System.out.println("Value at index 0 is"+list.get(0));
	
	//list.addSorted(17);
	list.print();
	System.out.println(list.size());
	System.out.println(list.isEmpty());
	//list.clear();
	list.print();
	System.out.println(list.isEmpty());
	System.out.println(list.contains(45));
	System.out.println(list.contains(0));
	System.out.println(list.indexOf(8));
}
}
