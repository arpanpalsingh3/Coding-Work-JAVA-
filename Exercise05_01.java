import java.util.Scanner;
public class Exercise05_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int in = input.nextInt();
		int posCount = 0;
		int negCount = 0;
		float total = 0;
		int count = 0;
		double  average = 0;
		
		if (in == 0) {
			System.out.println("No numbers were entered except 0" );
			System.exit(0);
		}
		while (in != 0 ) {
			if (in > 0) {
				posCount++;
				total += in;
				count++;
				in = input.nextInt();
			}else {
				negCount++;
				total += in;
				count++;
				in = input.nextInt();
			
			}
		}System.out.println("The number of positives is " + posCount);
		System.out.println("The number of negatives is "+ negCount);
		System.out.println("The total is "+ total);
		average = (total/ count) ;
		System.out.println("The average is " + average);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}