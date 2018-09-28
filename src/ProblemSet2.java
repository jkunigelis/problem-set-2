/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

import java.util.Scanner;


public class ProblemSet2 {
	private static Scanner in = new Scanner(System.in);
	
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
		in.close();
	}
	
	public void sayHello() {
		System.out.println("Type First and Last Name followed by pressing \"Enter\"");
		
		String fNamelName = in.nextLine();
		System.out.println("\nHello," + " " + fNamelName);
	}
	
	public void gradeMe() {
		System.out.println("Please enter your 1st homework grade.");
		float hwGrade1 = in.nextFloat();
		System.out.println("Please enter your 2nd homework grade.");
		float hwGrade2 = in.nextFloat();
		System.out.println("Please enter your 3rd homework grade.");
		float hwGrade3 = in.nextFloat();
		float hwGrade = (hwGrade1 + hwGrade2 + hwGrade3) / 3;
		
		System.out.println("Please enter your 1st quiz grade.");
		float quizGrade1 = in.nextFloat();
		System.out.println("Please enter your 2nd quiz grade.");
		float quizGrade2 = in.nextFloat();
		System.out.println("Please enter your 3rd quiz grade.");
		float quizGrade3 = in.nextFloat();
		float quizGrade = (quizGrade1 + quizGrade2 + quizGrade3) / 3;
		
		System.out.println("Please enter your 1st test grade.");
		float testGrade1 = in.nextFloat();
		System.out.println("Please enter your 2nd test grade.");
		float testGrade2 = in.nextFloat();
		System.out.println("Please enter your 3rd test grade.");
		float testGrade3 = in.nextFloat();
		float testGrade = (testGrade1 + testGrade2 + testGrade3) / 3;

		double average1 = (((testGrade / 100.0000) * .5500) + ((quizGrade / 100.0000) * .3000) + ((hwGrade / 100.0000) * .1500));
		double average = average1 * 100;
		System.out.println("Your average is " + average);
		
	}
	
	public void groupUs() {
		System.out.println("Enter number of teachers.");
		int numTeachers = in.nextInt();
		
		System.out.println("Enter number of students.");
		int numStudents = in.nextInt();
		
		float numBus = ((numStudents + numTeachers) / (float)47);
		double extra = (numStudents + numTeachers) % 47.000;
		if (numBus % 1 != 0) {
		    numBus++;
		}
		System.out.println("There will be " + ((int)numBus)  +  " " + "buses required with " + (int)(((numBus - 1) % (numTeachers + numStudents))) + " " + "buses full and " + (int)(extra) + " people on a left over not filled bus.");
		
  
	}
	
	public void info() {
		System.out.println("Enter first name.");
		String fName1 = in.next();

		System.out.println("\nEnter last name.");
		String lName1 = in.next();

		System.out.println("Enter grade.");
		int grade1 = in.nextInt();

		System.out.println("Enter age.");
		int age1 = in.nextInt();
		in.nextLine();

		System.out.println("Enter hometown.");
		String hometown1 = in.nextLine();

		System.out.println("NAME: " + fName1 + " " + lName1 + "\nGRADE: " + grade1 + "\nAGE: " + age1 + "\nHOMETOWN: " + hometown1);
	}
	
	public void initials() {
		System.out.println("Enter first name.");
		String fName1 = in.nextLine();

		System.out.println("Enter middle name.");
		String mName1 = in.nextLine();

		System.out.println("Enter last name.");
		String lName1 = in.nextLine();

		String newFNAME = fName1.substring(0,1);
		String newMNAME = mName1.substring(0,1);
		String newLNAME = lName1.substring(0,1);

		System.out.println("Your initials are " + newFNAME + newMNAME + newLNAME);


	}
}
