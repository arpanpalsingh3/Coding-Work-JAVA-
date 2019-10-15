import java.util.Scanner;
public class Exercise07_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are there: ");
		int stu= input.nextInt();
		int [] scores = new int[stu];
		System.out.println("What are the scores: ");
		for(int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();}
		int best =0; 
		char grade;
		for(int i = 0; i < scores.length-1; i++) {
			if (scores[i]> scores[i+1]) {
				best = scores[i];
			}else
				best = scores[i+1];}
		for( int i = 0; i< scores.length; i ++) {
			if(scores[i] >= best - 10) {
				grade = 'A';
				System.out.println("Student "+ i + " score is "+ scores[i]+ " and grade is "+ grade);
			}else if (scores[i] >= best -20 ) {
				grade = 'B';
				System.out.println("Student "+ i + " score is "+ scores[i]+ " and grade is "+ grade);
			}else if (scores[i] >= best - 30) {
				grade = 'C';
				System.out.println("Student "+ i + " score is "+ scores[i]+ " and grade is "+ grade);
			}else if (scores[i] >= best -40 ) {
				grade = 'D';
				System.out.println("Student "+ i + " score is "+ scores[i]+ " and grade is "+ grade);
			}else {
				grade = 'F';
				System.out.println("Student "+ i + " score is "+ scores[i]+ " and grade is "+ grade);
			}
		}
		
		
		

	}

}
