import java.util.Scanner;
public class Exercise06_23 {

	public static int count(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i) == a) {
		        count++;
		    }
		}return count;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = input.nextLine();
		System.out.println("What is the char: ");
		char b  = input.next().charAt(0);
		
		
		System.out.println(count(a, b));
		

	}

}
