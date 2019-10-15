
import java.util.Scanner;
public class Exercise03_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Give me 2 coordinates: ");
		double p1 = input.nextDouble();
		double p2 = input.nextDouble();
		double a = Math.abs(p1);
		double b = Math.abs(p2);
		if (a <= 5 && b <= (5.0/2.0)) 
			System.out.print("The point is in the rectangle");
		else 
			System.out.print("The point is not in the rectangle");

	}

}
