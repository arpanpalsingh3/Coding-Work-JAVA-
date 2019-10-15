import java.util.Scanner;
public class Exercise04_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many sides: ");
		double n = input.nextInt();
		System.out.print("What is the side length: ");
		double s = input.nextDouble();
		double area;
		
		area = (n * (s*s))/ (4* (Math.tan(Math.PI/n)));
		
		System.out.print("The area of the Polygon is "+ area);

	}

}
