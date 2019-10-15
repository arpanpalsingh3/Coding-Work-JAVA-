import java.util.Scanner;
public class Exercise02_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many minutes:");
		long mins = input.nextLong();
		        
		double totDays = mins /(24*60);
		long years = (long)totDays / 365;
		long days = (long)totDays % 365;
		System.out.println(mins + " is approximately "+ years+ " years and " + days+ " days ");                   
		// TODO Auto-generated method stub

	}

}
