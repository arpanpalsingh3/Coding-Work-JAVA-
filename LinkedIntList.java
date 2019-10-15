
public class LinkedIntList {
private ListNode front;
public LinkedIntList(){
	front=null;
}
public void add(int value){
	if(front==null){
		front=new ListNode(value);
	}
	else{
		ListNode current=front;
		while(current.next!=null){
			current=current.next;
		}
		current.next=new ListNode(value);
	}
	
	
}
public void print(){
	if(front == null ) {
		System.out.println("Empty List");
		return;
	}
	ListNode current=front;
	//String result=" ";
	while(current.next!=null){
		//result=result+current.data;
		System.out.print(current.data+ ",");
		current=current.next;
		
	}
	System.out.println(current.data);
	//return result;
}
public void add(int value,int index){
	
	if(index==0){
		front=new ListNode(value,front);
	}
	else
	{
		ListNode current=front;
		for(int i=0;i<index-1;i++){
			current=current.next;
		}
		current.next=new ListNode(value,current.next);
	}
}
public int get(int index){
	ListNode current=front;
	for(int i=0;i<index;i++){
		current=current.next;
	}
	return current.data;
}
public void remove(int index){
	if(index==0){
		front=front.next;
	}
	else{
		ListNode current=front;
		for(int i=0;i<index-1;i++){
			current=current.next;
		}
		current.next=current.next.next;
	}
}
public void addSorted(int value){
	if(front==null||value<front.data){
		front=new ListNode(value,front);
	}
	else{
		ListNode current=front;
		while(current.next!=null&&current.next.data<value){
			current=current.next;
		}
		current.next=new ListNode(value,current.next);
		
	}
}
public int size() {
	ListNode current = front;
	int count = 1;
	while (current.next!= null ) {
		current = current.next;
		count++;
	}
	return count;
}
public boolean isEmpty() {
	if (front == null) 
		return true;
	else {return false;}
}
public void clear() {
	while(front != null) {
		front = front.next;
	}
}
public boolean contains(int x) {
	ListNode current = front;
	while(current != null) {
		if (current.data == x) {
			return true;
		}else {
			current = current.next;
		}
	}
	return false;
}
public int indexOf(int value) {
	ListNode current = front;
	int count = -1;
	while(current != null) {
		count++;
		if(current.data == value) {
			return count;
		}
		current = current.next;
	}return -1;
}
}
