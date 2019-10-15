import java.util.Scanner;
public class Exercise04_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the social security #(xxx-xx-xxxx): ");
		String num = input.next();
		
		
		if (num.length() != 11) {
			System.out.print(num + " is an invalid social security number");
			System.exit(0);
		}	
		
		String x = num.substring(3,4);
		String y = num.substring(6,7);
		
		
		
		if (x.equals("-") & y.equals("-")) {
			System.out.print(num + " is a valid social security number");
		}else 
			System.out.print(num + " is an invalid social security number");
	}

}
