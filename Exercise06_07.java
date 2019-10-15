import java.util.Scanner;
public class Exercise06_07 {

	public static double futureInvestmentValue(double investmentAmount, double intrestRate, int years) {
		double c = Math.pow((1+(intrestRate/12)), (years*12));
		double total = investmentAmount * c;
		return total;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Investment and Interest rate:");
		double investment = input.nextDouble();
		double intrest = (input.nextDouble());
		intrest = intrest/100;
		for (int i = 1; i <= 30; i++) {
			System.out.println(i + " " +futureInvestmentValue(investment, intrest, i));
		}

	}

}
