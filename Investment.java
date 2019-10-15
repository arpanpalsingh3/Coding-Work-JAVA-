import java.util.Scanner;
public class Investment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the investment ammount, interest rate and number of years: ");
		double invest = input.nextDouble();
		double intrest = input.nextDouble();
		intrest = intrest/100;
		double years = input.nextInt();
		double c = Math.pow((1+intrest/12), years*12);
		double total = invest * c;
		
		System.out.print(total);
		
		
		
		
		
		
		
		
	}

}
