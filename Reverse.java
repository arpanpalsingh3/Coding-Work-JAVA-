import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
			ArrayList<String> list = new ArrayList();
			list.add("red");
			list.add("blue");
			list.add("green");
			list.add("orange");
			list.add("yellow");
			list.add("purple");
			Reverse(list);
			
			System.out.print(list);
	}
		
	

	private static void Reverse(ArrayList<String> list) {
		int end;
		StringBuilder place1 = new StringBuilder();
		end = list.size()-1;
			for(int i=0; i < list.size()/2; i++) {
				Collections.swap(list, i, end);
				end--;
			}
			for(int i = 0; i < list.size();i++) {
				place1.append(list.get(i));
				place1.reverse();
				list.set(i, place1.toString());
				place1.setLength(0);
				
			}
			
		
			
		}
		
	}

		
		
		


		
	
	

