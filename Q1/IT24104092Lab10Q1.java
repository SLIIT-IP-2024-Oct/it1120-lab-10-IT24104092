import java.util.Scanner;
	public class IT24104092Lab10Q1{

		public static void main (String[] args) {
		
		//Create a Scanner object for input
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter the mark(0-100):");
		int mark = input.nextInt();

		//First Assertion - to check if the Mark is the Valid Range 
		assert (mark >= 0 && mark <=100) : "Invalid Mark";

		char grade ;
		if(mark>=75) {
		grade = 'A';
		} else if (mark>=60) {
		grade = 'B';
		} else if (mark>=50) {
		grade = 'C';
		} else if (mark>=40) {
		grade = 'D';
		} else {
		grade = 'F';
		}

		//Assertion to verify the grade assigned
		assert (mark>=75 && grade == 'A') ||
		       (mark<75 && mark>=60 && grade == 'B') ||
		       (mark<60 && mark>=50 && grade == 'C') ||
		       (mark<40 && grade == 'F') : "Incorrect Grade Assigned" ;

		System.out.println();
		System.out.println("Mark is Validate");
		System.out.println("The Grade For Enter Mark Is :" + grade);
	}
} 





























