import java.util.Scanner;

public class Exercise04_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Give me a letter: ");
		String letter = input.next();
		if (letter.charAt(0) >= 'A' && letter.charAt(0) <= 'Z' ||letter.charAt(0) >= 'a' && letter.charAt(0) <= 'z') {
			if ((letter.equalsIgnoreCase("a") || (letter.equalsIgnoreCase("e") ||(letter.equalsIgnoreCase("i") ||(letter.equalsIgnoreCase("o") ||(letter.equalsIgnoreCase("u"))))))) {
				System.out.print(letter + " is a vowel");
				
			}else 
				System.out.print(letter + " is a consonant");
		}else 
			System.out.print(letter + " is an invalid input");
			
		

	}

}
