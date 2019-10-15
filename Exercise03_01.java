import java.util.Scanner;
public class Exercise03_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What are a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = (b*b)-4*a*c;
		
		double r1 = (-b + Math.pow(((b*b)-4*a*c), .5))/(2*a);
		double r2 = (-b - Math.pow(((b*b)-4*a*c), .5))/(2*a);
		
		if (d > 0) {
			System.out.print("The equation has 2 roots at " + r1 +" and " + r2);
		}else if ( d == 0) {
				System.out.print("The equation has 1 root at " + r1);
		}else
				System.out.print("The equation has no real roots");

	}

}
