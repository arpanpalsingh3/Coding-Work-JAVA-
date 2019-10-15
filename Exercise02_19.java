import java.util.Scanner;
public class Exercise02_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Give me the first quordinate: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Give me the second quordinate: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.print("Give me the third quordinate: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double a = Math.pow((x2-x1),2);
		double b = Math.pow((y2-y1),2);
		double side1 = Math.pow((a+b),.5);
		double c = Math.pow((x3-x1),2);
		double d = Math.pow((y3-y1),2);
		double side2 = Math.pow((c+d),.5);
		double e = Math.pow((x3-x2),2);
		double f = Math.pow((y3-y2),2);
		double side3 = Math.pow((e+f),.5);
		double s = (side1+side2+side3)/2;
		double g = (s*(s-side1)*(s-side2)*(s-side3));
		double area = Math.pow(g , .5);
		System.out.print(area);
	}

}
