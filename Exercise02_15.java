
import java.util.Scanner;
public class Exercise02_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Give me the first quordinate: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Give me the second quordinate: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double a = Math.pow((x2-x1),2);
		double b = Math.pow((y2-y1),2);
		double distance = Math.pow((a+b),.5);
		
		System.out.print(distance);
	}

}
